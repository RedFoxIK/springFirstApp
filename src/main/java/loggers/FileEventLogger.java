package loggers;


import java.io.FileWriter;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private String fileName;
    private FileWriter file;

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    public void init() throws IOException {
        this.file = new FileWriter(fileName, true);
    }

    @Override
    public void logEvent(Event event) {
        try {
            file.write(event.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
