// Generated from /DATA/Documents/ProjetInfo/java/AntlrParserTemplate/src/main/antlr/ExcaliburLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExcaliburLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGNMENT=1, ADD=2, SUB=3, MUL=4, DIV=5, INCR=6, DECR=7, INV=8, LPAR=9, 
		RPAR=10, LCUR=11, RCUR=12, LBRA=13, RBRA=14, INT=15, FUN=16, CLASS=17, 
		IDENT=18, COMMA=19, COLON=20, SEMI=21, WS=22, SEMICOLON=23, NL=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGNMENT", "ADD", "SUB", "MUL", "DIV", "INCR", "DECR", "INV", "LPAR", 
			"RPAR", "LCUR", "RCUR", "LBRA", "RBRA", "INT", "FUN", "CLASS", "IDENT", 
			"NameChar", "NameStartChar", "COMMA", "COLON", "SEMI", "WS", "SEMICOLON", 
			"NL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "'!'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", null, "'fun'", "'class'", null, "','", 
			"':'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGNMENT", "ADD", "SUB", "MUL", "DIV", "INCR", "DECR", "INV", 
			"LPAR", "RPAR", "LCUR", "RCUR", "LBRA", "RBRA", "INT", "FUN", "CLASS", 
			"IDENT", "COMMA", "COLON", "SEMI", "WS", "SEMICOLON", "NL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExcaliburLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExcaliburLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\6\20W\n\20\r\20\16\20X\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\7\23g\n\23\f\23\16\23j\13\23\3\24\3\24"+
		"\5\24n\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\7\30w\n\30\f\30\16\30z"+
		"\13\30\3\30\3\30\5\30~\n\30\6\30\u0080\n\30\r\30\16\30\u0081\3\31\6\31"+
		"\u0085\n\31\r\31\16\31\u0086\3\31\3\31\3\32\3\32\3\33\3\33\3\33\5\33\u0090"+
		"\n\33\5\33\u0092\n\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\25-\26/\27\61\30"+
		"\63\31\65\32\3\2\5\4\2\62;aa\4\2C\\c|\5\2\13\13\17\17\"\"\2\u0099\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2"+
		"\2\rA\3\2\2\2\17D\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2"+
		"\2\2\31O\3\2\2\2\33Q\3\2\2\2\35S\3\2\2\2\37V\3\2\2\2!Z\3\2\2\2#^\3\2\2"+
		"\2%d\3\2\2\2\'m\3\2\2\2)o\3\2\2\2+q\3\2\2\2-s\3\2\2\2/\177\3\2\2\2\61"+
		"\u0084\3\2\2\2\63\u008a\3\2\2\2\65\u0091\3\2\2\2\678\7?\2\28\4\3\2\2\2"+
		"9:\7-\2\2:\6\3\2\2\2;<\7/\2\2<\b\3\2\2\2=>\7,\2\2>\n\3\2\2\2?@\7\61\2"+
		"\2@\f\3\2\2\2AB\7-\2\2BC\7-\2\2C\16\3\2\2\2DE\7/\2\2EF\7/\2\2F\20\3\2"+
		"\2\2GH\7#\2\2H\22\3\2\2\2IJ\7*\2\2J\24\3\2\2\2KL\7+\2\2L\26\3\2\2\2MN"+
		"\7}\2\2N\30\3\2\2\2OP\7\177\2\2P\32\3\2\2\2QR\7]\2\2R\34\3\2\2\2ST\7_"+
		"\2\2T\36\3\2\2\2UW\4\62;\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y \3"+
		"\2\2\2Z[\7h\2\2[\\\7w\2\2\\]\7p\2\2]\"\3\2\2\2^_\7e\2\2_`\7n\2\2`a\7c"+
		"\2\2ab\7u\2\2bc\7u\2\2c$\3\2\2\2dh\5)\25\2eg\5\'\24\2fe\3\2\2\2gj\3\2"+
		"\2\2hf\3\2\2\2hi\3\2\2\2i&\3\2\2\2jh\3\2\2\2kn\5)\25\2ln\t\2\2\2mk\3\2"+
		"\2\2ml\3\2\2\2n(\3\2\2\2op\t\3\2\2p*\3\2\2\2qr\7.\2\2r,\3\2\2\2st\7<\2"+
		"\2t.\3\2\2\2uw\t\4\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y}\3\2\2"+
		"\2zx\3\2\2\2{~\5\63\32\2|~\5\65\33\2}{\3\2\2\2}|\3\2\2\2~\u0080\3\2\2"+
		"\2\177x\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\60\3\2\2\2\u0083\u0085\t\4\2\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\b\31\2\2\u0089\62\3\2\2\2\u008a\u008b\7=\2\2\u008b\64\3\2\2\2\u008c"+
		"\u0092\7\f\2\2\u008d\u008f\7\17\2\2\u008e\u0090\7\f\2\2\u008f\u008e\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008c\3\2\2\2\u0091"+
		"\u008d\3\2\2\2\u0092\66\3\2\2\2\f\2Xhmx}\u0081\u0086\u008f\u0091\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}