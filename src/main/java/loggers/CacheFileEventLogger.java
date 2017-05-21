package loggers;

import java.util.LinkedList;
import java.util.List;

public class CacheFileEventLogger extends FileEventLogger {
    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String fileName, int cacheSize) {
        super(fileName);
        this.cache = new LinkedList<>();
        this.cacheSize = cacheSize;
    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);
        if ( cacheSize == cache.size() ) {
            writeEventFromFile();
            cache.clear();
        }
    }

    public void destroy() {
        if ( !cache.isEmpty() ) {
            writeEventFromFile();
        }
    }

    private void writeEventFromFile() {
        for (Event ev : cache) {
            super.logEvent(ev);
        }
    }
}
