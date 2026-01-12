// Generated from /home/compiler/git/dhcpparser-dev/src/main/antlr4/edu/aast/cndc/dhcpparser/iscdhcp.g4 by ANTLR 4.13.1
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, MACADDRESS=40, IP4=41, NETMASK=42, DOMAINNAME=43, REVDOMAINNAME=44, 
		LOGFACILITY=45, TIMEINSEC=46, SINGLEDIRECTIVE=47, UPDATESTYLES=48, ONOFFSWITCH=49, 
		QUOTEDHOSTNAME=50, HOSTNAME=51, FILEPATH=52, SECRET=53, COMMENT=54, WS=55;
	public static final int
		RULE_config = 0, RULE_serverconfline = 1, RULE_commonconfline = 2, RULE_confblock = 3, 
		RULE_keyblock = 4, RULE_sharednetblock = 5, RULE_subnetblock = 6, RULE_subnetblockbody = 7, 
		RULE_hostblock = 8, RULE_hostblockbody1 = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"config", "serverconfline", "commonconfline", "confblock", "keyblock", 
			"sharednetblock", "subnetblock", "subnetblockbody", "hostblock", "hostblockbody1"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'allow'", "'booting'", "'bootp'", "'update-static-leases'", 
			"'default-lease-time'", "'max-lease-time'", "'log-facility'", "'include'", 
			"'ddns-updates'", "'ddns-update-style'", "'ddns-domainname'", "'ddns-hostname'", 
			"'ddns-rev-domainname'", "'option domain-name'", "'option domain-name-servers'", 
			"','", "'option routers'", "'option domain-search'", "'key'", "'{'", 
			"'algorithm'", "'hmac-md5'", "'hmac-sha1'", "'hmac-sha256'", "'secret'", 
			"'};'", "'shared-network'", "'}'", "'subnet'", "'netmask'", "'range'", 
			"'option subnet-mask'", "'next-server'", "'filename'", "'host'", "'hardware ethernet'", 
			"'fixed-address'", "'option host-name'", null, null, null, null, null, 
			null, null, "'authoritative'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "MACADDRESS", "IP4", "NETMASK", "DOMAINNAME", 
			"REVDOMAINNAME", "LOGFACILITY", "TIMEINSEC", "SINGLEDIRECTIVE", "UPDATESTYLES", 
			"ONOFFSWITCH", "QUOTEDHOSTNAME", "HOSTNAME", "FILEPATH", "SECRET", "COMMENT", 
			"WS"
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


	        // You can add any helper methods or fields here if needed
	        void startFile() {   }
	        void finishFile() { }
	    
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
		public List<KeyblockContext> keyblock() {
			return getRuleContexts(KeyblockContext.class);
		}
		public KeyblockContext keyblock(int i) {
			return getRuleContext(KeyblockContext.class,i);
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
			 startFile(); 
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(25);
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
					setState(21);
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
					setState(22);
					commonconfline();
					}
					break;
				case T__27:
				case T__29:
				case T__35:
					{
					setState(23);
					confblock();
					}
					break;
				case T__19:
					{
					setState(24);
					keyblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 140807551975396L) != 0) );
			setState(29);
			match(EOF);
			   finishFile();
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLEDIRECTIVE:
				_localctx = new AuthoritativeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(SINGLEDIRECTIVE);
				setState(33);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new AllowBootingDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__1);
				setState(35);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(36);
				match(T__0);
				}
				break;
			case T__4:
				_localctx = new UpdateStaticLeasesDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(T__4);
				setState(38);
				match(ONOFFSWITCH);
				setState(39);
				match(T__0);
				}
				break;
			case T__5:
				_localctx = new DefaultLeaseTimeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(T__5);
				setState(41);
				match(TIMEINSEC);
				setState(42);
				match(T__0);
				}
				break;
			case T__6:
				_localctx = new MaxLeaseTimeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				match(T__6);
				setState(44);
				match(TIMEINSEC);
				setState(45);
				match(T__0);
				}
				break;
			case T__7:
				_localctx = new LogFacilityDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				match(T__7);
				setState(47);
				match(LOGFACILITY);
				setState(48);
				match(T__0);
				}
				break;
			case T__8:
				_localctx = new IncludeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				match(T__8);
				setState(50);
				match(FILEPATH);
				setState(51);
				match(T__0);
				}
				break;
			case T__9:
				_localctx = new DDNSUpdatesDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(52);
				match(T__9);
				setState(53);
				match(ONOFFSWITCH);
				setState(54);
				match(T__0);
				}
				break;
			case T__10:
				_localctx = new DDNSUpdateStyleDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(55);
				match(T__10);
				setState(56);
				match(UPDATESTYLES);
				setState(57);
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new DDNSDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__11);
				setState(61);
				match(DOMAINNAME);
				setState(62);
				match(T__0);
				}
				break;
			case T__12:
				_localctx = new DDNSHostNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__12);
				setState(64);
				match(QUOTEDHOSTNAME);
				setState(65);
				match(T__0);
				}
				break;
			case T__13:
				_localctx = new DDNSRevDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(T__13);
				setState(67);
				match(REVDOMAINNAME);
				setState(68);
				match(T__0);
				}
				break;
			case T__14:
				_localctx = new OptionDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(T__14);
				setState(70);
				match(DOMAINNAME);
				setState(71);
				match(T__0);
				}
				break;
			case T__15:
				_localctx = new OptionDomainNameServersDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				match(T__15);
				{
				setState(73);
				match(IP4);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(74);
					match(T__16);
					setState(75);
					match(IP4);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(81);
				match(T__0);
				}
				break;
			case T__17:
				_localctx = new OptionRoutersDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(T__17);
				setState(83);
				match(IP4);
				setState(84);
				match(T__0);
				}
				break;
			case T__18:
				_localctx = new OptionDomainSearchDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				match(T__18);
				{
				setState(86);
				match(DOMAINNAME);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(87);
					match(T__16);
					setState(88);
					match(DOMAINNAME);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(94);
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				_localctx = new HostBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				hostblock();
				}
				break;
			case T__29:
				_localctx = new SubnetBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				subnetblock();
				}
				break;
			case T__27:
				_localctx = new SharedNetBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
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
	public static class KeyblockContext extends ParserRuleContext {
		public KeyblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyblock; }
	 
		public KeyblockContext() { }
		public void copyFrom(KeyblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyBlockDirectiveContext extends KeyblockContext {
		public TerminalNode HOSTNAME() { return getToken(iscdhcpParser.HOSTNAME, 0); }
		public TerminalNode SECRET() { return getToken(iscdhcpParser.SECRET, 0); }
		public KeyBlockDirectiveContext(KeyblockContext ctx) { copyFrom(ctx); }
	}

	public final KeyblockContext keyblock() throws RecognitionException {
		KeyblockContext _localctx = new KeyblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_keyblock);
		int _la;
		try {
			_localctx = new KeyBlockDirectiveContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__19);
			setState(103);
			match(HOSTNAME);
			setState(104);
			match(T__20);
			setState(105);
			match(T__21);
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(107);
			match(T__0);
			setState(108);
			match(T__25);
			setState(109);
			match(SECRET);
			setState(110);
			match(T__0);
			setState(111);
			match(T__26);
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
		enterRule(_localctx, 10, RULE_sharednetblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__27);
			setState(114);
			match(HOSTNAME);
			setState(115);
			match(T__20);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				subnetblock();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__29 );
			setState(121);
			match(T__28);
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
		enterRule(_localctx, 12, RULE_subnetblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__29);
			setState(124);
			match(IP4);
			setState(125);
			match(T__30);
			setState(126);
			match(IP4);
			setState(127);
			match(T__20);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				subnetblockbody();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 64425422848L) != 0) );
			setState(133);
			match(T__28);
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
		enterRule(_localctx, 14, RULE_subnetblockbody);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				_localctx = new RangeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__31);
				setState(136);
				match(IP4);
				setState(137);
				match(IP4);
				setState(138);
				match(T__0);
				}
				break;
			case T__32:
				_localctx = new OptionSubnetMaskDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__32);
				setState(140);
				match(NETMASK);
				setState(141);
				match(T__0);
				}
				break;
			case T__33:
				_localctx = new NextServerDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(T__33);
				setState(143);
				match(IP4);
				setState(144);
				match(T__0);
				}
				break;
			case T__34:
				_localctx = new FilenameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(T__34);
				setState(146);
				match(FILEPATH);
				setState(147);
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
				setState(148);
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
		enterRule(_localctx, 16, RULE_hostblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__35);
			setState(152);
			match(HOSTNAME);
			setState(153);
			match(T__20);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				hostblockbody1();
				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 962073587712L) != 0) );
			setState(159);
			match(T__28);
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
		enterRule(_localctx, 18, RULE_hostblockbody1);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				_localctx = new HardwareEthernetDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(T__36);
				setState(162);
				match(MACADDRESS);
				setState(163);
				match(T__0);
				}
				break;
			case T__37:
				_localctx = new FixedAddressDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(T__37);
				setState(165);
				match(IP4);
				setState(166);
				match(T__0);
				}
				break;
			case T__38:
				_localctx = new OptionHostNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(T__38);
				setState(168);
				match(QUOTEDHOSTNAME);
				setState(169);
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
				setState(170);
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
		"\u0004\u00017\u00ae\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u0000\u001a\b\u0000\u000b\u0000\f\u0000\u001b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001;\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002M\b"+
		"\u0002\n\u0002\f\u0002P\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002Z\b"+
		"\u0002\n\u0002\f\u0002]\t\u0002\u0001\u0002\u0003\u0002`\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003e\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0004\u0005v\b\u0005\u000b\u0005\f\u0005w\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006\u0082\b\u0006\u000b\u0006\f\u0006\u0083\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0096\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\b\u009c\b\b\u000b\b\f\b\u009d\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00ac\b\t\u0001\t\u0000\u0000\n\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0001\u0000\u0003\u0004"+
		"\u0001\u0000\u0017\u0019\u00c3\u0000\u0014\u0001\u0000\u0000\u0000\u0002"+
		":\u0001\u0000\u0000\u0000\u0004_\u0001\u0000\u0000\u0000\u0006d\u0001"+
		"\u0000\u0000\u0000\bf\u0001\u0000\u0000\u0000\nq\u0001\u0000\u0000\u0000"+
		"\f{\u0001\u0000\u0000\u0000\u000e\u0095\u0001\u0000\u0000\u0000\u0010"+
		"\u0097\u0001\u0000\u0000\u0000\u0012\u00ab\u0001\u0000\u0000\u0000\u0014"+
		"\u0019\u0006\u0000\uffff\uffff\u0000\u0015\u001a\u0003\u0002\u0001\u0000"+
		"\u0016\u001a\u0003\u0004\u0002\u0000\u0017\u001a\u0003\u0006\u0003\u0000"+
		"\u0018\u001a\u0003\b\u0004\u0000\u0019\u0015\u0001\u0000\u0000\u0000\u0019"+
		"\u0016\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0000\u0000\u0001\u001e"+
		"\u001f\u0006\u0000\uffff\uffff\u0000\u001f\u0001\u0001\u0000\u0000\u0000"+
		" !\u0005/\u0000\u0000!;\u0005\u0001\u0000\u0000\"#\u0005\u0002\u0000\u0000"+
		"#$\u0007\u0000\u0000\u0000$;\u0005\u0001\u0000\u0000%&\u0005\u0005\u0000"+
		"\u0000&\'\u00051\u0000\u0000\';\u0005\u0001\u0000\u0000()\u0005\u0006"+
		"\u0000\u0000)*\u0005.\u0000\u0000*;\u0005\u0001\u0000\u0000+,\u0005\u0007"+
		"\u0000\u0000,-\u0005.\u0000\u0000-;\u0005\u0001\u0000\u0000./\u0005\b"+
		"\u0000\u0000/0\u0005-\u0000\u00000;\u0005\u0001\u0000\u000012\u0005\t"+
		"\u0000\u000023\u00054\u0000\u00003;\u0005\u0001\u0000\u000045\u0005\n"+
		"\u0000\u000056\u00051\u0000\u00006;\u0005\u0001\u0000\u000078\u0005\u000b"+
		"\u0000\u000089\u00050\u0000\u00009;\u0005\u0001\u0000\u0000: \u0001\u0000"+
		"\u0000\u0000:\"\u0001\u0000\u0000\u0000:%\u0001\u0000\u0000\u0000:(\u0001"+
		"\u0000\u0000\u0000:+\u0001\u0000\u0000\u0000:.\u0001\u0000\u0000\u0000"+
		":1\u0001\u0000\u0000\u0000:4\u0001\u0000\u0000\u0000:7\u0001\u0000\u0000"+
		"\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0005\f\u0000\u0000=>\u0005+\u0000"+
		"\u0000>`\u0005\u0001\u0000\u0000?@\u0005\r\u0000\u0000@A\u00052\u0000"+
		"\u0000A`\u0005\u0001\u0000\u0000BC\u0005\u000e\u0000\u0000CD\u0005,\u0000"+
		"\u0000D`\u0005\u0001\u0000\u0000EF\u0005\u000f\u0000\u0000FG\u0005+\u0000"+
		"\u0000G`\u0005\u0001\u0000\u0000HI\u0005\u0010\u0000\u0000IN\u0005)\u0000"+
		"\u0000JK\u0005\u0011\u0000\u0000KM\u0005)\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000Q`\u0005"+
		"\u0001\u0000\u0000RS\u0005\u0012\u0000\u0000ST\u0005)\u0000\u0000T`\u0005"+
		"\u0001\u0000\u0000UV\u0005\u0013\u0000\u0000V[\u0005+\u0000\u0000WX\u0005"+
		"\u0011\u0000\u0000XZ\u0005+\u0000\u0000YW\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0005\u0001\u0000"+
		"\u0000_<\u0001\u0000\u0000\u0000_?\u0001\u0000\u0000\u0000_B\u0001\u0000"+
		"\u0000\u0000_E\u0001\u0000\u0000\u0000_H\u0001\u0000\u0000\u0000_R\u0001"+
		"\u0000\u0000\u0000_U\u0001\u0000\u0000\u0000`\u0005\u0001\u0000\u0000"+
		"\u0000ae\u0003\u0010\b\u0000be\u0003\f\u0006\u0000ce\u0003\n\u0005\u0000"+
		"da\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000e\u0007\u0001\u0000\u0000\u0000fg\u0005\u0014\u0000\u0000gh\u0005"+
		"3\u0000\u0000hi\u0005\u0015\u0000\u0000ij\u0005\u0016\u0000\u0000jk\u0007"+
		"\u0001\u0000\u0000kl\u0005\u0001\u0000\u0000lm\u0005\u001a\u0000\u0000"+
		"mn\u00055\u0000\u0000no\u0005\u0001\u0000\u0000op\u0005\u001b\u0000\u0000"+
		"p\t\u0001\u0000\u0000\u0000qr\u0005\u001c\u0000\u0000rs\u00053\u0000\u0000"+
		"su\u0005\u0015\u0000\u0000tv\u0003\f\u0006\u0000ut\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0005\u001d\u0000\u0000z\u000b\u0001"+
		"\u0000\u0000\u0000{|\u0005\u001e\u0000\u0000|}\u0005)\u0000\u0000}~\u0005"+
		"\u001f\u0000\u0000~\u007f\u0005)\u0000\u0000\u007f\u0081\u0005\u0015\u0000"+
		"\u0000\u0080\u0082\u0003\u000e\u0007\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\u001d\u0000\u0000\u0086\r\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005 \u0000\u0000\u0088\u0089\u0005)\u0000\u0000\u0089\u008a"+
		"\u0005)\u0000\u0000\u008a\u0096\u0005\u0001\u0000\u0000\u008b\u008c\u0005"+
		"!\u0000\u0000\u008c\u008d\u0005*\u0000\u0000\u008d\u0096\u0005\u0001\u0000"+
		"\u0000\u008e\u008f\u0005\"\u0000\u0000\u008f\u0090\u0005)\u0000\u0000"+
		"\u0090\u0096\u0005\u0001\u0000\u0000\u0091\u0092\u0005#\u0000\u0000\u0092"+
		"\u0093\u00054\u0000\u0000\u0093\u0096\u0005\u0001\u0000\u0000\u0094\u0096"+
		"\u0003\u0004\u0002\u0000\u0095\u0087\u0001\u0000\u0000\u0000\u0095\u008b"+
		"\u0001\u0000\u0000\u0000\u0095\u008e\u0001\u0000\u0000\u0000\u0095\u0091"+
		"\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u000f"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005$\u0000\u0000\u0098\u0099\u0005"+
		"3\u0000\u0000\u0099\u009b\u0005\u0015\u0000\u0000\u009a\u009c\u0003\u0012"+
		"\t\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u001d\u0000"+
		"\u0000\u00a0\u0011\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005%\u0000\u0000"+
		"\u00a2\u00a3\u0005(\u0000\u0000\u00a3\u00ac\u0005\u0001\u0000\u0000\u00a4"+
		"\u00a5\u0005&\u0000\u0000\u00a5\u00a6\u0005)\u0000\u0000\u00a6\u00ac\u0005"+
		"\u0001\u0000\u0000\u00a7\u00a8\u0005\'\u0000\u0000\u00a8\u00a9\u00052"+
		"\u0000\u0000\u00a9\u00ac\u0005\u0001\u0000\u0000\u00aa\u00ac\u0003\u0004"+
		"\u0002\u0000\u00ab\u00a1\u0001\u0000\u0000\u0000\u00ab\u00a4\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u0013\u0001\u0000\u0000\u0000\f\u0019\u001b:N[_dw\u0083"+
		"\u0095\u009d\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}