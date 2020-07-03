package com.cubetiqs.logging;

/**
 * Loggable
 *
 * @author sombochea
 * @since 1.0
 */
public interface Loggable {
    default void info(String text) {
        Log.getLogger(this.getClass()).info(text);
    }

    default void info(String formatText, Object... args) {
        Log.getLogger(this.getClass()).info(formatText, args);
    }

    default void warn(String text) {
        Log.getLogger(this.getClass()).warn(text);
    }

    default void warn(String formatText, Object... args) {
        Log.getLogger(this.getClass()).warn(formatText, args);
    }

    default void debug(String text) {
        Log.getLogger(this.getClass()).debug(text);
    }

    default void debug(String formatText, Object... args) {
        Log.getLogger(this.getClass()).debug(formatText, args);
    }

    default void error(String text) {
        Log.getLogger(this.getClass()).error(text);
    }

    default void error(String formatText, Object... args) {
        Log.getLogger(this.getClass()).error(formatText, args);
    }
}
