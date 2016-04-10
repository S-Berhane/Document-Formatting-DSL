// Generated from Resume.g4 by ANTLR 4.5
package com.resumecompiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ResumeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ORDER=2, START=3, STOP=4, GENERAL=5, TITLE=6, COMPANY=7, STARTMONTH=8, 
		ENDMONTH=9, NAME=10, ADDRESS=11, PHONE=12, EMAIL=13, DEGREE=14, SCHOOL=15, 
		STARTYEAR=16, ENDYEAR=17, PERSONAL=18, SKILLS=19, EDUCATION=20, EXPERIENCE=21, 
		EOL=22, VALUE=23, NEWLINE=24, WS=25;
	public static final int
		RULE_startrule = 0, RULE_action = 1, RULE_command = 2, RULE_expression = 3, 
		RULE_texttype = 4, RULE_body = 5, RULE_personal = 6, RULE_experience = 7, 
		RULE_education = 8, RULE_skills = 9, RULE_pertype = 10, RULE_edutype = 11, 
		RULE_exptype = 12, RULE_skitype = 13, RULE_value = 14;
	public static final String[] ruleNames = {
		"startrule", "action", "command", "expression", "texttype", "body", "personal", 
		"experience", "education", "skills", "pertype", "edutype", "exptype", 
		"skitype", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", null, "'start'", "'stop'", "'general'", "'title'", "'company'", 
		"'startmonth'", "'endmonth'", "'name'", "'address'", "'phone'", "'email'", 
		"'degree'", "'school'", "'startyear'", "'endyear'", "'personal'", "'skills'", 
		"'education'", "'experience'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ORDER", "START", "STOP", "GENERAL", "TITLE", "COMPANY", "STARTMONTH", 
		"ENDMONTH", "NAME", "ADDRESS", "PHONE", "EMAIL", "DEGREE", "SCHOOL", "STARTYEAR", 
		"ENDYEAR", "PERSONAL", "SKILLS", "EDUCATION", "EXPERIENCE", "EOL", "VALUE", 
		"NEWLINE", "WS"
	};
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

	@Override
	public String getGrammarFileName() { return "Resume.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ResumeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartruleContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StartruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterStartrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitStartrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitStartrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartruleContext startrule() throws RecognitionException {
		StartruleContext _localctx = new StartruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startrule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				expression();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START) | (1L << STOP) | (1L << GENERAL) | (1L << TITLE) | (1L << COMPANY) | (1L << STARTMONTH) | (1L << ENDMONTH) | (1L << NAME) | (1L << ADDRESS) | (1L << PHONE) | (1L << EMAIL) | (1L << DEGREE) | (1L << SCHOOL) | (1L << STARTYEAR) | (1L << ENDYEAR))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(ResumeParser.START, 0); }
		public TerminalNode STOP() { return getToken(ResumeParser.STOP, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !(_la==START || _la==STOP) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TexttypeContext texttype() {
			return getRuleContext(TexttypeContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(ResumeParser.ORDER, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				action();
				setState(38);
				texttype();
				setState(39);
				match(ORDER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				action();
				setState(42);
				texttype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode EOL() { return getToken(ResumeParser.EOL, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(52);
			switch (_input.LA(1)) {
			case START:
			case STOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				command();
				setState(47);
				match(EOL);
				}
				break;
			case GENERAL:
			case TITLE:
			case COMPANY:
			case STARTMONTH:
			case ENDMONTH:
			case NAME:
			case ADDRESS:
			case PHONE:
			case EMAIL:
			case DEGREE:
			case SCHOOL:
			case STARTYEAR:
			case ENDYEAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				body();
				setState(50);
				match(EOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TexttypeContext extends ParserRuleContext {
		public TerminalNode PERSONAL() { return getToken(ResumeParser.PERSONAL, 0); }
		public TerminalNode EXPERIENCE() { return getToken(ResumeParser.EXPERIENCE, 0); }
		public TerminalNode SKILLS() { return getToken(ResumeParser.SKILLS, 0); }
		public TerminalNode EDUCATION() { return getToken(ResumeParser.EDUCATION, 0); }
		public TexttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texttype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterTexttype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitTexttype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitTexttype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TexttypeContext texttype() throws RecognitionException {
		TexttypeContext _localctx = new TexttypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_texttype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERSONAL) | (1L << SKILLS) | (1L << EDUCATION) | (1L << EXPERIENCE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public PersonalContext personal() {
			return getRuleContext(PersonalContext.class,0);
		}
		public ExperienceContext experience() {
			return getRuleContext(ExperienceContext.class,0);
		}
		public SkillsContext skills() {
			return getRuleContext(SkillsContext.class,0);
		}
		public EducationContext education() {
			return getRuleContext(EducationContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		try {
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				personal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				experience();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				skills();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				education();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonalContext extends ParserRuleContext {
		public PertypeContext pertype() {
			return getRuleContext(PertypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PersonalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterPersonal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitPersonal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitPersonal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonalContext personal() throws RecognitionException {
		PersonalContext _localctx = new PersonalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_personal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			pertype();
			setState(63);
			match(T__0);
			setState(64);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExperienceContext extends ParserRuleContext {
		public ExptypeContext exptype() {
			return getRuleContext(ExptypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExperienceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experience; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterExperience(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitExperience(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitExperience(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExperienceContext experience() throws RecognitionException {
		ExperienceContext _localctx = new ExperienceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_experience);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			exptype();
			setState(67);
			match(T__0);
			setState(68);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EducationContext extends ParserRuleContext {
		public EdutypeContext edutype() {
			return getRuleContext(EdutypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EducationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_education; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterEducation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitEducation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitEducation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EducationContext education() throws RecognitionException {
		EducationContext _localctx = new EducationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_education);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			edutype();
			setState(71);
			match(T__0);
			setState(72);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkillsContext extends ParserRuleContext {
		public SkitypeContext skitype() {
			return getRuleContext(SkitypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SkillsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skills; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterSkills(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitSkills(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitSkills(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkillsContext skills() throws RecognitionException {
		SkillsContext _localctx = new SkillsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_skills);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			skitype();
			setState(75);
			match(T__0);
			setState(76);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PertypeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ResumeParser.NAME, 0); }
		public TerminalNode ADDRESS() { return getToken(ResumeParser.ADDRESS, 0); }
		public TerminalNode PHONE() { return getToken(ResumeParser.PHONE, 0); }
		public TerminalNode EMAIL() { return getToken(ResumeParser.EMAIL, 0); }
		public TerminalNode GENERAL() { return getToken(ResumeParser.GENERAL, 0); }
		public PertypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pertype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterPertype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitPertype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitPertype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PertypeContext pertype() throws RecognitionException {
		PertypeContext _localctx = new PertypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pertype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GENERAL) | (1L << NAME) | (1L << ADDRESS) | (1L << PHONE) | (1L << EMAIL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdutypeContext extends ParserRuleContext {
		public TerminalNode DEGREE() { return getToken(ResumeParser.DEGREE, 0); }
		public TerminalNode SCHOOL() { return getToken(ResumeParser.SCHOOL, 0); }
		public TerminalNode STARTYEAR() { return getToken(ResumeParser.STARTYEAR, 0); }
		public TerminalNode ENDYEAR() { return getToken(ResumeParser.ENDYEAR, 0); }
		public TerminalNode GENERAL() { return getToken(ResumeParser.GENERAL, 0); }
		public EdutypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edutype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterEdutype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitEdutype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitEdutype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdutypeContext edutype() throws RecognitionException {
		EdutypeContext _localctx = new EdutypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_edutype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GENERAL) | (1L << DEGREE) | (1L << SCHOOL) | (1L << STARTYEAR) | (1L << ENDYEAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExptypeContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(ResumeParser.TITLE, 0); }
		public TerminalNode COMPANY() { return getToken(ResumeParser.COMPANY, 0); }
		public TerminalNode STARTYEAR() { return getToken(ResumeParser.STARTYEAR, 0); }
		public TerminalNode ENDYEAR() { return getToken(ResumeParser.ENDYEAR, 0); }
		public TerminalNode STARTMONTH() { return getToken(ResumeParser.STARTMONTH, 0); }
		public TerminalNode ENDMONTH() { return getToken(ResumeParser.ENDMONTH, 0); }
		public TerminalNode GENERAL() { return getToken(ResumeParser.GENERAL, 0); }
		public ExptypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exptype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterExptype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitExptype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitExptype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExptypeContext exptype() throws RecognitionException {
		ExptypeContext _localctx = new ExptypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exptype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GENERAL) | (1L << TITLE) | (1L << COMPANY) | (1L << STARTMONTH) | (1L << ENDMONTH) | (1L << STARTYEAR) | (1L << ENDYEAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkitypeContext extends ParserRuleContext {
		public TerminalNode GENERAL() { return getToken(ResumeParser.GENERAL, 0); }
		public SkitypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skitype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterSkitype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitSkitype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitSkitype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkitypeContext skitype() throws RecognitionException {
		SkitypeContext _localctx = new SkitypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_skitype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(GENERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public List<TerminalNode> VALUE() { return getTokens(ResumeParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(ResumeParser.VALUE, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ResumeListener ) ((ResumeListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ResumeVisitor ) return ((ResumeVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				match(VALUE);
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VALUE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16\2#\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\67\n\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7?\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\6\20Z\n\20\r\20\16\20[\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\7\3\2\5\6\3\2\24\27\4\2\7\7\f\17\4\2\7\7\20\23\4\2\7"+
		"\13\22\23U\2!\3\2\2\2\4%\3\2\2\2\6.\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f"+
		">\3\2\2\2\16@\3\2\2\2\20D\3\2\2\2\22H\3\2\2\2\24L\3\2\2\2\26P\3\2\2\2"+
		"\30R\3\2\2\2\32T\3\2\2\2\34V\3\2\2\2\36Y\3\2\2\2 \"\5\b\5\2! \3\2\2\2"+
		"\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%&\t\2\2\2&\5\3\2\2\2\'(\5\4"+
		"\3\2()\5\n\6\2)*\7\4\2\2*/\3\2\2\2+,\5\4\3\2,-\5\n\6\2-/\3\2\2\2.\'\3"+
		"\2\2\2.+\3\2\2\2/\7\3\2\2\2\60\61\5\6\4\2\61\62\7\30\2\2\62\67\3\2\2\2"+
		"\63\64\5\f\7\2\64\65\7\30\2\2\65\67\3\2\2\2\66\60\3\2\2\2\66\63\3\2\2"+
		"\2\67\t\3\2\2\289\t\3\2\29\13\3\2\2\2:?\5\16\b\2;?\5\20\t\2<?\5\24\13"+
		"\2=?\5\22\n\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\r\3\2\2\2@A\5\26"+
		"\f\2AB\7\3\2\2BC\5\36\20\2C\17\3\2\2\2DE\5\32\16\2EF\7\3\2\2FG\5\36\20"+
		"\2G\21\3\2\2\2HI\5\30\r\2IJ\7\3\2\2JK\5\36\20\2K\23\3\2\2\2LM\5\34\17"+
		"\2MN\7\3\2\2NO\5\36\20\2O\25\3\2\2\2PQ\t\4\2\2Q\27\3\2\2\2RS\t\5\2\2S"+
		"\31\3\2\2\2TU\t\6\2\2U\33\3\2\2\2VW\7\7\2\2W\35\3\2\2\2XZ\7\31\2\2YX\3"+
		"\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\37\3\2\2\2\7#.\66>[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}