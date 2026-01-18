// Generated from /home/compiler/git/dhcpops/src/main/antlr4/edu/aast/cndc/dhcpparser/iscdhcp.g4 by ANTLR 4.13.1
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, ARCHTYPE=50, TYPE=51, MACADDRESS=52, 
		IP4=53, NETMASK=54, REVDOMAINNAME=55, QUOTEDREVDOMAINNAME=56, DOMAINNAME=57, 
		QUOTEDDOMAINNAME=58, LOGFACILITY=59, POSTIVENUMBER=60, SINGLEDIRECTIVE=61, 
		UPDATESTYLES=62, ONOFFSWITCH=63, QUOTEDHOSTNAME=64, HOSTNAME=65, FILEPATH=66, 
		SECRET=67, COMMENT=68, WS=69;
	public static final int
		RULE_config = 0, RULE_serverconfline = 1, RULE_commonconfline = 2, RULE_if = 3, 
		RULE_confblock = 4, RULE_keyblock = 5, RULE_zoneblock = 6, RULE_sharednetblock = 7, 
		RULE_subnetblock = 8, RULE_subnetblockbody = 9, RULE_hostblock = 10, RULE_hostblockbody1 = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"config", "serverconfline", "commonconfline", "if", "confblock", "keyblock", 
			"zoneblock", "sharednetblock", "subnetblock", "subnetblockbody", "hostblock", 
			"hostblockbody1"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'allow'", "'booting'", "'bootp'", "'update-static-leases'", 
			"'default-lease-time'", "'max-lease-time'", "'log-facility'", "'include'", 
			"'ddns-updates'", "'ddns-update-style'", "'ddns-domainname'", "'ddns-hostname'", 
			"'ddns-rev-domainname'", "'option domain-name'", "'option domain-name-servers'", 
			"','", "'option routers'", "'option domain-search'", "'filename'", "'option'", 
			"'arch'", "'code'", "'='", "'16'", "'32'", "'if'", "'{'", "'}'", "'else'", 
			"'key'", "'algorithm'", "'hmac-md5'", "'hmac-sha1'", "'hmac-sha256'", 
			"'secret'", "'};'", "'zone'", "'primary'", "'shared-network'", "'subnet'", 
			"'netmask'", "'range'", "'option subnet-mask'", "'next-server'", "'host'", 
			"'hardware ethernet'", "'fixed-address'", "'option host-name'", null, 
			null, null, null, null, null, null, null, null, null, null, "'authoritative'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ARCHTYPE", "TYPE", "MACADDRESS", "IP4", "NETMASK", "REVDOMAINNAME", 
			"QUOTEDREVDOMAINNAME", "DOMAINNAME", "QUOTEDDOMAINNAME", "LOGFACILITY", 
			"POSTIVENUMBER", "SINGLEDIRECTIVE", "UPDATESTYLES", "ONOFFSWITCH", "QUOTEDHOSTNAME", 
			"HOSTNAME", "FILEPATH", "SECRET", "COMMENT", "WS"
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
		public List<ZoneblockContext> zoneblock() {
			return getRuleContexts(ZoneblockContext.class);
		}
		public ZoneblockContext zoneblock(int i) {
			return getRuleContext(ZoneblockContext.class,i);
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
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(30);
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
					setState(25);
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
				case T__19:
				case T__20:
				case T__26:
					{
					setState(26);
					commonconfline();
					}
					break;
				case T__39:
				case T__40:
				case T__45:
					{
					setState(27);
					confblock();
					}
					break;
				case T__30:
					{
					setState(28);
					keyblock();
					}
					break;
				case T__37:
					{
					setState(29);
					zoneblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2305916953656426468L) != 0) );
			setState(34);
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
		public TerminalNode POSTIVENUMBER() { return getToken(iscdhcpParser.POSTIVENUMBER, 0); }
		public DefaultLeaseTimeDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxLeaseTimeDirectiveContext extends ServerconflineContext {
		public TerminalNode POSTIVENUMBER() { return getToken(iscdhcpParser.POSTIVENUMBER, 0); }
		public MaxLeaseTimeDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
	}

	public final ServerconflineContext serverconfline() throws RecognitionException {
		ServerconflineContext _localctx = new ServerconflineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_serverconfline);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLEDIRECTIVE:
				_localctx = new AuthoritativeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(SINGLEDIRECTIVE);
				setState(38);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new AllowBootingDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__1);
				setState(40);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(41);
				match(T__0);
				}
				break;
			case T__4:
				_localctx = new UpdateStaticLeasesDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(T__4);
				setState(43);
				match(ONOFFSWITCH);
				setState(44);
				match(T__0);
				}
				break;
			case T__5:
				_localctx = new DefaultLeaseTimeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(T__5);
				setState(46);
				match(POSTIVENUMBER);
				setState(47);
				match(T__0);
				}
				break;
			case T__6:
				_localctx = new MaxLeaseTimeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				match(T__6);
				setState(49);
				match(POSTIVENUMBER);
				setState(50);
				match(T__0);
				}
				break;
			case T__7:
				_localctx = new LogFacilityDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(T__7);
				setState(52);
				match(LOGFACILITY);
				setState(53);
				match(T__0);
				}
				break;
			case T__8:
				_localctx = new IncludeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(T__8);
				setState(55);
				match(FILEPATH);
				setState(56);
				match(T__0);
				}
				break;
			case T__9:
				_localctx = new DDNSUpdatesDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				match(T__9);
				setState(58);
				match(ONOFFSWITCH);
				setState(59);
				match(T__0);
				}
				break;
			case T__10:
				_localctx = new DDNSUpdateStyleDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(60);
				match(T__10);
				setState(61);
				match(UPDATESTYLES);
				setState(62);
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
		public TerminalNode QUOTEDREVDOMAINNAME() { return getToken(iscdhcpParser.QUOTEDREVDOMAINNAME, 0); }
		public DDNSRevDomainNameDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionRoutersDirectiveContext extends CommonconflineContext {
		public TerminalNode IP4() { return getToken(iscdhcpParser.IP4, 0); }
		public OptionRoutersDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfOnlyDirectiveContext extends CommonconflineContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public IfOnlyDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionDomainSearchDirectiveContext extends CommonconflineContext {
		public List<TerminalNode> QUOTEDDOMAINNAME() { return getTokens(iscdhcpParser.QUOTEDDOMAINNAME); }
		public TerminalNode QUOTEDDOMAINNAME(int i) {
			return getToken(iscdhcpParser.QUOTEDDOMAINNAME, i);
		}
		public OptionDomainSearchDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DDNSHostNameDirectiveContext extends CommonconflineContext {
		public TerminalNode QUOTEDHOSTNAME() { return getToken(iscdhcpParser.QUOTEDHOSTNAME, 0); }
		public DDNSHostNameDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilenameDirectiveCommonContext extends CommonconflineContext {
		public TerminalNode FILEPATH() { return getToken(iscdhcpParser.FILEPATH, 0); }
		public FilenameDirectiveCommonContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DDNSDomainNameDirectiveContext extends CommonconflineContext {
		public TerminalNode QUOTEDDOMAINNAME() { return getToken(iscdhcpParser.QUOTEDDOMAINNAME, 0); }
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
	public static class OptionArchDirectiveContext extends CommonconflineContext {
		public TerminalNode POSTIVENUMBER() { return getToken(iscdhcpParser.POSTIVENUMBER, 0); }
		public TerminalNode TYPE() { return getToken(iscdhcpParser.TYPE, 0); }
		public OptionArchDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionDomainNameDirectiveContext extends CommonconflineContext {
		public TerminalNode QUOTEDDOMAINNAME() { return getToken(iscdhcpParser.QUOTEDDOMAINNAME, 0); }
		public OptionDomainNameDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
	}

	public final CommonconflineContext commonconfline() throws RecognitionException {
		CommonconflineContext _localctx = new CommonconflineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commonconfline);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new DDNSDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__11);
				setState(66);
				match(QUOTEDDOMAINNAME);
				setState(67);
				match(T__0);
				}
				break;
			case T__12:
				_localctx = new DDNSHostNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__12);
				setState(69);
				match(QUOTEDHOSTNAME);
				setState(70);
				match(T__0);
				}
				break;
			case T__13:
				_localctx = new DDNSRevDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(T__13);
				setState(72);
				match(QUOTEDREVDOMAINNAME);
				setState(73);
				match(T__0);
				}
				break;
			case T__14:
				_localctx = new OptionDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(T__14);
				setState(75);
				match(QUOTEDDOMAINNAME);
				setState(76);
				match(T__0);
				}
				break;
			case T__15:
				_localctx = new OptionDomainNameServersDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				match(T__15);
				{
				setState(78);
				match(IP4);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(79);
					match(T__16);
					setState(80);
					match(IP4);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(86);
				match(T__0);
				}
				break;
			case T__17:
				_localctx = new OptionRoutersDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				match(T__17);
				setState(88);
				match(IP4);
				setState(89);
				match(T__0);
				}
				break;
			case T__18:
				_localctx = new OptionDomainSearchDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				match(T__18);
				{
				setState(91);
				match(QUOTEDDOMAINNAME);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(92);
					match(T__16);
					setState(93);
					match(QUOTEDDOMAINNAME);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(99);
				match(T__0);
				}
				break;
			case T__19:
				_localctx = new FilenameDirectiveCommonContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				match(T__19);
				setState(101);
				match(FILEPATH);
				setState(102);
				match(T__0);
				}
				break;
			case T__20:
				_localctx = new OptionArchDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				match(T__20);
				setState(104);
				match(T__21);
				setState(105);
				match(T__22);
				setState(106);
				match(POSTIVENUMBER);
				setState(107);
				match(T__23);
				setState(108);
				match(TYPE);
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(110);
				match(T__0);
				}
				break;
			case T__26:
				_localctx = new IfOnlyDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(111);
				if_();
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
	public static class IfContext extends ParserRuleContext {
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	 
		public IfContext() { }
		public void copyFrom(IfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionArchIfContext extends IfContext {
		public TerminalNode ARCHTYPE() { return getToken(iscdhcpParser.ARCHTYPE, 0); }
		public List<CommonconflineContext> commonconfline() {
			return getRuleContexts(CommonconflineContext.class);
		}
		public CommonconflineContext commonconfline(int i) {
			return getRuleContext(CommonconflineContext.class,i);
		}
		public OptionArchIfContext(IfContext ctx) { copyFrom(ctx); }
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if);
		int _la;
		try {
			_localctx = new OptionArchIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__26);
			setState(115);
			match(T__20);
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			match(T__23);
			setState(118);
			match(ARCHTYPE);
			setState(119);
			match(T__27);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				commonconfline();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 138276864L) != 0) );
			setState(125);
			match(T__28);
			setState(126);
			match(T__29);
			setState(127);
			match(T__27);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				commonconfline();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 138276864L) != 0) );
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
		enterRule(_localctx, 8, RULE_confblock);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				_localctx = new HostBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				hostblock();
				}
				break;
			case T__40:
				_localctx = new SubnetBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				subnetblock();
				}
				break;
			case T__39:
				_localctx = new SharedNetBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
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
		enterRule(_localctx, 10, RULE_keyblock);
		int _la;
		try {
			_localctx = new KeyBlockDirectiveContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__30);
			setState(141);
			match(HOSTNAME);
			setState(142);
			match(T__27);
			setState(143);
			match(T__31);
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(145);
			match(T__0);
			setState(146);
			match(T__35);
			setState(147);
			match(SECRET);
			setState(148);
			match(T__0);
			setState(149);
			match(T__36);
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
	public static class ZoneblockContext extends ParserRuleContext {
		public ZoneblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zoneblock; }
	 
		public ZoneblockContext() { }
		public void copyFrom(ZoneblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ZoneBlockDirectiveContext extends ZoneblockContext {
		public TerminalNode IP4() { return getToken(iscdhcpParser.IP4, 0); }
		public TerminalNode HOSTNAME() { return getToken(iscdhcpParser.HOSTNAME, 0); }
		public TerminalNode DOMAINNAME() { return getToken(iscdhcpParser.DOMAINNAME, 0); }
		public TerminalNode REVDOMAINNAME() { return getToken(iscdhcpParser.REVDOMAINNAME, 0); }
		public ZoneBlockDirectiveContext(ZoneblockContext ctx) { copyFrom(ctx); }
	}

	public final ZoneblockContext zoneblock() throws RecognitionException {
		ZoneblockContext _localctx = new ZoneblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_zoneblock);
		int _la;
		try {
			_localctx = new ZoneBlockDirectiveContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__37);
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==REVDOMAINNAME || _la==DOMAINNAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(153);
			match(T__27);
			setState(154);
			match(T__38);
			setState(155);
			match(IP4);
			setState(156);
			match(T__0);
			setState(157);
			match(T__30);
			setState(158);
			match(HOSTNAME);
			setState(159);
			match(T__0);
			setState(160);
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
		enterRule(_localctx, 14, RULE_sharednetblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__39);
			setState(163);
			match(HOSTNAME);
			setState(164);
			match(T__27);
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				subnetblock();
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__40 );
			setState(170);
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
		enterRule(_localctx, 16, RULE_subnetblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__40);
			setState(173);
			match(IP4);
			setState(174);
			match(T__41);
			setState(175);
			match(IP4);
			setState(176);
			match(T__27);
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				subnetblockbody();
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 61572789432320L) != 0) );
			setState(182);
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
		enterRule(_localctx, 18, RULE_subnetblockbody);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new RangeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__42);
				setState(185);
				match(IP4);
				setState(186);
				match(IP4);
				setState(187);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new OptionSubnetMaskDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(T__43);
				setState(189);
				match(NETMASK);
				setState(190);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new NextServerDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(T__44);
				setState(192);
				match(IP4);
				setState(193);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new FilenameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(T__19);
				setState(195);
				match(FILEPATH);
				setState(196);
				match(T__0);
				}
				break;
			case 5:
				_localctx = new CommonConfLineInSubnetblockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				commonconfline();
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
		enterRule(_localctx, 20, RULE_hostblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__45);
			setState(201);
			match(HOSTNAME);
			setState(202);
			match(T__27);
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(203);
				hostblockbody1();
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 985162556764160L) != 0) );
			setState(208);
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
		enterRule(_localctx, 22, RULE_hostblockbody1);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				_localctx = new HardwareEthernetDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__46);
				setState(211);
				match(MACADDRESS);
				setState(212);
				match(T__0);
				}
				break;
			case T__47:
				_localctx = new FixedAddressDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__47);
				setState(214);
				match(IP4);
				setState(215);
				match(T__0);
				}
				break;
			case T__48:
				_localctx = new OptionHostNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(T__48);
				setState(217);
				match(QUOTEDHOSTNAME);
				setState(218);
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
			case T__19:
			case T__20:
			case T__26:
				_localctx = new CommonConfLineInHostblockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
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
		"\u0004\u0001E\u00df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u001f\b\u0000\u000b\u0000\f\u0000 \u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002R\b\u0002\n\u0002\f\u0002U\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002_\b\u0002\n\u0002\f\u0002b\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002q\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003z\b"+
		"\u0003\u000b\u0003\f\u0003{\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u0082\b\u0003\u000b\u0003\f\u0003\u0083\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008b\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u00a7\b\u0007\u000b\u0007\f\u0007"+
		"\u00a8\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0004\b\u00b3\b\b\u000b\b\f\b\u00b4\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c7\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u00cd\b\n\u000b\n\f\n\u00ce\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00dd\b\u000b\u0001\u000b\u0000"+
		"\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000"+
		"\u0005\u0001\u0000\u0003\u0004\u0001\u0000\u0019\u001a\u0001\u0000\u0016"+
		"\u0017\u0001\u0000!#\u0002\u00007799\u00f8\u0000\u0018\u0001\u0000\u0000"+
		"\u0000\u0002?\u0001\u0000\u0000\u0000\u0004p\u0001\u0000\u0000\u0000\u0006"+
		"r\u0001\u0000\u0000\u0000\b\u008a\u0001\u0000\u0000\u0000\n\u008c\u0001"+
		"\u0000\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000\u000e\u00a2\u0001\u0000"+
		"\u0000\u0000\u0010\u00ac\u0001\u0000\u0000\u0000\u0012\u00c6\u0001\u0000"+
		"\u0000\u0000\u0014\u00c8\u0001\u0000\u0000\u0000\u0016\u00dc\u0001\u0000"+
		"\u0000\u0000\u0018\u001e\u0006\u0000\uffff\uffff\u0000\u0019\u001f\u0003"+
		"\u0002\u0001\u0000\u001a\u001f\u0003\u0004\u0002\u0000\u001b\u001f\u0003"+
		"\b\u0004\u0000\u001c\u001f\u0003\n\u0005\u0000\u001d\u001f\u0003\f\u0006"+
		"\u0000\u001e\u0019\u0001\u0000\u0000\u0000\u001e\u001a\u0001\u0000\u0000"+
		"\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000"+
		"\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000"+
		" \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"#\u0005\u0000\u0000\u0001#$\u0006\u0000\uffff\uffff\u0000"+
		"$\u0001\u0001\u0000\u0000\u0000%&\u0005=\u0000\u0000&@\u0005\u0001\u0000"+
		"\u0000\'(\u0005\u0002\u0000\u0000()\u0007\u0000\u0000\u0000)@\u0005\u0001"+
		"\u0000\u0000*+\u0005\u0005\u0000\u0000+,\u0005?\u0000\u0000,@\u0005\u0001"+
		"\u0000\u0000-.\u0005\u0006\u0000\u0000./\u0005<\u0000\u0000/@\u0005\u0001"+
		"\u0000\u000001\u0005\u0007\u0000\u000012\u0005<\u0000\u00002@\u0005\u0001"+
		"\u0000\u000034\u0005\b\u0000\u000045\u0005;\u0000\u00005@\u0005\u0001"+
		"\u0000\u000067\u0005\t\u0000\u000078\u0005B\u0000\u00008@\u0005\u0001"+
		"\u0000\u00009:\u0005\n\u0000\u0000:;\u0005?\u0000\u0000;@\u0005\u0001"+
		"\u0000\u0000<=\u0005\u000b\u0000\u0000=>\u0005>\u0000\u0000>@\u0005\u0001"+
		"\u0000\u0000?%\u0001\u0000\u0000\u0000?\'\u0001\u0000\u0000\u0000?*\u0001"+
		"\u0000\u0000\u0000?-\u0001\u0000\u0000\u0000?0\u0001\u0000\u0000\u0000"+
		"?3\u0001\u0000\u0000\u0000?6\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000"+
		"\u0000?<\u0001\u0000\u0000\u0000@\u0003\u0001\u0000\u0000\u0000AB\u0005"+
		"\f\u0000\u0000BC\u0005:\u0000\u0000Cq\u0005\u0001\u0000\u0000DE\u0005"+
		"\r\u0000\u0000EF\u0005@\u0000\u0000Fq\u0005\u0001\u0000\u0000GH\u0005"+
		"\u000e\u0000\u0000HI\u00058\u0000\u0000Iq\u0005\u0001\u0000\u0000JK\u0005"+
		"\u000f\u0000\u0000KL\u0005:\u0000\u0000Lq\u0005\u0001\u0000\u0000MN\u0005"+
		"\u0010\u0000\u0000NS\u00055\u0000\u0000OP\u0005\u0011\u0000\u0000PR\u0005"+
		"5\u0000\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000Vq\u0005\u0001\u0000\u0000WX\u0005\u0012\u0000"+
		"\u0000XY\u00055\u0000\u0000Yq\u0005\u0001\u0000\u0000Z[\u0005\u0013\u0000"+
		"\u0000[`\u0005:\u0000\u0000\\]\u0005\u0011\u0000\u0000]_\u0005:\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000cq\u0005\u0001\u0000\u0000de\u0005\u0014\u0000\u0000"+
		"ef\u0005B\u0000\u0000fq\u0005\u0001\u0000\u0000gh\u0005\u0015\u0000\u0000"+
		"hi\u0005\u0016\u0000\u0000ij\u0005\u0017\u0000\u0000jk\u0005<\u0000\u0000"+
		"kl\u0005\u0018\u0000\u0000lm\u00053\u0000\u0000mn\u0007\u0001\u0000\u0000"+
		"nq\u0005\u0001\u0000\u0000oq\u0003\u0006\u0003\u0000pA\u0001\u0000\u0000"+
		"\u0000pD\u0001\u0000\u0000\u0000pG\u0001\u0000\u0000\u0000pJ\u0001\u0000"+
		"\u0000\u0000pM\u0001\u0000\u0000\u0000pW\u0001\u0000\u0000\u0000pZ\u0001"+
		"\u0000\u0000\u0000pd\u0001\u0000\u0000\u0000pg\u0001\u0000\u0000\u0000"+
		"po\u0001\u0000\u0000\u0000q\u0005\u0001\u0000\u0000\u0000rs\u0005\u001b"+
		"\u0000\u0000st\u0005\u0015\u0000\u0000tu\u0007\u0002\u0000\u0000uv\u0005"+
		"\u0018\u0000\u0000vw\u00052\u0000\u0000wy\u0005\u001c\u0000\u0000xz\u0003"+
		"\u0004\u0002\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0005\u001d\u0000\u0000~\u007f\u0005\u001e\u0000\u0000\u007f"+
		"\u0081\u0005\u001c\u0000\u0000\u0080\u0082\u0003\u0004\u0002\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u001d\u0000\u0000\u0086"+
		"\u0007\u0001\u0000\u0000\u0000\u0087\u008b\u0003\u0014\n\u0000\u0088\u008b"+
		"\u0003\u0010\b\u0000\u0089\u008b\u0003\u000e\u0007\u0000\u008a\u0087\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\t\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u001f"+
		"\u0000\u0000\u008d\u008e\u0005A\u0000\u0000\u008e\u008f\u0005\u001c\u0000"+
		"\u0000\u008f\u0090\u0005 \u0000\u0000\u0090\u0091\u0007\u0003\u0000\u0000"+
		"\u0091\u0092\u0005\u0001\u0000\u0000\u0092\u0093\u0005$\u0000\u0000\u0093"+
		"\u0094\u0005C\u0000\u0000\u0094\u0095\u0005\u0001\u0000\u0000\u0095\u0096"+
		"\u0005%\u0000\u0000\u0096\u000b\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"&\u0000\u0000\u0098\u0099\u0007\u0004\u0000\u0000\u0099\u009a\u0005\u001c"+
		"\u0000\u0000\u009a\u009b\u0005\'\u0000\u0000\u009b\u009c\u00055\u0000"+
		"\u0000\u009c\u009d\u0005\u0001\u0000\u0000\u009d\u009e\u0005\u001f\u0000"+
		"\u0000\u009e\u009f\u0005A\u0000\u0000\u009f\u00a0\u0005\u0001\u0000\u0000"+
		"\u00a0\u00a1\u0005\u001d\u0000\u0000\u00a1\r\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005(\u0000\u0000\u00a3\u00a4\u0005A\u0000\u0000\u00a4\u00a6\u0005"+
		"\u001c\u0000\u0000\u00a5\u00a7\u0003\u0010\b\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005\u001d\u0000\u0000\u00ab\u000f\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005)\u0000\u0000\u00ad\u00ae\u00055\u0000\u0000"+
		"\u00ae\u00af\u0005*\u0000\u0000\u00af\u00b0\u00055\u0000\u0000\u00b0\u00b2"+
		"\u0005\u001c\u0000\u0000\u00b1\u00b3\u0003\u0012\t\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7\u0011\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005+\u0000\u0000\u00b9\u00ba\u00055\u0000"+
		"\u0000\u00ba\u00bb\u00055\u0000\u0000\u00bb\u00c7\u0005\u0001\u0000\u0000"+
		"\u00bc\u00bd\u0005,\u0000\u0000\u00bd\u00be\u00056\u0000\u0000\u00be\u00c7"+
		"\u0005\u0001\u0000\u0000\u00bf\u00c0\u0005-\u0000\u0000\u00c0\u00c1\u0005"+
		"5\u0000\u0000\u00c1\u00c7\u0005\u0001\u0000\u0000\u00c2\u00c3\u0005\u0014"+
		"\u0000\u0000\u00c3\u00c4\u0005B\u0000\u0000\u00c4\u00c7\u0005\u0001\u0000"+
		"\u0000\u00c5\u00c7\u0003\u0004\u0002\u0000\u00c6\u00b8\u0001\u0000\u0000"+
		"\u0000\u00c6\u00bc\u0001\u0000\u0000\u0000\u00c6\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u0013\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005.\u0000\u0000"+
		"\u00c9\u00ca\u0005A\u0000\u0000\u00ca\u00cc\u0005\u001c\u0000\u0000\u00cb"+
		"\u00cd\u0003\u0016\u000b\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0005\u001d\u0000\u0000\u00d1\u0015\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005/\u0000\u0000\u00d3\u00d4\u00054\u0000\u0000\u00d4\u00dd\u0005"+
		"\u0001\u0000\u0000\u00d5\u00d6\u00050\u0000\u0000\u00d6\u00d7\u00055\u0000"+
		"\u0000\u00d7\u00dd\u0005\u0001\u0000\u0000\u00d8\u00d9\u00051\u0000\u0000"+
		"\u00d9\u00da\u0005@\u0000\u0000\u00da\u00dd\u0005\u0001\u0000\u0000\u00db"+
		"\u00dd\u0003\u0004\u0002\u0000\u00dc\u00d2\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d5\u0001\u0000\u0000\u0000\u00dc\u00d8\u0001\u0000\u0000\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u0017\u0001\u0000\u0000\u0000\u000e"+
		"\u001e ?S`p{\u0083\u008a\u00a8\u00b4\u00c6\u00ce\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}