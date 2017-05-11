package loggers;

import java.io.IOException;

/**
 * Created by Yaroslava_Kalashnyk on 5/8/2017.
 */
public interface EventLogger {
    public void logEvent(Event event) throws IOException;
}
