package DesignPatterns.CreationalPatterns.FactoryMethod;

public class Log4NetLogger implements ILogger {
    public void LogMessage(String message) {
        System.out.println("Log4Net: " + message);
    }

    public void LogError(String message) {
        System.out.println("Log4Net: " + message);
    }

    public void LogVerboseInformation(String message) {
        System.out.println("Log4Net: " + message);
    }

}