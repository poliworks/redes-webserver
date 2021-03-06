package poli.pcs.redes.webserver.utils;

public enum LogLevel {
    DEBUG, INFO, WARN, ERROR;

    public String toString() {
        switch (this) {
            case DEBUG: return "DEBUG";
            case INFO: return "INFO";
            case WARN: return "WARN";
            case ERROR: return "ERROR";
            default: return "UNKNOWN";
        }
    }

    public static LogLevel fromString(String logLevel) {
        switch (logLevel) {
            case "DEEBUG": return DEBUG;
            case "INFO": return INFO;
            case "WARN": return WARN;
            case "ERROR": return ERROR;
            default: return DEBUG;
        }
    }
}
