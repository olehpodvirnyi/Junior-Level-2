package NumbersAndStrings.Numbers;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestFormat {
    public static void main(String[] args) {
        float floatVar = 1f;
        int intVar = 1;
        String stringVar = "";
        System.out.format("The value of " + "the float variable is " +
                "%f, while the value of the " + "integer variable is %d, " +
                "and the string is %s", floatVar, intVar, stringVar);


        long n = 461012;
        System.out.format("%d%n", n);      //  -->  "461012"
        System.out.format("%08d%n", n);    //  -->  "00461012"
        System.out.format("%+8d%n", n);    //  -->  " +461012"
        System.out.format("%,8d%n", n);    // -->  " 461,012"
        System.out.format("%+,8d%n%n", n); //  -->  "+461,012"

        double pi = Math.PI;

        System.out.format("%f%n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"
        System.out.format(Locale.FRANCE,
                "%-10.4f%n%n", pi); // -->  "3,1416"

        Calendar z = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", z, z, z); // -->  "May 29, 2006"

        System.out.format("%tl:%tM %tp%n", z, z, z);  // -->  "2:34 am"

        System.out.format("%tD%n", z);    // -->  "05/29/06"



        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.000", 123.78);
        customFormat("$###,###.###", 12345.67);

        //Math

        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;

        System.out.printf("The absolute value " + "of %.3f is %.3f%n",
                a, Math.abs(a));

        System.out.printf("The ceiling of " + "%.2f is %.0f%n",
                b, Math.ceil(b));

        System.out.printf("The floor of " + "%.2f is %.0f%n",
                b, Math.floor(b));

        System.out.printf("The rint of %.2f " + "is %.0f%n",
                b, Math.rint(b));

        System.out.printf("The max of %d and " + "%d is %d%n",
                c, d, Math.max(c, d));

        System.out.printf("The min of of %d " + "and %d is %d%n",
                c, d, Math.min(c, d));

        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of " + "e is %.4f%n",
                Math.E);

        System.out.printf("exp(%.3f) " + "is %.3f%n",
                x, Math.exp(x));

        System.out.printf("log(%.3f) is " + "%.3f%n",
                x, Math.log(x));

        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n",
                x, y, Math.pow(x, y));

        System.out.printf("sqrt(%.3f) is " + "%.3f%n",
                x, Math.sqrt(x));

        //0.0 <= number < 10.0.
        int number = (int)(Math.random() * 10);
    }

    static public void customFormat(String pattern, double value ) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + "  " + pattern + "  " + output);
    }
}
