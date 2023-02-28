package Spring;

public class Main {
    public static void main(String[] args) {

        //Типи ApplicationContext

        //AnnotationConfigApplicationContext
        //ApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
        //AccountService accountService = context.getBean(AccountService.class);

        //AnnotationConfigWebApplicationContext
        //public class MyWebApplicationInitializer implements WebApplicationInitializer {
        //
        //  public void onStartup(ServletContext container) throws ServletException {
        //    AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        //    context.register(AccountConfig.class);
        //    context.setServletContext(container);
        //
        //    // servlet configuration
        //  }
        //}

        //XmlWebApplicationContext
        //public class MyXmlWebApplicationInitializer implements WebApplicationInitializer {
        //
        //  public void onStartup(ServletContext container) throws ServletException {
        //    XmlWebApplicationContext context = new XmlWebApplicationContext();
        //    context.setConfigLocation("/WEB-INF/spring/applicationContext.xml");
        //    context.setServletContext(container);
        //
        //    // Servlet configuration
        //  }
        //}

        //FileSystemXMLApplicationContext
        //String path = "C:/myProject/src/main/resources/applicationcontext/account-bean-config.xml";
        //
        //ApplicationContext context = new FileSystemXmlApplicationContext(path);
        //AccountService accountService = context.getBean("accountService", AccountService.class);

        //ClassPathXmlApplicationContext
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext/account-bean-config.xml");
        //AccountService accountService = context.getBean("accountService", AccountService.class);

    }
}
