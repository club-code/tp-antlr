import interpreter.FirstLexer;
import interpreter.FirstParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {
        FirstLexer lexer = new FirstLexer(CharStreams.fromString(
                "25 + 3 * 2\n" +
                        "42 - (-69)".trim()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FirstParser parser = new FirstParser(tokens);
        FirstParser.StartContext tree = parser.start();
        System.out.println(tokens.getTokens().stream().map(token -> "Jeton: " + token.getText().replace("\n", "\\n") + ", ")
                .collect(Collectors.joining()));
    }

}
