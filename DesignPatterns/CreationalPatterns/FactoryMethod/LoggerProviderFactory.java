package DesignPatterns.CreationalPatterns.FactoryMethod;

public class LoggerProviderFactory {
    public static ILogger GetLoggingProvider(LoggingProviders logProviders) {
        switch (logProviders) {
            case EnterpriseLogging:
                return new EnterpriseLogger();
            case Log4Net:
                return new Log4NetLogger();
            default:
                return new EnterpriseLogger();
        }
    }

}
