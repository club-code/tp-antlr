import interpreter.FirstLexer;
import interpreter.FirstParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {
        var lexer = new FirstLexer(CharStreams.fromString("""
        25 + 3 * 2
        42 - (-69)
    """.trim()));
        var tokens = new CommonTokenStream(lexer);
        var parser = new FirstParser(tokens);
        var tree = parser.start();
        System.out.println(tokens.getTokens().stream().map(token -> "Jeton: " + token.getText().replace("\n", "\\n") + ", ")
                .collect(Collectors.joining()));
    }

}
