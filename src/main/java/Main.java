import interpreter.ExcaliburLexer;
import interpreter.ExcaliburParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        var lexer = new ExcaliburLexer(CharStreams.fromString("""
        a = 25
        b = 2 * (a + 2)
    """.trim()));
        var parser = new ExcaliburParser(new CommonTokenStream(lexer));
        var tree = parser.start();
        System.out.println(tree.topLevels().toStringTree());

    }

}
