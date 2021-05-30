import interpreter.ExcaliburLexer
import interpreter.ExcaliburParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val lexer = ExcaliburLexer(CharStreams.fromString("""
        25 + 3 * 2
        42 - (-69)
    """.trimIndent()))
    val parser = ExcaliburParser(CommonTokenStream(lexer))
    val tree = parser.start()
    println(tree.expressions().toStringTree())

}
