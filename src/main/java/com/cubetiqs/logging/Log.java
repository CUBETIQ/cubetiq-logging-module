package com.cubetiqs.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author sombochea
 * @see Logger
 * @see LogManager
 * @since 1.0
 */
public class Log {
    private final static Logger logger = LogManager.getLogger();

    public static Logger getLogger(Class<?> clazz) {
        return LogManager.getLogger(clazz);
    }
}
