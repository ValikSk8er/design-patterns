package chain.of.responsibility;

import chain.of.responsibility.core.ChainOfResponsibilityClient;
import chain.of.responsibility.core.Logger;

public class Main {
    public static void main(String[] args) {
        Logger chainLogger= ChainOfResponsibilityClient.doChaining();

//        chainLogger.logMessage(Logger.OUTPUT_INFO, "Enter the sequence of values ");
//        chainLogger.logMessage(Logger.ERROR_INFO, "An error is occured now");
        chainLogger.logMessage(Logger.DEBUG_INFO, "This was the error now debugging is compeled");
    }
}
