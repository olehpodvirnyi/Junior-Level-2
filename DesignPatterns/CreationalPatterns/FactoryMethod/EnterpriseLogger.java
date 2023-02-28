package DesignPatterns.CreationalPatterns.FactoryMethod;

public class EnterpriseLogger implements ILogger {
    public void LogMessage(String message) {
        System.out.println("EnterpriseLogger: " + message);
    }

    public void LogError(String message) {
        System.out.println("EnterpriseLogger: " + message);
    }

    public void LogVerboseInformation(String message) {
        System.out.println("EnterpriseLogger: " + message);
    }

}
