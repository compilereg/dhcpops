// Generated from /home/compiler/git/dhcpparser/src/main/antlr4/dhcp.g4 by ANTLR 4.13.1

	package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class dhcpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		SINGLEDIRECTIVE=39, LOGFACILITY=40, NUMBER=41, RESHOSTNAME=42, MAC=43, 
		OCTET=44, IP4=45, NETMASK=46, DOMAINNAME=47, REVDOMAINNAME=48, HOSTNAMESTR=49, 
		FILEPATH=50, COMMENT=51, WS=52;
	public static final int
		RULE_stmts = 0, RULE_stmt = 1, RULE_dirline = 2, RULE_includelist = 3, 
		RULE_includeline = 4, RULE_hostblocklist = 5, RULE_hostblock = 6, RULE_hostblockcontent = 7, 
		RULE_hostblockcontentlines = 8, RULE_hardwareline = 9, RULE_fixedaddressline = 10, 
		RULE_sharednetworkblock = 11, RULE_subnetblocklist = 12, RULE_subnetblock = 13, 
		RULE_ddnslines = 14, RULE_optionlines = 15, RULE_subnetblockcontent = 16, 
		RULE_subnetblockcontentline = 17, RULE_rangeline = 18, RULE_optionsdetails = 19, 
		RULE_serverslist = 20, RULE_domainlist = 21, RULE_nextserverline = 22, 
		RULE_ddnsupdatestyle = 23, RULE_ddnsupdates = 24, RULE_updatestaticleases = 25, 
		RULE_allow = 26, RULE_defaultleasetime = 27, RULE_maxleasetime = 28, RULE_logfacility = 29, 
		RULE_ddnsrevdomainname = 30, RULE_ddnsdomainname = 31, RULE_ddnshostname = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"stmts", "stmt", "dirline", "includelist", "includeline", "hostblocklist", 
			"hostblock", "hostblockcontent", "hostblockcontentlines", "hardwareline", 
			"fixedaddressline", "sharednetworkblock", "subnetblocklist", "subnetblock", 
			"ddnslines", "optionlines", "subnetblockcontent", "subnetblockcontentline", 
			"rangeline", "optionsdetails", "serverslist", "domainlist", "nextserverline", 
			"ddnsupdatestyle", "ddnsupdates", "updatestaticleases", "allow", "defaultleasetime", 
			"maxleasetime", "logfacility", "ddnsrevdomainname", "ddnsdomainname", 
			"ddnshostname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'include'", "';'", "'host'", "'{'", "'}'", "'hardware'", "'ethernet'", 
			"'fixed-address'", "'shared-network'", "'subnet'", "'netmask'", "'option'", 
			"'range'", "'routers'", "'domain-name'", "'domain-name-servers'", "'domain-search'", 
			"'host-name'", "','", "'next-server'", "'ddns-update-style'", "'interim'", 
			"'none'", "'standard'", "'ad-hoc'", "'ddns-updates'", "'on'", "'off'", 
			"'update-static-leases'", "'allow'", "'booting'", "'bootp'", "'default-lease-time'", 
			"'max-lease-time'", "'log-facility'", "'ddns-rev-domainname'", "'ddns-domainname'", 
			"'ddns-hostname'", null, null, null, null, null, null, null, "'255.255.255.0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "SINGLEDIRECTIVE", "LOGFACILITY", "NUMBER", "RESHOSTNAME", 
			"MAC", "OCTET", "IP4", "NETMASK", "DOMAINNAME", "REVDOMAINNAME", "HOSTNAMESTR", 
			"FILEPATH", "COMMENT", "WS"
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

	@Override
	public String getGrammarFileName() { return "dhcp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dhcpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(dhcpParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				stmt();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1092601517578L) != 0) );
			setState(71);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public TerminalNode SINGLEDIRECTIVE() { return getToken(dhcpParser.SINGLEDIRECTIVE, 0); }
		public DirlineContext dirline() {
			return getRuleContext(DirlineContext.class,0);
		}
		public SharednetworkblockContext sharednetworkblock() {
			return getRuleContext(SharednetworkblockContext.class,0);
		}
		public SubnetblockContext subnetblock() {
			return getRuleContext(SubnetblockContext.class,0);
		}
		public OptionlinesContext optionlines() {
			return getRuleContext(OptionlinesContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLEDIRECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(SINGLEDIRECTIVE);
				}
				break;
			case T__0:
			case T__2:
			case T__20:
			case T__25:
			case T__28:
			case T__29:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				dirline();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				sharednetworkblock();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				subnetblock();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				optionlines();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirlineContext extends ParserRuleContext {
		public UpdatestaticleasesContext updatestaticleases() {
			return getRuleContext(UpdatestaticleasesContext.class,0);
		}
		public AllowContext allow() {
			return getRuleContext(AllowContext.class,0);
		}
		public DefaultleasetimeContext defaultleasetime() {
			return getRuleContext(DefaultleasetimeContext.class,0);
		}
		public MaxleasetimeContext maxleasetime() {
			return getRuleContext(MaxleasetimeContext.class,0);
		}
		public DdnslinesContext ddnslines() {
			return getRuleContext(DdnslinesContext.class,0);
		}
		public HostblocklistContext hostblocklist() {
			return getRuleContext(HostblocklistContext.class,0);
		}
		public IncludelistContext includelist() {
			return getRuleContext(IncludelistContext.class,0);
		}
		public LogfacilityContext logfacility() {
			return getRuleContext(LogfacilityContext.class,0);
		}
		public DirlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dirline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterDirline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitDirline(this);
		}
	}

	public final DirlineContext dirline() throws RecognitionException {
		DirlineContext _localctx = new DirlineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dirline);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				updatestaticleases();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				allow();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				defaultleasetime();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				maxleasetime();
				}
				break;
			case T__20:
			case T__25:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				ddnslines();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				hostblocklist();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				includelist();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				logfacility();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncludelistContext extends ParserRuleContext {
		public List<IncludelineContext> includeline() {
			return getRuleContexts(IncludelineContext.class);
		}
		public IncludelineContext includeline(int i) {
			return getRuleContext(IncludelineContext.class,i);
		}
		public IncludelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterIncludelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitIncludelist(this);
		}
	}

	public final IncludelistContext includelist() throws RecognitionException {
		IncludelistContext _localctx = new IncludelistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_includelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(90);
					includeline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncludelineContext extends ParserRuleContext {
		public TerminalNode FILEPATH() { return getToken(dhcpParser.FILEPATH, 0); }
		public IncludelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterIncludeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitIncludeline(this);
		}
	}

	public final IncludelineContext includeline() throws RecognitionException {
		IncludelineContext _localctx = new IncludelineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_includeline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__0);
			setState(96);
			match(FILEPATH);
			setState(97);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HostblocklistContext extends ParserRuleContext {
		public List<HostblockContext> hostblock() {
			return getRuleContexts(HostblockContext.class);
		}
		public HostblockContext hostblock(int i) {
			return getRuleContext(HostblockContext.class,i);
		}
		public HostblocklistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostblocklist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterHostblocklist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitHostblocklist(this);
		}
	}

	public final HostblocklistContext hostblocklist() throws RecognitionException {
		HostblocklistContext _localctx = new HostblocklistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hostblocklist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(99);
					hostblock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(102); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class HostblockContext extends ParserRuleContext {
		public TerminalNode RESHOSTNAME() { return getToken(dhcpParser.RESHOSTNAME, 0); }
		public HostblockcontentContext hostblockcontent() {
			return getRuleContext(HostblockcontentContext.class,0);
		}
		public HostblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterHostblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitHostblock(this);
		}
	}

	public final HostblockContext hostblock() throws RecognitionException {
		HostblockContext _localctx = new HostblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hostblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__2);
			setState(105);
			match(RESHOSTNAME);
			setState(106);
			match(T__3);
			setState(107);
			hostblockcontent();
			setState(108);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HostblockcontentContext extends ParserRuleContext {
		public List<HostblockcontentlinesContext> hostblockcontentlines() {
			return getRuleContexts(HostblockcontentlinesContext.class);
		}
		public HostblockcontentlinesContext hostblockcontentlines(int i) {
			return getRuleContext(HostblockcontentlinesContext.class,i);
		}
		public HostblockcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostblockcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterHostblockcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitHostblockcontent(this);
		}
	}

	public final HostblockcontentContext hostblockcontent() throws RecognitionException {
		HostblockcontentContext _localctx = new HostblockcontentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hostblockcontent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				hostblockcontentlines();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 481105547584L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class HostblockcontentlinesContext extends ParserRuleContext {
		public HardwarelineContext hardwareline() {
			return getRuleContext(HardwarelineContext.class,0);
		}
		public FixedaddresslineContext fixedaddressline() {
			return getRuleContext(FixedaddresslineContext.class,0);
		}
		public OptionlinesContext optionlines() {
			return getRuleContext(OptionlinesContext.class,0);
		}
		public DdnslinesContext ddnslines() {
			return getRuleContext(DdnslinesContext.class,0);
		}
		public HostblockcontentlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostblockcontentlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterHostblockcontentlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitHostblockcontentlines(this);
		}
	}

	public final HostblockcontentlinesContext hostblockcontentlines() throws RecognitionException {
		HostblockcontentlinesContext _localctx = new HostblockcontentlinesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hostblockcontentlines);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				hardwareline();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				fixedaddressline();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				optionlines();
				}
				break;
			case T__20:
			case T__25:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				ddnslines();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HardwarelineContext extends ParserRuleContext {
		public TerminalNode MAC() { return getToken(dhcpParser.MAC, 0); }
		public HardwarelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hardwareline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterHardwareline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitHardwareline(this);
		}
	}

	public final HardwarelineContext hardwareline() throws RecognitionException {
		HardwarelineContext _localctx = new HardwarelineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_hardwareline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__5);
			setState(122);
			match(T__6);
			setState(123);
			match(MAC);
			setState(124);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FixedaddresslineContext extends ParserRuleContext {
		public TerminalNode IP4() { return getToken(dhcpParser.IP4, 0); }
		public FixedaddresslineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedaddressline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterFixedaddressline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitFixedaddressline(this);
		}
	}

	public final FixedaddresslineContext fixedaddressline() throws RecognitionException {
		FixedaddresslineContext _localctx = new FixedaddresslineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fixedaddressline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__7);
			setState(127);
			match(IP4);
			setState(128);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SharednetworkblockContext extends ParserRuleContext {
		public TerminalNode RESHOSTNAME() { return getToken(dhcpParser.RESHOSTNAME, 0); }
		public SubnetblocklistContext subnetblocklist() {
			return getRuleContext(SubnetblocklistContext.class,0);
		}
		public SharednetworkblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharednetworkblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterSharednetworkblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitSharednetworkblock(this);
		}
	}

	public final SharednetworkblockContext sharednetworkblock() throws RecognitionException {
		SharednetworkblockContext _localctx = new SharednetworkblockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sharednetworkblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__8);
			setState(131);
			match(RESHOSTNAME);
			setState(132);
			match(T__3);
			setState(133);
			subnetblocklist();
			setState(134);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubnetblocklistContext extends ParserRuleContext {
		public List<SubnetblockContext> subnetblock() {
			return getRuleContexts(SubnetblockContext.class);
		}
		public SubnetblockContext subnetblock(int i) {
			return getRuleContext(SubnetblockContext.class,i);
		}
		public SubnetblocklistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnetblocklist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterSubnetblocklist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitSubnetblocklist(this);
		}
	}

	public final SubnetblocklistContext subnetblocklist() throws RecognitionException {
		SubnetblocklistContext _localctx = new SubnetblocklistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subnetblocklist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				subnetblock();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubnetblockContext extends ParserRuleContext {
		public List<TerminalNode> IP4() { return getTokens(dhcpParser.IP4); }
		public TerminalNode IP4(int i) {
			return getToken(dhcpParser.IP4, i);
		}
		public SubnetblockcontentContext subnetblockcontent() {
			return getRuleContext(SubnetblockcontentContext.class,0);
		}
		public SubnetblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnetblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterSubnetblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitSubnetblock(this);
		}
	}

	public final SubnetblockContext subnetblock() throws RecognitionException {
		SubnetblockContext _localctx = new SubnetblockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_subnetblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__9);
			setState(142);
			match(IP4);
			setState(143);
			match(T__10);
			setState(144);
			match(IP4);
			setState(145);
			match(T__3);
			setState(146);
			subnetblockcontent();
			setState(147);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DdnslinesContext extends ParserRuleContext {
		public DdnsdomainnameContext ddnsdomainname() {
			return getRuleContext(DdnsdomainnameContext.class,0);
		}
		public DdnsrevdomainnameContext ddnsrevdomainname() {
			return getRuleContext(DdnsrevdomainnameContext.class,0);
		}
		public DdnshostnameContext ddnshostname() {
			return getRuleContext(DdnshostnameContext.class,0);
		}
		public DdnsupdatestyleContext ddnsupdatestyle() {
			return getRuleContext(DdnsupdatestyleContext.class,0);
		}
		public DdnsupdatesContext ddnsupdates() {
			return getRuleContext(DdnsupdatesContext.class,0);
		}
		public DdnslinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddnslines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterDdnslines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitDdnslines(this);
		}
	}

	public final DdnslinesContext ddnslines() throws RecognitionException {
		DdnslinesContext _localctx = new DdnslinesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ddnslines);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				ddnsdomainname();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				ddnsrevdomainname();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				ddnshostname();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				ddnsupdatestyle();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				ddnsupdates();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OptionlinesContext extends ParserRuleContext {
		public OptionsdetailsContext optionsdetails() {
			return getRuleContext(OptionsdetailsContext.class,0);
		}
		public OptionlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterOptionlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitOptionlines(this);
		}
	}

	public final OptionlinesContext optionlines() throws RecognitionException {
		OptionlinesContext _localctx = new OptionlinesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_optionlines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__11);
			setState(157);
			optionsdetails();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubnetblockcontentContext extends ParserRuleContext {
		public List<SubnetblockcontentlineContext> subnetblockcontentline() {
			return getRuleContexts(SubnetblockcontentlineContext.class);
		}
		public SubnetblockcontentlineContext subnetblockcontentline(int i) {
			return getRuleContext(SubnetblockcontentlineContext.class,i);
		}
		public SubnetblockcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnetblockcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterSubnetblockcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitSubnetblockcontent(this);
		}
	}

	public final SubnetblockcontentContext subnetblockcontent() throws RecognitionException {
		SubnetblockcontentContext _localctx = new SubnetblockcontentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subnetblockcontent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				subnetblockcontentline();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1060864L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubnetblockcontentlineContext extends ParserRuleContext {
		public RangelineContext rangeline() {
			return getRuleContext(RangelineContext.class,0);
		}
		public OptionlinesContext optionlines() {
			return getRuleContext(OptionlinesContext.class,0);
		}
		public NextserverlineContext nextserverline() {
			return getRuleContext(NextserverlineContext.class,0);
		}
		public SubnetblockcontentlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnetblockcontentline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterSubnetblockcontentline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitSubnetblockcontentline(this);
		}
	}

	public final SubnetblockcontentlineContext subnetblockcontentline() throws RecognitionException {
		SubnetblockcontentlineContext _localctx = new SubnetblockcontentlineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_subnetblockcontentline);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				rangeline();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				optionlines();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				nextserverline();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangelineContext extends ParserRuleContext {
		public List<TerminalNode> IP4() { return getTokens(dhcpParser.IP4); }
		public TerminalNode IP4(int i) {
			return getToken(dhcpParser.IP4, i);
		}
		public RangelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterRangeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitRangeline(this);
		}
	}

	public final RangelineContext rangeline() throws RecognitionException {
		RangelineContext _localctx = new RangelineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rangeline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__12);
			setState(170);
			match(IP4);
			setState(171);
			match(IP4);
			setState(172);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OptionsdetailsContext extends ParserRuleContext {
		public TerminalNode IP4() { return getToken(dhcpParser.IP4, 0); }
		public TerminalNode DOMAINNAME() { return getToken(dhcpParser.DOMAINNAME, 0); }
		public ServerslistContext serverslist() {
			return getRuleContext(ServerslistContext.class,0);
		}
		public DomainlistContext domainlist() {
			return getRuleContext(DomainlistContext.class,0);
		}
		public TerminalNode HOSTNAMESTR() { return getToken(dhcpParser.HOSTNAMESTR, 0); }
		public OptionsdetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsdetails; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterOptionsdetails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitOptionsdetails(this);
		}
	}

	public final OptionsdetailsContext optionsdetails() throws RecognitionException {
		OptionsdetailsContext _localctx = new OptionsdetailsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_optionsdetails);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__13);
				setState(175);
				match(IP4);
				setState(176);
				match(T__1);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(T__14);
				setState(178);
				match(DOMAINNAME);
				setState(179);
				match(T__1);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(T__15);
				setState(181);
				serverslist();
				setState(182);
				match(T__1);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(T__16);
				setState(185);
				domainlist();
				setState(186);
				match(T__1);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(T__17);
				setState(189);
				match(HOSTNAMESTR);
				setState(190);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ServerslistContext extends ParserRuleContext {
		public List<TerminalNode> IP4() { return getTokens(dhcpParser.IP4); }
		public TerminalNode IP4(int i) {
			return getToken(dhcpParser.IP4, i);
		}
		public List<ServerslistContext> serverslist() {
			return getRuleContexts(ServerslistContext.class);
		}
		public ServerslistContext serverslist(int i) {
			return getRuleContext(ServerslistContext.class,i);
		}
		public ServerslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterServerslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitServerslist(this);
		}
	}

	public final ServerslistContext serverslist() throws RecognitionException {
		ServerslistContext _localctx = new ServerslistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_serverslist);
		int _la;
		try {
			int _alt;
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(IP4);
				setState(196); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(194);
						match(T__18);
						setState(195);
						serverslist();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(198); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(200);
					match(IP4);
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IP4 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DomainlistContext extends ParserRuleContext {
		public List<TerminalNode> DOMAINNAME() { return getTokens(dhcpParser.DOMAINNAME); }
		public TerminalNode DOMAINNAME(int i) {
			return getToken(dhcpParser.DOMAINNAME, i);
		}
		public List<DomainlistContext> domainlist() {
			return getRuleContexts(DomainlistContext.class);
		}
		public DomainlistContext domainlist(int i) {
			return getRuleContext(DomainlistContext.class,i);
		}
		public DomainlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterDomainlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitDomainlist(this);
		}
	}

	public final DomainlistContext domainlist() throws RecognitionException {
		DomainlistContext _localctx = new DomainlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_domainlist);
		int _la;
		try {
			int _alt;
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(DOMAINNAME);
				setState(210); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(208);
						match(T__18);
						setState(209);
						domainlist();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(212); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(214);
					match(DOMAINNAME);
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOMAINNAME );
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

	@SuppressWarnings("CheckReturnValue")
	public static class NextserverlineContext extends ParserRuleContext {
		public TerminalNode IP4() { return getToken(dhcpParser.IP4, 0); }
		public NextserverlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextserverline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterNextserverline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitNextserverline(this);
		}
	}

	public final NextserverlineContext nextserverline() throws RecognitionException {
		NextserverlineContext _localctx = new NextserverlineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nextserverline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__19);
			setState(222);
			match(IP4);
			setState(223);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DdnsupdatestyleContext extends ParserRuleContext {
		public DdnsupdatestyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddnsupdatestyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterDdnsupdatestyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitDdnsupdatestyle(this);
		}
	}

	public final DdnsupdatestyleContext ddnsupdatestyle() throws RecognitionException {
		DdnsupdatestyleContext _localctx = new DdnsupdatestyleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ddnsupdatestyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__20);
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DdnsupdatesContext extends ParserRuleContext {
		public DdnsupdatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddnsupdates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterDdnsupdates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitDdnsupdates(this);
		}
	}

	public final DdnsupdatesContext ddnsupdates() throws RecognitionException {
		DdnsupdatesContext _localctx = new DdnsupdatesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ddnsupdates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__25);
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(231);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdatestaticleasesContext extends ParserRuleContext {
		public UpdatestaticleasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updatestaticleases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterUpdatestaticleases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitUpdatestaticleases(this);
		}
	}

	public final UpdatestaticleasesContext updatestaticleases() throws RecognitionException {
		UpdatestaticleasesContext _localctx = new UpdatestaticleasesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_updatestaticleases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__28);
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(235);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AllowContext extends ParserRuleContext {
		public AllowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitAllow(this);
		}
	}

	public final AllowContext allow() throws RecognitionException {
		AllowContext _localctx = new AllowContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_allow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__29);
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__31) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(239);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultleasetimeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(dhcpParser.NUMBER, 0); }
		public DefaultleasetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultleasetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterDefaultleasetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitDefaultleasetime(this);
		}
	}

	public final DefaultleasetimeContext defaultleasetime() throws RecognitionException {
		DefaultleasetimeContext _localctx = new DefaultleasetimeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_defaultleasetime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__32);
			setState(242);
			match(NUMBER);
			setState(243);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaxleasetimeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(dhcpParser.NUMBER, 0); }
		public MaxleasetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxleasetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterMaxleasetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitMaxleasetime(this);
		}
	}

	public final MaxleasetimeContext maxleasetime() throws RecognitionException {
		MaxleasetimeContext _localctx = new MaxleasetimeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_maxleasetime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__33);
			setState(246);
			match(NUMBER);
			setState(247);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogfacilityContext extends ParserRuleContext {
		public TerminalNode LOGFACILITY() { return getToken(dhcpParser.LOGFACILITY, 0); }
		public LogfacilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logfacility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterLogfacility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitLogfacility(this);
		}
	}

	public final LogfacilityContext logfacility() throws RecognitionException {
		LogfacilityContext _localctx = new LogfacilityContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_logfacility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__34);
			setState(250);
			match(LOGFACILITY);
			setState(251);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DdnsrevdomainnameContext extends ParserRuleContext {
		public TerminalNode REVDOMAINNAME() { return getToken(dhcpParser.REVDOMAINNAME, 0); }
		public DdnsrevdomainnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddnsrevdomainname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterDdnsrevdomainname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitDdnsrevdomainname(this);
		}
	}

	public final DdnsrevdomainnameContext ddnsrevdomainname() throws RecognitionException {
		DdnsrevdomainnameContext _localctx = new DdnsrevdomainnameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ddnsrevdomainname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__35);
			setState(254);
			match(REVDOMAINNAME);
			setState(255);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DdnsdomainnameContext extends ParserRuleContext {
		public TerminalNode DOMAINNAME() { return getToken(dhcpParser.DOMAINNAME, 0); }
		public DdnsdomainnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddnsdomainname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterDdnsdomainname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitDdnsdomainname(this);
		}
	}

	public final DdnsdomainnameContext ddnsdomainname() throws RecognitionException {
		DdnsdomainnameContext _localctx = new DdnsdomainnameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ddnsdomainname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__36);
			setState(258);
			match(DOMAINNAME);
			setState(259);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DdnshostnameContext extends ParserRuleContext {
		public TerminalNode HOSTNAMESTR() { return getToken(dhcpParser.HOSTNAMESTR, 0); }
		public DdnshostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddnshostname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).enterDdnshostname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dhcpListener ) ((dhcpListener)listener).exitDdnshostname(this);
		}
	}

	public final DdnshostnameContext ddnshostname() throws RecognitionException {
		DdnshostnameContext _localctx = new DdnshostnameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ddnshostname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__37);
			setState(262);
			match(HOSTNAMESTR);
			setState(263);
			match(T__1);
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
		"\u0004\u00014\u010a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0004\u0000D\b\u0000"+
		"\u000b\u0000\f\u0000E\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002Y\b\u0002\u0001\u0003\u0004\u0003\\\b\u0003\u000b"+
		"\u0003\f\u0003]\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0004\u0005e\b\u0005\u000b\u0005\f\u0005f\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007"+
		"p\b\u0007\u000b\u0007\f\u0007q\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"x\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0004\f\u008a\b\f\u000b\f\f\f\u008b\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009b\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u00a1\b\u0010\u000b\u0010\f"+
		"\u0010\u00a2\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00a8\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00c0\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u00c5\b\u0014\u000b\u0014"+
		"\f\u0014\u00c6\u0001\u0014\u0004\u0014\u00ca\b\u0014\u000b\u0014\f\u0014"+
		"\u00cb\u0003\u0014\u00ce\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0004"+
		"\u0015\u00d3\b\u0015\u000b\u0015\f\u0015\u00d4\u0001\u0015\u0004\u0015"+
		"\u00d8\b\u0015\u000b\u0015\f\u0015\u00d9\u0003\u0015\u00dc\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0000\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0003\u0001"+
		"\u0000\u0016\u0019\u0001\u0000\u001b\u001c\u0001\u0000\u001f \u010c\u0000"+
		"C\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000\u0004X\u0001"+
		"\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000\b_\u0001\u0000\u0000"+
		"\u0000\nd\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000\u0000\u000eo\u0001"+
		"\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000"+
		"\u0000\u0014~\u0001\u0000\u0000\u0000\u0016\u0082\u0001\u0000\u0000\u0000"+
		"\u0018\u0089\u0001\u0000\u0000\u0000\u001a\u008d\u0001\u0000\u0000\u0000"+
		"\u001c\u009a\u0001\u0000\u0000\u0000\u001e\u009c\u0001\u0000\u0000\u0000"+
		" \u00a0\u0001\u0000\u0000\u0000\"\u00a7\u0001\u0000\u0000\u0000$\u00a9"+
		"\u0001\u0000\u0000\u0000&\u00bf\u0001\u0000\u0000\u0000(\u00cd\u0001\u0000"+
		"\u0000\u0000*\u00db\u0001\u0000\u0000\u0000,\u00dd\u0001\u0000\u0000\u0000"+
		".\u00e1\u0001\u0000\u0000\u00000\u00e5\u0001\u0000\u0000\u00002\u00e9"+
		"\u0001\u0000\u0000\u00004\u00ed\u0001\u0000\u0000\u00006\u00f1\u0001\u0000"+
		"\u0000\u00008\u00f5\u0001\u0000\u0000\u0000:\u00f9\u0001\u0000\u0000\u0000"+
		"<\u00fd\u0001\u0000\u0000\u0000>\u0101\u0001\u0000\u0000\u0000@\u0105"+
		"\u0001\u0000\u0000\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u0000\u0000\u0001H\u0001"+
		"\u0001\u0000\u0000\u0000IO\u0005\'\u0000\u0000JO\u0003\u0004\u0002\u0000"+
		"KO\u0003\u0016\u000b\u0000LO\u0003\u001a\r\u0000MO\u0003\u001e\u000f\u0000"+
		"NI\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u0003\u0001"+
		"\u0000\u0000\u0000PY\u00032\u0019\u0000QY\u00034\u001a\u0000RY\u00036"+
		"\u001b\u0000SY\u00038\u001c\u0000TY\u0003\u001c\u000e\u0000UY\u0003\n"+
		"\u0005\u0000VY\u0003\u0006\u0003\u0000WY\u0003:\u001d\u0000XP\u0001\u0000"+
		"\u0000\u0000XQ\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000XS\u0001"+
		"\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u0005\u0001\u0000"+
		"\u0000\u0000Z\\\u0003\b\u0004\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\u0007\u0001\u0000\u0000\u0000_`\u0005\u0001\u0000\u0000`a\u00052\u0000"+
		"\u0000ab\u0005\u0002\u0000\u0000b\t\u0001\u0000\u0000\u0000ce\u0003\f"+
		"\u0006\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u000b\u0001\u0000\u0000"+
		"\u0000hi\u0005\u0003\u0000\u0000ij\u0005*\u0000\u0000jk\u0005\u0004\u0000"+
		"\u0000kl\u0003\u000e\u0007\u0000lm\u0005\u0005\u0000\u0000m\r\u0001\u0000"+
		"\u0000\u0000np\u0003\u0010\b\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u000f"+
		"\u0001\u0000\u0000\u0000sx\u0003\u0012\t\u0000tx\u0003\u0014\n\u0000u"+
		"x\u0003\u001e\u000f\u0000vx\u0003\u001c\u000e\u0000ws\u0001\u0000\u0000"+
		"\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000x\u0011\u0001\u0000\u0000\u0000yz\u0005\u0006\u0000\u0000"+
		"z{\u0005\u0007\u0000\u0000{|\u0005+\u0000\u0000|}\u0005\u0002\u0000\u0000"+
		"}\u0013\u0001\u0000\u0000\u0000~\u007f\u0005\b\u0000\u0000\u007f\u0080"+
		"\u0005-\u0000\u0000\u0080\u0081\u0005\u0002\u0000\u0000\u0081\u0015\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\t\u0000\u0000\u0083\u0084\u0005*"+
		"\u0000\u0000\u0084\u0085\u0005\u0004\u0000\u0000\u0085\u0086\u0003\u0018"+
		"\f\u0000\u0086\u0087\u0005\u0005\u0000\u0000\u0087\u0017\u0001\u0000\u0000"+
		"\u0000\u0088\u008a\u0003\u001a\r\u0000\u0089\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0019\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005\n\u0000\u0000\u008e\u008f\u0005-\u0000\u0000\u008f"+
		"\u0090\u0005\u000b\u0000\u0000\u0090\u0091\u0005-\u0000\u0000\u0091\u0092"+
		"\u0005\u0004\u0000\u0000\u0092\u0093\u0003 \u0010\u0000\u0093\u0094\u0005"+
		"\u0005\u0000\u0000\u0094\u001b\u0001\u0000\u0000\u0000\u0095\u009b\u0003"+
		">\u001f\u0000\u0096\u009b\u0003<\u001e\u0000\u0097\u009b\u0003@ \u0000"+
		"\u0098\u009b\u0003.\u0017\u0000\u0099\u009b\u00030\u0018\u0000\u009a\u0095"+
		"\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0097"+
		"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u001d\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005\f\u0000\u0000\u009d\u009e\u0003&\u0013\u0000\u009e\u001f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a1\u0003\"\u0011\u0000\u00a0\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3!\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a8\u0003$\u0012\u0000\u00a5\u00a8\u0003\u001e\u000f\u0000"+
		"\u00a6\u00a8\u0003,\u0016\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"#\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\r\u0000\u0000\u00aa\u00ab"+
		"\u0005-\u0000\u0000\u00ab\u00ac\u0005-\u0000\u0000\u00ac\u00ad\u0005\u0002"+
		"\u0000\u0000\u00ad%\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u000e\u0000"+
		"\u0000\u00af\u00b0\u0005-\u0000\u0000\u00b0\u00c0\u0005\u0002\u0000\u0000"+
		"\u00b1\u00b2\u0005\u000f\u0000\u0000\u00b2\u00b3\u0005/\u0000\u0000\u00b3"+
		"\u00c0\u0005\u0002\u0000\u0000\u00b4\u00b5\u0005\u0010\u0000\u0000\u00b5"+
		"\u00b6\u0003(\u0014\u0000\u00b6\u00b7\u0005\u0002\u0000\u0000\u00b7\u00c0"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0011\u0000\u0000\u00b9\u00ba"+
		"\u0003*\u0015\u0000\u00ba\u00bb\u0005\u0002\u0000\u0000\u00bb\u00c0\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005\u0012\u0000\u0000\u00bd\u00be\u0005"+
		"1\u0000\u0000\u00be\u00c0\u0005\u0002\u0000\u0000\u00bf\u00ae\u0001\u0000"+
		"\u0000\u0000\u00bf\u00b1\u0001\u0000\u0000\u0000\u00bf\u00b4\u0001\u0000"+
		"\u0000\u0000\u00bf\u00b8\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c0\'\u0001\u0000\u0000\u0000\u00c1\u00c4\u0005-\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0013\u0000\u0000\u00c3\u00c5\u0003(\u0014\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00ce\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005-\u0000\u0000\u00c9"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c1\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c9\u0001\u0000\u0000\u0000\u00ce)\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0005/\u0000\u0000\u00d0\u00d1\u0005\u0013\u0000\u0000\u00d1\u00d3\u0003"+
		"*\u0015\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u00dc\u0001\u0000\u0000\u0000\u00d6\u00d8\u0005/\u0000"+
		"\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00cf\u0001\u0000\u0000"+
		"\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00dc+\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0005\u0014\u0000\u0000\u00de\u00df\u0005-\u0000\u0000\u00df"+
		"\u00e0\u0005\u0002\u0000\u0000\u00e0-\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0015\u0000\u0000\u00e2\u00e3\u0007\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u0002\u0000\u0000\u00e4/\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"\u001a\u0000\u0000\u00e6\u00e7\u0007\u0001\u0000\u0000\u00e7\u00e8\u0005"+
		"\u0002\u0000\u0000\u00e81\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u001d"+
		"\u0000\u0000\u00ea\u00eb\u0007\u0001\u0000\u0000\u00eb\u00ec\u0005\u0002"+
		"\u0000\u0000\u00ec3\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u001e\u0000"+
		"\u0000\u00ee\u00ef\u0007\u0002\u0000\u0000\u00ef\u00f0\u0005\u0002\u0000"+
		"\u0000\u00f05\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005!\u0000\u0000\u00f2"+
		"\u00f3\u0005)\u0000\u0000\u00f3\u00f4\u0005\u0002\u0000\u0000\u00f47\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\"\u0000\u0000\u00f6\u00f7\u0005)"+
		"\u0000\u0000\u00f7\u00f8\u0005\u0002\u0000\u0000\u00f89\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005#\u0000\u0000\u00fa\u00fb\u0005(\u0000\u0000\u00fb"+
		"\u00fc\u0005\u0002\u0000\u0000\u00fc;\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0005$\u0000\u0000\u00fe\u00ff\u00050\u0000\u0000\u00ff\u0100\u0005\u0002"+
		"\u0000\u0000\u0100=\u0001\u0000\u0000\u0000\u0101\u0102\u0005%\u0000\u0000"+
		"\u0102\u0103\u0005/\u0000\u0000\u0103\u0104\u0005\u0002\u0000\u0000\u0104"+
		"?\u0001\u0000\u0000\u0000\u0105\u0106\u0005&\u0000\u0000\u0106\u0107\u0005"+
		"1\u0000\u0000\u0107\u0108\u0005\u0002\u0000\u0000\u0108A\u0001\u0000\u0000"+
		"\u0000\u0012ENX]fqw\u008b\u009a\u00a2\u00a7\u00bf\u00c6\u00cb\u00cd\u00d4"+
		"\u00d9\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}