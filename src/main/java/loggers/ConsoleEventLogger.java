package loggers;

import loggers.EventLogger;

import java.io.IOException;

public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event) {
        System.out.println(event);
    }

    public void logEvent(String mess) {
        System.out.println(mess);
    }
}
