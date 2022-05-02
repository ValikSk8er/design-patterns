package mediator.pattern.core;

import java.util.List;

public class LogFileReader {
    public List<String> readFile(String fileName) {
        System.out.println("read log file by name: " + fileName);
        return List.of("test", "info");
    }
}
