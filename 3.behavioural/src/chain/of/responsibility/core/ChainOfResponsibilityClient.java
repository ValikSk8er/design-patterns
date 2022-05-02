package chain.of.responsibility.core;

public class ChainOfResponsibilityClient {
    public static Logger doChaining(){
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUT_INFO);
        Logger errorLogger = new ErrorBasedLogger(Logger.ERROR_INFO);
        Logger debugLogger = new DebugBasedLogger(Logger.DEBUG_INFO);

        consoleLogger.setNextLevelLogger(errorLogger);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }
}
