package loggers;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private String fileName;
    private File file;

    public void init() {
        this.file = new File(fileName);
    }


    public void logEvent(Event event) {
        
        try {
            FileUtils.writeStringToFile(file, "dfdfg", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
