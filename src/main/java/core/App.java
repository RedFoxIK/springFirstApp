package core;

import beans.Client;
import com.sun.istack.internal.NotNull;
import loggers.*;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class App {
    private Client client;
    private EventLogger defaultLogger;
    private Map<EventType, EventLogger> loggers;

    public App(EventLogger defaultLogger, Map<EventType, EventLogger> loggers) {
        this.defaultLogger = defaultLogger;
        this.loggers = loggers;
    }

    @Required
    public void setClient(Client client) {
        this.client = client;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("others.xml");

        FileEventLogger fel = new CacheFileEventLogger("test", 12);
        App app  = ctx.getBean(App.class);
        Event event = ctx.getBean(Event.class);
        Event event2 = ctx.getBean(Event.class);
        Event event3 = ctx.getBean(Event.class);

        event.setMsg("Guten morgen");
        event2.setMsg("Guten tag");
        event3.setMsg("Guten abbend");
        app.logEvent(EventType.ERROR, event);
        app.logEvent(EventType.ERROR, event2);
        app.logEvent(EventType.ERROR, event3);

        ctx.getBean(B.class);
        ctx.getBean("C");
        ctx.close();
    }

    public void setDefaultLogger(EventLogger defaultLogger) {
        this.defaultLogger = defaultLogger;
    }

    private void logEvent(EventType type, Event event) {
        EventLogger logger = loggers.get(type);
        if ( logger == null ) {
            logger = defaultLogger;
        }
        logger.logEvent(event);
    }

}
