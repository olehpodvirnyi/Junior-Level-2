package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {
    public static void main(String[] args) {
        //Рядок "foo" починається з індексу 0 і закінчується індексом 3, навіть якщо самі символи займають лише комірки 0, 1 і 2.
        //Enter your regex: foo
        //Enter input string to search: foofoofoo
        //I found the text foo starting at index 0 and ending at index 3.
        //I found the text foo starting at index 3 and ending at index 6.
        //I found the text foo starting at index 6 and ending at index 9.

        //Метасимволи
        // . - будь-який символ


        // Клас символів
        //
        //Enter your regex: [bcr]at
        //Enter input string to search: cat
        //I found the text "cat" starting at index 0 and ending at index 3
        //
        //Enter your regex: [bcr]at
        //Enter input string to search: hat
        //No match found.

        //Заперечення
        //
        //Enter your regex: [^bcr]at
        //Enter input string to search: hat
        //I found the text "hat" starting at index 0 and ending at index 3.
        //
        //Enter your regex: [^bcr]at
        //Enter input string to search: bat
        //No match found.

        //діапазони
        //
        //Enter your regex: [a-c]
        //Enter input string to search: b
        //I found the text "b" starting at index 0 and ending at index 1.
        //
        //Enter your regex: foo[1-5]
        //Enter input string to search: foo6
        //No match found.

        //об’єднання
        //
        //Enter your regex: [0-4[6-8]]
        //Enter input string to search: 0
        //I found the text "0" starting at index 0 and ending at index 1.
        //
        //Enter your regex: [0-4[6-8]]
        //Enter input string to search: 5
        //No match found.


        //Перетини
        //
        //Enter your regex: [0-9&&[345]]
        //Enter input string to search: 5
        //I found the text "5" starting at index 0 and ending at index 1.
        //
        //Enter your regex: [0-9&&[345]]
        //Enter input string to search: 6
        //No match found.

        //Віднімання
        //
        //Enter your regex: [0-9&&[^345]]
        //Enter input string to search: 6
        //I found the text "6" starting at index 0 and ending at index 1.
        //
        //Enter your regex: [0-9&&[^345]]
        //Enter input string to search: 5
        //No match found.


        //Конструкції, що починаються зі зворотної косої риски, називаються екранованими конструкціями
        //
        //Enter your regex: .
        //Enter input string to search: @
        //I found the text "@" starting at index 0 and ending at index 1.
        //
        //Enter your regex: \d
        //Enter input string to search: 1
        //I found the text "1" starting at index 0 and ending at index 1.
        //
        //Enter your regex: \d
        //Enter input string to search: a
        //No match found.
        //
        //Enter your regex: \D
        //Enter input string to search: 1
        //No match found.
        //
        //Enter your regex: \D
        //Enter input string to search: a
        //I found the text "a" starting at index 0 and ending at index 1.
        //
        //Enter your regex: \s
        //Enter input string to search:
        //I found the text " " starting at index 0 and ending at index 1.
        //
        //Enter your regex: \s
        //Enter input string to search: a
        //No match found.
        //
        //Enter your regex: \S
        //Enter input string to search:
        //No match found.
        //
        //Enter your regex: \S
        //Enter input string to search: a
        //I found the text "a" starting at index 0 and ending at index 1.
        //
        //Enter your regex: \w
        //Enter input string to search: a
        //I found the text "a" starting at index 0 and ending at index 1.
        //
        //Enter your regex: \w
        //Enter input string to search: !
        //No match found.
        //
        //Enter your regex: \W
        //Enter input string to search: a
        //No match found.
        //
        //Enter your regex: \W
        //Enter input string to search: !
        //I found the text "!" starting at index 0 and ending at index 1.

        //Квантори (дозволяють вказати кількість входжень для порівняння)
        //
        //Enter your regex: a?
        //Enter input string to search: aaaaa
        //I found the text "a" starting at index 0 and ending at index 1.
        //I found the text "a" starting at index 1 and ending at index 2.
        //I found the text "a" starting at index 2 and ending at index 3.
        //I found the text "a" starting at index 3 and ending at index 4.
        //I found the text "a" starting at index 4 and ending at index 5.
        //I found the text "" starting at index 5 and ending at index 5.
        //
        //Enter your regex: a*
        //Enter input string to search: aaaaa
        //I found the text "aaaaa" starting at index 0 and ending at index 5.
        //I found the text "" starting at index 5 and ending at index 5.
        //
        //Enter your regex: a+
        //Enter input string to search: aaaaa
        //I found the text "aaaaa" starting at index 0 and ending at index 5.
        //
        //Enter your regex: a?
        //Enter input string to search: ababaaaab
        //I found the text "a" starting at index 0 and ending at index 1.
        //I found the text "" starting at index 1 and ending at index 1.
        //I found the text "a" starting at index 2 and ending at index 3.
        //I found the text "" starting at index 3 and ending at index 3.
        //I found the text "a" starting at index 4 and ending at index 5.
        //I found the text "a" starting at index 5 and ending at index 6.
        //I found the text "a" starting at index 6 and ending at index 7.
        //I found the text "a" starting at index 7 and ending at index 8.
        //I found the text "" starting at index 8 and ending at index 8.
        //I found the text "" starting at index 9 and ending at index 9.
        //
        //Enter your regex: a*
        //Enter input string to search: ababaaaab
        //I found the text "a" starting at index 0 and ending at index 1.
        //I found the text "" starting at index 1 and ending at index 1.
        //I found the text "a" starting at index 2 and ending at index 3.
        //I found the text "" starting at index 3 and ending at index 3.
        //I found the text "aaaa" starting at index 4 and ending at index 8.
        //I found the text "" starting at index 8 and ending at index 8.
        //I found the text "" starting at index 9 and ending at index 9.
        //
        //Enter your regex: a+
        //Enter input string to search: ababaaaab
        //I found the text "a" starting at index 0 and ending at index 1.
        //I found the text "a" starting at index 2 and ending at index 3.
        //I found the text "aaaa" starting at index 4 and ending at index 8.
        //
        //Enter your regex: a{3}
        //Enter input string to search: aa
        //No match found.
        //
        //Enter your regex: a{3}
        //Enter input string to search: aaa
        //I found the text "aaa" starting at index 0 and ending at index 3.
        //
        //Enter your regex: a{3}
        //Enter input string to search: aaaa
        //I found the text "aaa" starting at index 0 and ending at index 3.
        //
        //Enter your regex: a{3}
        //Enter input string to search: aaaaaaaaa
        //I found the text "aaa" starting at index 0 and ending at index 3.
        //I found the text "aaa" starting at index 3 and ending at index 6.
        //I found the text "aaa" starting at index 6 and ending at index 9.
        //
        //Enter your regex: a{3,}
        //Enter input string to search: aaaaaaaaa
        //I found the text "aaaaaaaaa" starting at index 0 and ending at index 9.
        //
        //Enter your regex: a{3,6} // find at least 3 (but no more than 6) a's in a row
        //Enter input string to search: aaaaaaaaa
        //I found the text "aaaaaa" starting at index 0 and ending at index 6.
        //I found the text "aaa" starting at index 6 and ending at index 9.

        //Capturing Groups and Character Classes with Quantifiers (Захоплення груп і класів символів за допомогою кванторів)
        //
        //Enter your regex: (dog){3}
        //Enter input string to search: dogdogdogdogdogdog
        //I found the text "dogdogdog" starting at index 0 and ending at index 9.
        //I found the text "dogdogdog" starting at index 9 and ending at index 18.
        //
        //Enter your regex: dog{3}
        //Enter input string to search: dogdogdogdogdogdog
        //No match found.
        //
        //Enter your regex: [abc]{3}
        //Enter input string to search: abccabaaaccbbbc
        //I found the text "abc" starting at index 0 and ending at index 3.
        //I found the text "cab" starting at index 3 and ending at index 6.
        //I found the text "aaa" starting at index 6 and ending at index 9.
        //I found the text "ccb" starting at index 9 and ending at index 12.
        //I found the text "bbc" starting at index 12 and ending at index 15.
        //
        //Enter your regex: abc{3}
        //Enter input string to search: abccabaaaccbbbc
        //No match found.

        //Differences Among Greedy, Reluctant, and Possessive Quantifiers
        //
        //Enter your regex: .*foo  // greedy quantifier
        //Enter input string to search: xfooxxxxxxfoo
        //I found the text "xfooxxxxxxfoo" starting at index 0 and ending at index 13.
        //
        //Enter your regex: .*?foo  // reluctant quantifier
        //Enter input string to search: xfooxxxxxxfoo
        //I found the text "xfoo" starting at index 0 and ending at index 4.
        //I found the text "xxxxxxfoo" starting at index 4 and ending at index 13.
        //
        //Enter your regex: .*+foo // possessive quantifier
        //Enter input string to search: xfooxxxxxxfoo
        //No match found.

        //Backreferences (Зворотні посилання)
        //
        //Enter your regex: (\d\d)\1
        //Enter input string to search: 1212
        //I found the text "1212" starting at index 0 and ending at index 4.
        //
        //Enter your regex: (\d\d)\1
        //Enter input string to search: 1234
        //No match found.

        //Boundary Matchers (Збіги меж)
        //
        //Enter your regex: ^dog$
        //Enter input string to search: dog
        //I found the text "dog" starting at index 0 and ending at index 3.
        //
        //Enter your regex: ^dog$
        //Enter input string to search:       dog
        //No match found.
        //
        //Enter your regex: \s*dog$
        //Enter input string to search:             dog
        //I found the text "            dog" starting at index 0 and ending at index 15.
        //
        //Enter your regex: ^dog\w*
        //Enter input string to search: dogblahblah
        //I found the text "dogblahblah" starting at index 0 and ending at index 11.
        //
        //Enter your regex: \bdog\b
        //Enter input string to search: The dog plays in the yard.
        //I found the text "dog" starting at index 4 and ending at index 7.
        //
        //Enter your regex: \bdog\b
        //Enter input string to search: The doggie plays in the yard.
        //No match found.
        //
        //Enter your regex: \bdog\B
        //Enter input string to search: The dog plays in the yard.
        //No match found.
        //
        //Enter your regex: \bdog\B
        //Enter input string to search: The doggie plays in the yard.
        //I found the text "dog" starting at index 4 and ending at index 7.
        //
        //Enter your regex: dog
        //Enter input string to search: dog dog
        //I found the text "dog" starting at index 0 and ending at index 3.
        //I found the text "dog" starting at index 4 and ending at index 7.
        //
        //Enter your regex: \Gdog
        //Enter input string to search: dog dog
        //I found the text "dog" starting at index 0 and ending at index 3.

        //Pattern.compile має параметр flags
        Pattern.compile("",Pattern.CANON_EQ);

        //Вмикає канонічну еквівалентність. Знижує продуктивність
        Pattern.compile("",Pattern.CANON_EQ);
        //Вмикає відповідність без урахування регістру
        Pattern.compile("", Pattern.CASE_INSENSITIVE);
        //Дозволяє пробіли та коментарі в шаблоні.
        Pattern.compile("",Pattern.COMMENTS);
        //Вмикає режим dotall.
        Pattern.compile("", Pattern.DOTALL);
        //Вмикає буквальний аналіз шаблону.
        Pattern.compile("",Pattern.LITERAL);
        //Вмикає багаторядковий режим.
        Pattern.compile("",Pattern.MULTILINE);
        //Вмикає згортання регістру з урахуванням Юнікоду.
        Pattern.compile("",Pattern.UNICODE_CASE);
        //Вмикає режим ліній UNIX
        Pattern.compile("", Pattern.UNIX_LINES);


        //СИМВОЛ  |
        Pattern.compile("[az]$", Pattern.MULTILINE | Pattern.UNIX_LINES);

        //Enter your regex: (?i)foo
        //Enter input string to search: FOOfooFoOfoO
        //I found the text "FOO" starting at index 0 and ending at index 3.
        //I found the text "foo" starting at index 3 and ending at index 6.
        //I found the text "FoO" starting at index 6 and ending at index 9.
        //I found the text "foO" starting at index 9 and ending at index 12.

        //CLASS Matcher

        //Індексні методи
        //
        //public int start(): Повертає початковий індекс попереднього збігу.
        //public int start(int group): Повертає початковий індекс підпослідовності, захопленої даною групою
        //public int end(): повертає зміщення після останнього символу, що збігається.
        //public int end(int group): Повертає зміщення після останнього символу підпослідовності, захопленої даною групою
        //
        //Методи дослідження
        //
        //public boolean lookingAt(): намагається зіставити вхідну послідовність, починаючи з початку області, із шаблоном.
        //public boolean find(): намагається знайти наступну підпослідовність вхідної послідовності, яка відповідає шаблону.
        //public boolean find(int start): скидає цей збіг, а потім намагається знайти наступну підпослідовність вхідної послідовності
        //                              , яка відповідає шаблону, починаючи з указаного індексу.
        //public boolean matches(): намагається зіставити всю область із шаблоном.
        //
        //Методи заміни
        //
        //public Matcher appendReplacement(StringBuffer sb, String replacement): Реалізує нетермінальний крок додавання та заміни.
        //public StringBuffer appendTail(StringBuffer sb): реалізує крок додавання та заміни терміналу.
        //public String replaceAll(String replacement): замінює кожну підпослідовність вхідної послідовності, яка відповідає шаблону, на заданий рядок заміни.
        //public String replaceFirst(String replacement): замінює першу підпослідовність вхідної послідовності, яка відповідає шаблону, на заданий рядок заміни.
        //public static String quoteReplacement(String s): Повертає буквальну заміну String для вказаного String.

        //PatternSyntaxException

        //public String getDescription(): Отримує опис помилки.
        //public int getIndex(): Отримує індекс помилок.
        //public String getPattern(): Отримує помилковий шаблон регулярного виразу.
        //public String getMessage(): Повертає багаторядковий рядок, що містить опис синтаксичної помилки та її індекс, шаблон помилкового регулярного виразу та візуальну індикацію індексу помилки в шаблоні.
    }
}
