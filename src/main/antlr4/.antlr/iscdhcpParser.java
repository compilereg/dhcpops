// Generated from /home/compiler/git/dhcpparser/src/main/antlr4/iscdhcp.g4 by ANTLR 4.13.1

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
public class iscdhcpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, MACADDRESS=33, IP4=34, NETMASK=35, DOMAINNAME=36, REVDOMAINNAME=37, 
		LOGFACILITY=38, TIMEINSEC=39, SINGLEDIRECTIVE=40, UPDATESTYLES=41, ONOFFSWITCH=42, 
		QUOTEDHOSTNAME=43, HOSTNAME=44, FILEPATH=45, COMMENT=46, WS=47;
	public static final int
		RULE_config = 0, RULE_serverconfline = 1, RULE_commonconfline = 2, RULE_confblock = 3, 
		RULE_sharednetblock = 4, RULE_subnetblock = 5, RULE_subnetblockbody = 6, 
		RULE_hostblock = 7, RULE_hostblockbody1 = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"config", "serverconfline", "commonconfline", "confblock", "sharednetblock", 
			"subnetblock", "subnetblockbody", "hostblock", "hostblockbody1"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'allow'", "'booting'", "'bootp'", "'update-static-leases'", 
			"'default-lease-time'", "'max-lease-time'", "'log-facility'", "'include'", 
			"'ddns-updates'", "'ddns-update-style'", "'ddns-domainname'", "'ddns-hostname'", 
			"'ddns-rev-domainname'", "'option domain-name'", "'option domain-name-servers'", 
			"','", "'option routers'", "'option domain-search'", "'shared-network'", 
			"'{'", "'}'", "'subnet'", "'netmask'", "'range'", "'option subnet-mask'", 
			"'next-server'", "'filename'", "'host'", "'hardware ethernet'", "'fixed-address'", 
			"'option host-name'", null, null, null, null, null, null, null, "'authoritative'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "MACADDRESS", "IP4", 
			"NETMASK", "DOMAINNAME", "REVDOMAINNAME", "LOGFACILITY", "TIMEINSEC", 
			"SINGLEDIRECTIVE", "UPDATESTYLES", "ONOFFSWITCH", "QUOTEDHOSTNAME", "HOSTNAME", 
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
	public String getGrammarFileName() { return "iscdhcp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public iscdhcpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConfigContext extends ParserRuleContext {
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
	 
		public ConfigContext() { }
		public void copyFrom(ConfigContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DHCPConfigContext extends ConfigContext {
		public TerminalNode EOF() { return getToken(iscdhcpParser.EOF, 0); }
		public List<ServerconflineContext> serverconfline() {
			return getRuleContexts(ServerconflineContext.class);
		}
		public ServerconflineContext serverconfline(int i) {
			return getRuleContext(ServerconflineContext.class,i);
		}
		public List<CommonconflineContext> commonconfline() {
			return getRuleContexts(CommonconflineContext.class);
		}
		public CommonconflineContext commonconfline(int i) {
			return getRuleContext(CommonconflineContext.class,i);
		}
		public List<ConfblockContext> confblock() {
			return getRuleContexts(ConfblockContext.class);
		}
		public ConfblockContext confblock(int i) {
			return getRuleContext(ConfblockContext.class,i);
		}
		public DHCPConfigContext(ConfigContext ctx) { copyFrom(ctx); }
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_config);
		int _la;
		try {
			_localctx = new DHCPConfigContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(21);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case SINGLEDIRECTIVE:
					{
					setState(18);
					serverconfline();
					}
					break;
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__17:
				case T__18:
					{
					setState(19);
					commonconfline();
					}
					break;
				case T__19:
				case T__22:
				case T__28:
					{
					setState(20);
					confblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1100058853348L) != 0) );
			setState(25);
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
	public static class ServerconflineContext extends ParserRuleContext {
		public ServerconflineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverconfline; }
	 
		public ServerconflineContext() { }
		public void copyFrom(ServerconflineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DDNSUpdateStyleDirectiveContext extends ServerconflineContext {
		public TerminalNode UPDATESTYLES() { return getToken(iscdhcpParser.UPDATESTYLES, 0); }
		public DDNSUpdateStyleDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UpdateStaticLeasesDirectiveContext extends ServerconflineContext {
		public TerminalNode ONOFFSWITCH() { return getToken(iscdhcpParser.ONOFFSWITCH, 0); }
		public UpdateStaticLeasesDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllowBootingDirectiveContext extends ServerconflineContext {
		public AllowBootingDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DDNSUpdatesDirectiveContext extends ServerconflineContext {
		public TerminalNode ONOFFSWITCH() { return getToken(iscdhcpParser.ONOFFSWITCH, 0); }
		public DDNSUpdatesDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AuthoritativeDirectiveContext extends ServerconflineContext {
		public TerminalNode SINGLEDIRECTIVE() { return getToken(iscdhcpParser.SINGLEDIRECTIVE, 0); }
		public AuthoritativeDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncludeDirectiveContext extends ServerconflineContext {
		public TerminalNode FILEPATH() { return getToken(iscdhcpParser.FILEPATH, 0); }
		public IncludeDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogFacilityDirectiveContext extends ServerconflineContext {
		public TerminalNode LOGFACILITY() { return getToken(iscdhcpParser.LOGFACILITY, 0); }
		public LogFacilityDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultLeaseTimeDirectiveContext extends ServerconflineContext {
		public TerminalNode TIMEINSEC() { return getToken(iscdhcpParser.TIMEINSEC, 0); }
		public DefaultLeaseTimeDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxLeaseTimeDirectiveContext extends ServerconflineContext {
		public TerminalNode TIMEINSEC() { return getToken(iscdhcpParser.TIMEINSEC, 0); }
		public MaxLeaseTimeDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
	}

	public final ServerconflineContext serverconfline() throws RecognitionException {
		ServerconflineContext _localctx = new ServerconflineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_serverconfline);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLEDIRECTIVE:
				_localctx = new AuthoritativeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(SINGLEDIRECTIVE);
				setState(28);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new AllowBootingDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(T__1);
				setState(30);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(31);
				match(T__0);
				}
				break;
			case T__4:
				_localctx = new UpdateStaticLeasesDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(T__4);
				setState(33);
				match(ONOFFSWITCH);
				setState(34);
				match(T__0);
				}
				break;
			case T__5:
				_localctx = new DefaultLeaseTimeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				match(T__5);
				setState(36);
				match(TIMEINSEC);
				setState(37);
				match(T__0);
				}
				break;
			case T__6:
				_localctx = new MaxLeaseTimeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				match(T__6);
				setState(39);
				match(TIMEINSEC);
				setState(40);
				match(T__0);
				}
				break;
			case T__7:
				_localctx = new LogFacilityDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				match(T__7);
				setState(42);
				match(LOGFACILITY);
				setState(43);
				match(T__0);
				}
				break;
			case T__8:
				_localctx = new IncludeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				match(T__8);
				setState(45);
				match(FILEPATH);
				setState(46);
				match(T__0);
				}
				break;
			case T__9:
				_localctx = new DDNSUpdatesDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				match(T__9);
				setState(48);
				match(ONOFFSWITCH);
				setState(49);
				match(T__0);
				}
				break;
			case T__10:
				_localctx = new DDNSUpdateStyleDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(50);
				match(T__10);
				setState(51);
				match(UPDATESTYLES);
				setState(52);
				match(T__0);
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
	public static class CommonconflineContext extends ParserRuleContext {
		public CommonconflineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonconfline; }
	 
		public CommonconflineContext() { }
		public void copyFrom(CommonconflineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DDNSRevDomainNameDirectiveContext extends CommonconflineContext {
		public TerminalNode REVDOMAINNAME() { return getToken(iscdhcpParser.REVDOMAINNAME, 0); }
		public DDNSRevDomainNameDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionRoutersDirectiveContext extends CommonconflineContext {
		public TerminalNode IP4() { return getToken(iscdhcpParser.IP4, 0); }
		public OptionRoutersDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionDomainSearchDirectiveContext extends CommonconflineContext {
		public List<TerminalNode> DOMAINNAME() { return getTokens(iscdhcpParser.DOMAINNAME); }
		public TerminalNode DOMAINNAME(int i) {
			return getToken(iscdhcpParser.DOMAINNAME, i);
		}
		public OptionDomainSearchDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DDNSHostNameDirectiveContext extends CommonconflineContext {
		public TerminalNode QUOTEDHOSTNAME() { return getToken(iscdhcpParser.QUOTEDHOSTNAME, 0); }
		public DDNSHostNameDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DDNSDomainNameDirectiveContext extends CommonconflineContext {
		public TerminalNode DOMAINNAME() { return getToken(iscdhcpParser.DOMAINNAME, 0); }
		public DDNSDomainNameDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionDomainNameServersDirectiveContext extends CommonconflineContext {
		public List<TerminalNode> IP4() { return getTokens(iscdhcpParser.IP4); }
		public TerminalNode IP4(int i) {
			return getToken(iscdhcpParser.IP4, i);
		}
		public OptionDomainNameServersDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionDomainNameDirectiveContext extends CommonconflineContext {
		public TerminalNode DOMAINNAME() { return getToken(iscdhcpParser.DOMAINNAME, 0); }
		public OptionDomainNameDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}

	public final CommonconflineContext commonconfline() throws RecognitionException {
		CommonconflineContext _localctx = new CommonconflineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commonconfline);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new DDNSDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__11);
				setState(56);
				match(DOMAINNAME);
				setState(57);
				match(T__0);
				}
				break;
			case T__12:
				_localctx = new DDNSHostNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__12);
				setState(59);
				match(QUOTEDHOSTNAME);
				setState(60);
				match(T__0);
				}
				break;
			case T__13:
				_localctx = new DDNSRevDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(T__13);
				setState(62);
				match(REVDOMAINNAME);
				setState(63);
				match(T__0);
				}
				break;
			case T__14:
				_localctx = new OptionDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(T__14);
				setState(65);
				match(DOMAINNAME);
				setState(66);
				match(T__0);
				}
				break;
			case T__15:
				_localctx = new OptionDomainNameServersDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				match(T__15);
				{
				setState(68);
				match(IP4);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(69);
					match(T__16);
					setState(70);
					match(IP4);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(76);
				match(T__0);
				}
				break;
			case T__17:
				_localctx = new OptionRoutersDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(T__17);
				setState(78);
				match(IP4);
				setState(79);
				match(T__0);
				}
				break;
			case T__18:
				_localctx = new OptionDomainSearchDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				match(T__18);
				{
				setState(81);
				match(DOMAINNAME);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(82);
					match(T__16);
					setState(83);
					match(DOMAINNAME);
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(89);
				match(T__0);
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
	public static class ConfblockContext extends ParserRuleContext {
		public ConfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_confblock; }
	 
		public ConfblockContext() { }
		public void copyFrom(ConfblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SharedNetBlockDirectiveContext extends ConfblockContext {
		public SharednetblockContext sharednetblock() {
			return getRuleContext(SharednetblockContext.class,0);
		}
		public SharedNetBlockDirectiveContext(ConfblockContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HostBlockDirectiveContext extends ConfblockContext {
		public HostblockContext hostblock() {
			return getRuleContext(HostblockContext.class,0);
		}
		public HostBlockDirectiveContext(ConfblockContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubnetBlockDirectiveContext extends ConfblockContext {
		public SubnetblockContext subnetblock() {
			return getRuleContext(SubnetblockContext.class,0);
		}
		public SubnetBlockDirectiveContext(ConfblockContext ctx) { copyFrom(ctx); }
	}

	public final ConfblockContext confblock() throws RecognitionException {
		ConfblockContext _localctx = new ConfblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_confblock);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				_localctx = new HostBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				hostblock();
				}
				break;
			case T__22:
				_localctx = new SubnetBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				subnetblock();
				}
				break;
			case T__19:
				_localctx = new SharedNetBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				sharednetblock();
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
	public static class SharednetblockContext extends ParserRuleContext {
		public TerminalNode HOSTNAME() { return getToken(iscdhcpParser.HOSTNAME, 0); }
		public List<SubnetblockContext> subnetblock() {
			return getRuleContexts(SubnetblockContext.class);
		}
		public SubnetblockContext subnetblock(int i) {
			return getRuleContext(SubnetblockContext.class,i);
		}
		public SharednetblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharednetblock; }
	}

	public final SharednetblockContext sharednetblock() throws RecognitionException {
		SharednetblockContext _localctx = new SharednetblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sharednetblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__19);
			setState(98);
			match(HOSTNAME);
			setState(99);
			match(T__20);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				subnetblock();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 );
			setState(105);
			match(T__21);
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
		public List<TerminalNode> IP4() { return getTokens(iscdhcpParser.IP4); }
		public TerminalNode IP4(int i) {
			return getToken(iscdhcpParser.IP4, i);
		}
		public List<SubnetblockbodyContext> subnetblockbody() {
			return getRuleContexts(SubnetblockbodyContext.class);
		}
		public SubnetblockbodyContext subnetblockbody(int i) {
			return getRuleContext(SubnetblockbodyContext.class,i);
		}
		public SubnetblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnetblock; }
	}

	public final SubnetblockContext subnetblock() throws RecognitionException {
		SubnetblockContext _localctx = new SubnetblockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subnetblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__22);
			setState(108);
			match(IP4);
			setState(109);
			match(T__23);
			setState(110);
			match(IP4);
			setState(111);
			match(T__20);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				subnetblockbody();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 504229888L) != 0) );
			setState(117);
			match(T__21);
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
	public static class SubnetblockbodyContext extends ParserRuleContext {
		public SubnetblockbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subnetblockbody; }
	 
		public SubnetblockbodyContext() { }
		public void copyFrom(SubnetblockbodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeDirectiveContext extends SubnetblockbodyContext {
		public List<TerminalNode> IP4() { return getTokens(iscdhcpParser.IP4); }
		public TerminalNode IP4(int i) {
			return getToken(iscdhcpParser.IP4, i);
		}
		public RangeDirectiveContext(SubnetblockbodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilenameDirectiveContext extends SubnetblockbodyContext {
		public TerminalNode FILEPATH() { return getToken(iscdhcpParser.FILEPATH, 0); }
		public FilenameDirectiveContext(SubnetblockbodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NextServerDirectiveContext extends SubnetblockbodyContext {
		public TerminalNode IP4() { return getToken(iscdhcpParser.IP4, 0); }
		public NextServerDirectiveContext(SubnetblockbodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionSubnetMaskDirectiveContext extends SubnetblockbodyContext {
		public TerminalNode NETMASK() { return getToken(iscdhcpParser.NETMASK, 0); }
		public OptionSubnetMaskDirectiveContext(SubnetblockbodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommonConfLineInSubnetblockContext extends SubnetblockbodyContext {
		public CommonconflineContext commonconfline() {
			return getRuleContext(CommonconflineContext.class,0);
		}
		public CommonConfLineInSubnetblockContext(SubnetblockbodyContext ctx) { copyFrom(ctx); }
	}

	public final SubnetblockbodyContext subnetblockbody() throws RecognitionException {
		SubnetblockbodyContext _localctx = new SubnetblockbodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subnetblockbody);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				_localctx = new RangeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__24);
				setState(120);
				match(IP4);
				setState(121);
				match(IP4);
				setState(122);
				match(T__0);
				}
				break;
			case T__25:
				_localctx = new OptionSubnetMaskDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__25);
				setState(124);
				match(NETMASK);
				setState(125);
				match(T__0);
				}
				break;
			case T__26:
				_localctx = new NextServerDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(T__26);
				setState(127);
				match(IP4);
				setState(128);
				match(T__0);
				}
				break;
			case T__27:
				_localctx = new FilenameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(T__27);
				setState(130);
				match(FILEPATH);
				setState(131);
				match(T__0);
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__17:
			case T__18:
				_localctx = new CommonConfLineInSubnetblockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				commonconfline();
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
	public static class HostblockContext extends ParserRuleContext {
		public TerminalNode HOSTNAME() { return getToken(iscdhcpParser.HOSTNAME, 0); }
		public List<Hostblockbody1Context> hostblockbody1() {
			return getRuleContexts(Hostblockbody1Context.class);
		}
		public Hostblockbody1Context hostblockbody1(int i) {
			return getRuleContext(Hostblockbody1Context.class,i);
		}
		public HostblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostblock; }
	}

	public final HostblockContext hostblock() throws RecognitionException {
		HostblockContext _localctx = new HostblockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hostblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__28);
			setState(136);
			match(HOSTNAME);
			setState(137);
			match(T__20);
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				hostblockbody1();
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7517106176L) != 0) );
			setState(143);
			match(T__21);
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
	public static class Hostblockbody1Context extends ParserRuleContext {
		public Hostblockbody1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostblockbody1; }
	 
		public Hostblockbody1Context() { }
		public void copyFrom(Hostblockbody1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HardwareEthernetDirectiveContext extends Hostblockbody1Context {
		public TerminalNode MACADDRESS() { return getToken(iscdhcpParser.MACADDRESS, 0); }
		public HardwareEthernetDirectiveContext(Hostblockbody1Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommonConfLineInHostblockContext extends Hostblockbody1Context {
		public CommonconflineContext commonconfline() {
			return getRuleContext(CommonconflineContext.class,0);
		}
		public CommonConfLineInHostblockContext(Hostblockbody1Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FixedAddressDirectiveContext extends Hostblockbody1Context {
		public TerminalNode IP4() { return getToken(iscdhcpParser.IP4, 0); }
		public FixedAddressDirectiveContext(Hostblockbody1Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionHostNameDirectiveContext extends Hostblockbody1Context {
		public TerminalNode QUOTEDHOSTNAME() { return getToken(iscdhcpParser.QUOTEDHOSTNAME, 0); }
		public OptionHostNameDirectiveContext(Hostblockbody1Context ctx) { copyFrom(ctx); }
	}

	public final Hostblockbody1Context hostblockbody1() throws RecognitionException {
		Hostblockbody1Context _localctx = new Hostblockbody1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_hostblockbody1);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				_localctx = new HardwareEthernetDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__29);
				setState(146);
				match(MACADDRESS);
				setState(147);
				match(T__0);
				}
				break;
			case T__30:
				_localctx = new FixedAddressDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__30);
				setState(149);
				match(IP4);
				setState(150);
				match(T__0);
				}
				break;
			case T__31:
				_localctx = new OptionHostNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(T__31);
				setState(152);
				match(QUOTEDHOSTNAME);
				setState(153);
				match(T__0);
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__17:
			case T__18:
				_localctx = new CommonConfLineInHostblockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				commonconfline();
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

	public static final String _serializedATN =
		"\u0004\u0001/\u009e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0016\b\u0000"+
		"\u000b\u0000\f\u0000\u0017\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002U\b\u0002\n\u0002\f\u0002X\t\u0002\u0001\u0002\u0003\u0002"+
		"[\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003`\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004f\b\u0004\u000b"+
		"\u0004\f\u0004g\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005r\b\u0005\u000b"+
		"\u0005\f\u0005s\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0086\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007\u008c\b\u0007\u000b\u0007\f\u0007\u008d\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u009c\b\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0000\u0001\u0001\u0000\u0003\u0004\u00b3\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u0004Z\u0001\u0000"+
		"\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000\u0000"+
		"\nk\u0001\u0000\u0000\u0000\f\u0085\u0001\u0000\u0000\u0000\u000e\u0087"+
		"\u0001\u0000\u0000\u0000\u0010\u009b\u0001\u0000\u0000\u0000\u0012\u0016"+
		"\u0003\u0002\u0001\u0000\u0013\u0016\u0003\u0004\u0002\u0000\u0014\u0016"+
		"\u0003\u0006\u0003\u0000\u0015\u0012\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0005(\u0000\u0000\u001c6\u0005\u0001\u0000\u0000\u001d\u001e\u0005\u0002"+
		"\u0000\u0000\u001e\u001f\u0007\u0000\u0000\u0000\u001f6\u0005\u0001\u0000"+
		"\u0000 !\u0005\u0005\u0000\u0000!\"\u0005*\u0000\u0000\"6\u0005\u0001"+
		"\u0000\u0000#$\u0005\u0006\u0000\u0000$%\u0005\'\u0000\u0000%6\u0005\u0001"+
		"\u0000\u0000&\'\u0005\u0007\u0000\u0000\'(\u0005\'\u0000\u0000(6\u0005"+
		"\u0001\u0000\u0000)*\u0005\b\u0000\u0000*+\u0005&\u0000\u0000+6\u0005"+
		"\u0001\u0000\u0000,-\u0005\t\u0000\u0000-.\u0005-\u0000\u0000.6\u0005"+
		"\u0001\u0000\u0000/0\u0005\n\u0000\u000001\u0005*\u0000\u000016\u0005"+
		"\u0001\u0000\u000023\u0005\u000b\u0000\u000034\u0005)\u0000\u000046\u0005"+
		"\u0001\u0000\u00005\u001b\u0001\u0000\u0000\u00005\u001d\u0001\u0000\u0000"+
		"\u00005 \u0001\u0000\u0000\u00005#\u0001\u0000\u0000\u00005&\u0001\u0000"+
		"\u0000\u00005)\u0001\u0000\u0000\u00005,\u0001\u0000\u0000\u00005/\u0001"+
		"\u0000\u0000\u000052\u0001\u0000\u0000\u00006\u0003\u0001\u0000\u0000"+
		"\u000078\u0005\f\u0000\u000089\u0005$\u0000\u00009[\u0005\u0001\u0000"+
		"\u0000:;\u0005\r\u0000\u0000;<\u0005+\u0000\u0000<[\u0005\u0001\u0000"+
		"\u0000=>\u0005\u000e\u0000\u0000>?\u0005%\u0000\u0000?[\u0005\u0001\u0000"+
		"\u0000@A\u0005\u000f\u0000\u0000AB\u0005$\u0000\u0000B[\u0005\u0001\u0000"+
		"\u0000CD\u0005\u0010\u0000\u0000DI\u0005\"\u0000\u0000EF\u0005\u0011\u0000"+
		"\u0000FH\u0005\"\u0000\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000L[\u0005\u0001\u0000\u0000MN\u0005"+
		"\u0012\u0000\u0000NO\u0005\"\u0000\u0000O[\u0005\u0001\u0000\u0000PQ\u0005"+
		"\u0013\u0000\u0000QV\u0005$\u0000\u0000RS\u0005\u0011\u0000\u0000SU\u0005"+
		"$\u0000\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000Y[\u0005\u0001\u0000\u0000Z7\u0001\u0000\u0000"+
		"\u0000Z:\u0001\u0000\u0000\u0000Z=\u0001\u0000\u0000\u0000Z@\u0001\u0000"+
		"\u0000\u0000ZC\u0001\u0000\u0000\u0000ZM\u0001\u0000\u0000\u0000ZP\u0001"+
		"\u0000\u0000\u0000[\u0005\u0001\u0000\u0000\u0000\\`\u0003\u000e\u0007"+
		"\u0000]`\u0003\n\u0005\u0000^`\u0003\b\u0004\u0000_\\\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`\u0007\u0001"+
		"\u0000\u0000\u0000ab\u0005\u0014\u0000\u0000bc\u0005,\u0000\u0000ce\u0005"+
		"\u0015\u0000\u0000df\u0003\n\u0005\u0000ed\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ij\u0005\u0016\u0000\u0000j\t\u0001\u0000\u0000"+
		"\u0000kl\u0005\u0017\u0000\u0000lm\u0005\"\u0000\u0000mn\u0005\u0018\u0000"+
		"\u0000no\u0005\"\u0000\u0000oq\u0005\u0015\u0000\u0000pr\u0003\f\u0006"+
		"\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005"+
		"\u0016\u0000\u0000v\u000b\u0001\u0000\u0000\u0000wx\u0005\u0019\u0000"+
		"\u0000xy\u0005\"\u0000\u0000yz\u0005\"\u0000\u0000z\u0086\u0005\u0001"+
		"\u0000\u0000{|\u0005\u001a\u0000\u0000|}\u0005#\u0000\u0000}\u0086\u0005"+
		"\u0001\u0000\u0000~\u007f\u0005\u001b\u0000\u0000\u007f\u0080\u0005\""+
		"\u0000\u0000\u0080\u0086\u0005\u0001\u0000\u0000\u0081\u0082\u0005\u001c"+
		"\u0000\u0000\u0082\u0083\u0005-\u0000\u0000\u0083\u0086\u0005\u0001\u0000"+
		"\u0000\u0084\u0086\u0003\u0004\u0002\u0000\u0085w\u0001\u0000\u0000\u0000"+
		"\u0085{\u0001\u0000\u0000\u0000\u0085~\u0001\u0000\u0000\u0000\u0085\u0081"+
		"\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\r\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\u001d\u0000\u0000\u0088\u0089\u0005"+
		",\u0000\u0000\u0089\u008b\u0005\u0015\u0000\u0000\u008a\u008c\u0003\u0010"+
		"\b\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0016\u0000"+
		"\u0000\u0090\u000f\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u001e\u0000"+
		"\u0000\u0092\u0093\u0005!\u0000\u0000\u0093\u009c\u0005\u0001\u0000\u0000"+
		"\u0094\u0095\u0005\u001f\u0000\u0000\u0095\u0096\u0005\"\u0000\u0000\u0096"+
		"\u009c\u0005\u0001\u0000\u0000\u0097\u0098\u0005 \u0000\u0000\u0098\u0099"+
		"\u0005+\u0000\u0000\u0099\u009c\u0005\u0001\u0000\u0000\u009a\u009c\u0003"+
		"\u0004\u0002\u0000\u009b\u0091\u0001\u0000\u0000\u0000\u009b\u0094\u0001"+
		"\u0000\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u0011\u0001\u0000\u0000\u0000\f\u0015\u00175"+
		"IVZ_gs\u0085\u008d\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}