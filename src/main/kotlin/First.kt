import interpreter.FirstLexer
import interpreter.FirstParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val lexer = FirstLexer(CharStreams.fromString("""
        25 + 3 * 2
        42 - (-69)
    """.trimIndent()))
    val tokens = CommonTokenStream(lexer)
    val parser = FirstParser(tokens)
    val tree = parser.start()
    println(tokens.tokens.joinToString{ "Jeton: ${it.text.replace("\n", "\\n")}" })

}
