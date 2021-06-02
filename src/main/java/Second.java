import interpreter.FirstLexer;
import interpreter.SecondLexer;
import interpreter.SecondParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Second {
    public static void main(String[] args) {
        SecondLexer lexer = new SecondLexer(CharStreams.fromString(
                "25 + 3 * 2\n" +
                        "42 - (-69)".trim()));
        SecondParser parser = new SecondParser(new CommonTokenStream(lexer));
        SecondParser.StartContext tree = parser.start();
        System.out.println(tree.toStringTree());

    }

}
