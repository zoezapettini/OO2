package fwOO2.ejercicio1FW;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
public class LogConfigurator {
	
    public static void configure() throws IOException {
        Logger logger = Logger.getLogger("bd");
        FileHandler fileHandler = new FileHandler("log.json", true);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);
    }
}