package NumbersAndStrings.Character;

public class Main {
    public static void main(String[] args) {
        char ch1 = 'a';
        // Unicode for uppercase Greek omega character
        char uniChar = '\u03A9';
        // an array of chars
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

        //Character object cannot be changed.
        //Character ch = new Character('a');
        Character ch = 'a';

        Character.isLetter(ch);
        Character.isDigit(ch);
        Character.isWhitespace(ch);//пробіли
        Character.isUpperCase(ch);
        Character.isLowerCase(ch);
        char c1 = Character.toUpperCase(ch);
        char c2 = Character.toLowerCase(ch);
        String c3 = Character.toString(ch);

    }
}
