package io.aurora.util;

public class Color {
    public static final String RED, BLUE, YELLOW, GREEN, WHITE, RESET;
    static {
        RED = "\u001B[31m";
        BLUE = "\u001B[34m";
        YELLOW = "\u001B[33m";
        GREEN = "\u001B[32m";
        WHITE = "\u001B[37m";
        RESET = "\u001B[0m";
    }
}
