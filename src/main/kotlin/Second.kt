import interpreter.SecondLexer
import interpreter.SecondParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val lexer = SecondLexer(CharStreams.fromString("""
        25 + 3 * 2
        42 - (-69)
    """.trimIndent()))
    val a = CommonTokenStream(lexer)
    val parser = SecondParser(a)
    val tree = parser.start()
    println(tree.toStringTree())

}
