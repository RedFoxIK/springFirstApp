package loggers;

import java.io.IOException;


public interface EventLogger {
    void logEvent(Event event);
    void logEvent(String mess);
}
