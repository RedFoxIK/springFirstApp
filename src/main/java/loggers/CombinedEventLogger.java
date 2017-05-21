package loggers;

import java.util.List;

public class CombinedEventLogger implements EventLogger {
    List<EventLogger> loggers;

    public CombinedEventLogger(List<EventLogger> loggers) {
        this.loggers = loggers;
    }

    @Override
    public void logEvent(Event event) {
        loggers.stream().forEach(logger -> logger.logEvent(event));
    }
}
