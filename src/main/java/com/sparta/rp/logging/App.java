package com.sparta.rp.logging;

import java.io.IOException;
import java.util.logging.*;

/**
 * Hello world!
 *
 */
public class App {
    //Handler - Where to log to
    private static final Logger logger = Logger.getLogger("my logger");
    public static void main( String[] args )
    {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        //consoleHandler.setFilter(new CustomFilter());
//        try {
//
//            FileHandler fileHandler = new FileHandler("src/main/resources/mylog.log", true);
//            fileHandler.setLevel(Level.ALL);
//            fileHandler.setFormatter(new CustomFormatter());
//            logger.addHandler(fileHandler);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
        logger.log(Level.INFO, "This is an info message");
        logger.log(Level.WARNING, "This is a warning message");
        logger.log(Level.FINE, "Hello, this is fine message");
        test();

    }
    private static void test(){
        logger.log(Level.FINE, "Hello, this is another fine message");
        logger.log(Level.INFO, "This is another info message");

    }
}
