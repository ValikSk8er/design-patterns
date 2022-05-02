package command.pattern;

import command.pattern.command.OpenTextFileOperation;
import command.pattern.command.SaveTextFileOperation;
import command.pattern.invoker.TextFileOperationExecutor;
import command.pattern.receiver.TextFile;

/**
 * https://www.baeldung.com/java-command-pattern
 */
public class Client {
    public static void main(String[] args) {
        TextFile textFile = new TextFile("file1.txt");

        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        String x = textFileOperationExecutor.executeOperation(new OpenTextFileOperation(textFile));
        System.out.println(x);
        String s = textFileOperationExecutor.executeOperation(new SaveTextFileOperation(textFile));
        System.out.println(s);

        //Using Lambda Expressions
        String s1 = textFileOperationExecutor.executeOperation(() -> "Lambda: Opening file file1.txt");
        String s2 = textFileOperationExecutor.executeOperation(() -> "Lambda: Saving file file1.txt");
        System.out.println(s1);
        System.out.println(s2);

        //Using Method References
        String s3 = textFileOperationExecutor.executeOperation(textFile::open);
        String s4 = textFileOperationExecutor.executeOperation(textFile::save);
        System.out.println(s3);
        System.out.println(s4);
    }
}
