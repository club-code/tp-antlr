import interpreter.SecondLexer;
import interpreter.SecondParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Second {
    public static void main(String[] args) {
        var lexer = new SecondLexer(CharStreams.fromString("""
        25 + 3 * 2
        42 - (-69)
    """.trim()));
        var parser = new SecondParser(new CommonTokenStream(lexer));
        var tree = parser.start();
        System.out.println(tree.toStringTree());

    }

}
