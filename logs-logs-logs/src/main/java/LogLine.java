public class LogLine {

    String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String code = logLine.substring(1, 4);
        return switch (code) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        int id = switch (getLogLevel()) {
            case TRACE -> LogLevel.TRACE.getId();
            case DEBUG -> LogLevel.DEBUG.getId();
            case INFO -> LogLevel.INFO.getId();
            case WARNING -> LogLevel.WARNING.getId();
            case ERROR -> LogLevel.ERROR.getId();
            case FATAL -> LogLevel.FATAL.getId();
            default -> LogLevel.UNKNOWN.getId();
        };
        String message = logLine.substring(logLine.indexOf(":") + 2);
        return id + ":" + message;
    }
}
