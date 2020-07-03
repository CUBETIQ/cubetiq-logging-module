package com.cubetiqs.logging;

import com.cubetiqs.assertion.Tests;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class TestLogging {
    private final Logger logger
             = Log.getLogger(getClass());
    @Test
    public void testLogging() {
        logger.fatal("Sambo Chea and {}", "Hey Hey");
    }

    @Test
    public void tesException() {
        Tests.isTrue(1 == 1, "this is not true");
    }
}
