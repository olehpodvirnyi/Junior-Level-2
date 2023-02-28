package ResourceBundles;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {


    public static void main(String[] args) throws UnsupportedEncodingException {
        //baseName + "_"+ fr + "_" + CA
        //baseName + "_"+ fr
        //baseName + "_"+ uk + "_" + UA
        //baseName + "_"+ uk
        //baseName

//        ResourceBundle bundle = ResourceBundle.getBundle("package.bundle", Locale.UK);
//        System.out.println("Message in "+Locale.UK +": "+bundle.getString("message"));
//
//        bundle = ResourceBundle.getBundle("package.bundle", Locale.GERMANY);
//        System.out.println("Message in "+Locale.GERMANY +": "+bundle.getString("message"));
//        printInfo("", "");
        printInfo("uk", "UA");

        printInfo("gr", "GR");
    }

    private static void printInfo(String language, String country)
            throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("bundle", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            System.out.println(value);
        }
        System.out.println();
    }
}
