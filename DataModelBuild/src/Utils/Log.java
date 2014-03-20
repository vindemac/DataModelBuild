/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import org.apache.log4j.*;

public class Log {

    private static Logger logger = Logger.getLogger(Log.class);

    /**
     * @return the logger
     */
    public static Logger getLogger() {
        return logger;
    }

    /**
     * @param aLogger the logger to set
     */
    public static void setLogger(Logger aLogger) {
        logger = aLogger;
    }

    public Log() {
        long time = System.currentTimeMillis();
        logger.info("main method called..");
        logger.info("another informative message");
        logger.warn("This one is a warning!");
        long logTime = System.currentTimeMillis() - time;

        logger.debug("Time taken to log the previous messages: "
                + logTime + " msecs");
        
        // Exception logging example:
    }
}
