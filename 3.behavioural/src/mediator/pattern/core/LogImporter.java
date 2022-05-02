package mediator.pattern.core;

import java.util.List;

// Mediator
public class LogImporter {
    private LogFileReader logFileReader;
    private LogSaver logSaver;

    public LogImporter(LogFileReader logFileReader, LogSaver logSaver) {
        this.logFileReader = logFileReader;
        this.logSaver = logSaver;
    }

    public List<String> importLog(String fileName) {
        List<String> logs = logFileReader.readFile(fileName);
        return logSaver.saveLogs(logs);
    }
}
