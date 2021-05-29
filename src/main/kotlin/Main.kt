import interpreter.ExcaliburLexer
import interpreter.ExcaliburParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val lexer = ExcaliburLexer(CharStreams.fromString("""
        a = 25
        b = 2 * (a + 2)
    """.trimIndent()))
    val parser = ExcaliburParser(CommonTokenStream(lexer))
    val tree = parser.start()
    println(tree.topLevels().toStringTree())

}
