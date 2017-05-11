package loggers;

import loggers.EventLogger;

/**
 * Created by Yaroslava_Kalashnyk on 5/8/2017.
 */
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event) {
        System.out.println(event);
    }
}
