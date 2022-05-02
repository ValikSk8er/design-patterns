package mediator.pattern;

import mediator.pattern.core.LogFileReader;
import mediator.pattern.core.LogImporter;
import mediator.pattern.core.LogSaver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogFileReader logFileReader = new LogFileReader();
        LogSaver logSaver = new LogSaver();
        List<String> strings = new LogImporter(logFileReader, logSaver)
                .importLog("test.txt");

        System.out.println(strings.toString());
    }
}
