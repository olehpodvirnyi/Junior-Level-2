package DesignPatterns.CreationalPatterns.FactoryMethod;

public interface ILogger {
    void LogMessage(String message);

    void LogError(String message);

    void LogVerboseInformation(String message);
}
