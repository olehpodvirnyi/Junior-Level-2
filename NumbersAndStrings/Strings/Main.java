package NumbersAndStrings.Strings;

public class Main {
    public static void main(String[] args) {
        String greeting = "Hello world!";


        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);

        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();

        //Concatenating Strings
        String string1 = "saw I was ";
        String string2 = "!!!!";

        string1.concat(string2);
        "My name is ".concat("Rumplestiltskin");
        System.out.println("Hello," + " world" + "!");
        System.out.println("Dot " + string1 + "Tod");
        String quote =
                "Now is the time for all good " +
                        "men to come to the aid of their country.";
        //Creating Format Strings
        float floatVar = 1f;
        int intVar = 1;
        String stringVar = "";
        System.out.printf("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        "and the string is %s",
                floatVar, intVar, stringVar);

        //Converting Strings to Numbers
        // this program requires two
        // arguments on the command line
        if (args.length == 2) {
            // convert strings to numbers
            float a = (Float.valueOf(args[0])).floatValue();
            float b = (Float.valueOf(args[1])).floatValue();

            // do some arithmetic
            System.out.println("a + b = " +
                    (a + b));
            System.out.println("a - b = " +
                    (a - b));
            System.out.println("a * b = " +
                    (a * b));
            System.out.println("a / b = " +
                    (a / b));
            System.out.println("a % b = " +
                    (a % b));
        } else {
            System.out.println("This program " +
                    "requires two command-line arguments.");
        }
        //Converting Numbers to Strings

        // Concatenate "i" with an empty string; conversion is handled for you.
        int i =1;
        String s1 = "" + i;

        // The valueOf class method.
        String s2 = String.valueOf(i);

        double d=1.;
        String s3 = Integer.toString(i);
        String s4 = Double.toString(d);

        double d1 = 858.48;
        String s = Double.toString(d1);

        int dot = s.indexOf('.');

        System.out.println(dot + " digits " +
                "before decimal point.");
        System.out.println( (s.length() - dot - 1) +
                " digits after decimal point.");


        //Other Methods for Manipulating Strings
        //
        //String[] split(String regex)
        //String[] split(String regex, int limit)
        //CharSequence subSequence(int beginIndex, int endIndex)
        //String trim()// видаляє пробіли
        //String toLowerCase()
        //String toUpperCase()


        //The Search Methods in the String Class
        //
        //int indexOf(int ch)
        //int lastIndexOf(int ch)
        //int indexOf(int ch, int fromIndex)
        //int lastIndexOf(int ch, int fromIndex)
        //int indexOf(String str)
        //int lastIndexOf(String str)
        //int indexOf(String str, int fromIndex)
        //int lastIndexOf(String str, int fromIndex)
        //boolean contains(CharSequence s)


        //Replacing Characters and Substrings into a String
        //
        //String replace(char oldChar, char newChar)
        //String replace(CharSequence target, CharSequence replacement)
        //String replaceAll(String regex, String replacement)
        //String replaceFirst(String regex, String replacement)

        //Порівняння рядків і частин рядків
        //
        //Повертає true, якщо цей рядок закінчується або починається з підрядка, указаного як аргумент методу.
        //boolean endsWith(String suffix)
        //boolean startsWith(String prefix)
        //
        //boolean startsWith(String prefix, int offset)
        //int compareTo(String anotherString)
        //int compareToIgnoreCase(String str)	Ігноруючи відмінності у регістрі
        //boolean equals(Object anObject)
        //boolean equalsIgnoreCase(String anotherString)	Ігноруючи відмінності у регістрі
        //boolean regionMatches(int toffset, String other, int ooffset, int len)
        //Перевіряє, чи відповідає зазначена область цього рядка вказаній області аргументу String.
        // Область має довжину len та починається з індексу toffset для цього та ooffset іншого рядків.
        //boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        //boolean matches(String regex)





        //StringBuilder
        //StringBuilder об'єкти схожі на String об'єкти, за винятком того, що їх можна змінювати

        //Методи
        //StringBuilder append - Додає аргумент до цього конструктора рядків
        //StringBuilder delete(int start, int end)
        //StringBuilder deleteCharAt(int index)
        //StringBuilder insert
        //StringBuilder replace(int start, int end, String s)
        //void setCharAt(int index, char c)
        //StringBuilder reverse()
        //StringBuilder reverse()


        //StringBuffer - є потоково безпечним , StringBuilder - ні
    }
}
