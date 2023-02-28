package DesignPatterns.CreationalPatterns.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        var providerType = GetTypeOfLoggingProviderFromConfigFile();
        ILogger logger = LoggerProviderFactory.GetLoggingProvider(providerType);
        logger.LogMessage("Hello Factory Method Design Pattern.");
    }

    private static LoggingProviders GetTypeOfLoggingProviderFromConfigFile() {
        return LoggingProviders.EnterpriseLogging;
    }
}
