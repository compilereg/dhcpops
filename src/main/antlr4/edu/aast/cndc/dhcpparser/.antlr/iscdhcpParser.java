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
		RULE_ifcondition = 4, RULE_iftrueblocks = 5, RULE_ifelseblocks = 6, RULE_confblock = 7, 
		RULE_keyblock = 8, RULE_zoneblock = 9, RULE_sharednetblock = 10, RULE_subnetblock = 11, 
		RULE_subnetblockbody = 12, RULE_hostblock = 13, RULE_hostblockbody1 = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"config", "serverconfline", "commonconfline", "if", "ifcondition", "iftrueblocks", 
			"ifelseblocks", "confblock", "keyblock", "zoneblock", "sharednetblock", 
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
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(36);
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
					setState(31);
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
					setState(32);
					commonconfline();
					}
					break;
				case T__39:
				case T__40:
				case T__45:
					{
					setState(33);
					confblock();
					}
					break;
				case T__30:
					{
					setState(34);
					keyblock();
					}
					break;
				case T__37:
					{
					setState(35);
					zoneblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2305916953656426468L) != 0) );
			setState(40);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLEDIRECTIVE:
				_localctx = new AuthoritativeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(SINGLEDIRECTIVE);
				setState(44);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new AllowBootingDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__1);
				setState(46);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(47);
				match(T__0);
				}
				break;
			case T__4:
				_localctx = new UpdateStaticLeasesDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(T__4);
				setState(49);
				match(ONOFFSWITCH);
				setState(50);
				match(T__0);
				}
				break;
			case T__5:
				_localctx = new DefaultLeaseTimeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(T__5);
				setState(52);
				match(POSTIVENUMBER);
				setState(53);
				match(T__0);
				}
				break;
			case T__6:
				_localctx = new MaxLeaseTimeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				match(T__6);
				setState(55);
				match(POSTIVENUMBER);
				setState(56);
				match(T__0);
				}
				break;
			case T__7:
				_localctx = new LogFacilityDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				match(T__7);
				setState(58);
				match(LOGFACILITY);
				setState(59);
				match(T__0);
				}
				break;
			case T__8:
				_localctx = new IncludeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				match(T__8);
				setState(61);
				match(FILEPATH);
				setState(62);
				match(T__0);
				}
				break;
			case T__9:
				_localctx = new DDNSUpdatesDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				match(T__9);
				setState(64);
				match(ONOFFSWITCH);
				setState(65);
				match(T__0);
				}
				break;
			case T__10:
				_localctx = new DDNSUpdateStyleDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				match(T__10);
				setState(67);
				match(UPDATESTYLES);
				setState(68);
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
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new DDNSDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__11);
				setState(72);
				match(QUOTEDDOMAINNAME);
				setState(73);
				match(T__0);
				}
				break;
			case T__12:
				_localctx = new DDNSHostNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__12);
				setState(75);
				match(QUOTEDHOSTNAME);
				setState(76);
				match(T__0);
				}
				break;
			case T__13:
				_localctx = new DDNSRevDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(T__13);
				setState(78);
				match(QUOTEDREVDOMAINNAME);
				setState(79);
				match(T__0);
				}
				break;
			case T__14:
				_localctx = new OptionDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(T__14);
				setState(81);
				match(QUOTEDDOMAINNAME);
				setState(82);
				match(T__0);
				}
				break;
			case T__15:
				_localctx = new OptionDomainNameServersDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(T__15);
				{
				setState(84);
				match(IP4);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(85);
					match(T__16);
					setState(86);
					match(IP4);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(92);
				match(T__0);
				}
				break;
			case T__17:
				_localctx = new OptionRoutersDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				match(T__17);
				setState(94);
				match(IP4);
				setState(95);
				match(T__0);
				}
				break;
			case T__18:
				_localctx = new OptionDomainSearchDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				match(T__18);
				{
				setState(97);
				match(QUOTEDDOMAINNAME);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(98);
					match(T__16);
					setState(99);
					match(QUOTEDDOMAINNAME);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(105);
				match(T__0);
				}
				break;
			case T__19:
				_localctx = new FilenameDirectiveCommonContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				match(T__19);
				setState(107);
				match(FILEPATH);
				setState(108);
				match(T__0);
				}
				break;
			case T__20:
				_localctx = new OptionArchDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				match(T__20);
				setState(110);
				match(T__21);
				setState(111);
				match(T__22);
				setState(112);
				match(POSTIVENUMBER);
				setState(113);
				match(T__23);
				setState(114);
				match(TYPE);
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				match(T__0);
				}
				break;
			case T__26:
				_localctx = new IfOnlyDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(117);
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
	public static class IfConditionBlockContext extends IfContext {
		public IfconditionContext ifcondition() {
			return getRuleContext(IfconditionContext.class,0);
		}
		public List<IftrueblocksContext> iftrueblocks() {
			return getRuleContexts(IftrueblocksContext.class);
		}
		public IftrueblocksContext iftrueblocks(int i) {
			return getRuleContext(IftrueblocksContext.class,i);
		}
		public List<IfelseblocksContext> ifelseblocks() {
			return getRuleContexts(IfelseblocksContext.class);
		}
		public IfelseblocksContext ifelseblocks(int i) {
			return getRuleContext(IfelseblocksContext.class,i);
		}
		public IfConditionBlockContext(IfContext ctx) { copyFrom(ctx); }
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if);
		int _la;
		try {
			_localctx = new IfConditionBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__26);
			setState(121);
			ifcondition();
			setState(122);
			match(T__27);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				iftrueblocks();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 73667417337856L) != 0) );
			setState(128);
			match(T__28);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(129);
				match(T__29);
				setState(130);
				match(T__27);
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					ifelseblocks();
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 73667417337856L) != 0) );
				setState(136);
				match(T__28);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfconditionContext extends ParserRuleContext {
		public IfconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcondition; }
	 
		public IfconditionContext() { }
		public void copyFrom(IfconditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfConditionArchContext extends IfconditionContext {
		public TerminalNode ARCHTYPE() { return getToken(iscdhcpParser.ARCHTYPE, 0); }
		public IfConditionArchContext(IfconditionContext ctx) { copyFrom(ctx); }
	}

	public final IfconditionContext ifcondition() throws RecognitionException {
		IfconditionContext _localctx = new IfconditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifcondition);
		int _la;
		try {
			_localctx = new IfConditionArchContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__20);
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(142);
			match(T__23);
			setState(143);
			match(ARCHTYPE);
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
	public static class IftrueblocksContext extends ParserRuleContext {
		public IftrueblocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iftrueblocks; }
	 
		public IftrueblocksContext() { }
		public void copyFrom(IftrueblocksContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfTrueCommonConfLineContext extends IftrueblocksContext {
		public CommonconflineContext commonconfline() {
			return getRuleContext(CommonconflineContext.class,0);
		}
		public IfTrueCommonConfLineContext(IftrueblocksContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfTrueConfBlockContext extends IftrueblocksContext {
		public ConfblockContext confblock() {
			return getRuleContext(ConfblockContext.class,0);
		}
		public IfTrueConfBlockContext(IftrueblocksContext ctx) { copyFrom(ctx); }
	}

	public final IftrueblocksContext iftrueblocks() throws RecognitionException {
		IftrueblocksContext _localctx = new IftrueblocksContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iftrueblocks);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				_localctx = new IfTrueCommonConfLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				commonconfline();
				}
				break;
			case T__39:
			case T__40:
			case T__45:
				_localctx = new IfTrueConfBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				confblock();
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
	public static class IfelseblocksContext extends ParserRuleContext {
		public IfelseblocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelseblocks; }
	 
		public IfelseblocksContext() { }
		public void copyFrom(IfelseblocksContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseConfBlockContext extends IfelseblocksContext {
		public ConfblockContext confblock() {
			return getRuleContext(ConfblockContext.class,0);
		}
		public IfElseConfBlockContext(IfelseblocksContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseCommonConfLineContext extends IfelseblocksContext {
		public CommonconflineContext commonconfline() {
			return getRuleContext(CommonconflineContext.class,0);
		}
		public IfElseCommonConfLineContext(IfelseblocksContext ctx) { copyFrom(ctx); }
	}

	public final IfelseblocksContext ifelseblocks() throws RecognitionException {
		IfelseblocksContext _localctx = new IfelseblocksContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifelseblocks);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				_localctx = new IfElseCommonConfLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				commonconfline();
				}
				break;
			case T__39:
			case T__40:
			case T__45:
				_localctx = new IfElseConfBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				confblock();
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
		enterRule(_localctx, 14, RULE_confblock);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				_localctx = new HostBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				hostblock();
				}
				break;
			case T__40:
				_localctx = new SubnetBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				subnetblock();
				}
				break;
			case T__39:
				_localctx = new SharedNetBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
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
		enterRule(_localctx, 16, RULE_keyblock);
		int _la;
		try {
			_localctx = new KeyBlockDirectiveContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__30);
			setState(159);
			match(HOSTNAME);
			setState(160);
			match(T__27);
			setState(161);
			match(T__31);
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			match(T__0);
			setState(164);
			match(T__35);
			setState(165);
			match(SECRET);
			setState(166);
			match(T__0);
			setState(167);
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
		enterRule(_localctx, 18, RULE_zoneblock);
		int _la;
		try {
			_localctx = new ZoneBlockDirectiveContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__37);
			setState(170);
			_la = _input.LA(1);
			if ( !(_la==REVDOMAINNAME || _la==DOMAINNAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(171);
			match(T__27);
			setState(172);
			match(T__38);
			setState(173);
			match(IP4);
			setState(174);
			match(T__0);
			setState(175);
			match(T__30);
			setState(176);
			match(HOSTNAME);
			setState(177);
			match(T__0);
			setState(178);
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
		enterRule(_localctx, 20, RULE_sharednetblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__39);
			setState(181);
			match(HOSTNAME);
			setState(182);
			match(T__27);
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				subnetblock();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__40 );
			setState(188);
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
		enterRule(_localctx, 22, RULE_subnetblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__40);
			setState(191);
			match(IP4);
			setState(192);
			match(T__41);
			setState(193);
			match(IP4);
			setState(194);
			match(T__27);
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				subnetblockbody();
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 61572789432320L) != 0) );
			setState(200);
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
		enterRule(_localctx, 24, RULE_subnetblockbody);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new RangeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__42);
				setState(203);
				match(IP4);
				setState(204);
				match(IP4);
				setState(205);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new OptionSubnetMaskDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__43);
				setState(207);
				match(NETMASK);
				setState(208);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new NextServerDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(T__44);
				setState(210);
				match(IP4);
				setState(211);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new FilenameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(T__19);
				setState(213);
				match(FILEPATH);
				setState(214);
				match(T__0);
				}
				break;
			case 5:
				_localctx = new CommonConfLineInSubnetblockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
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
		enterRule(_localctx, 26, RULE_hostblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__45);
			setState(219);
			match(HOSTNAME);
			setState(220);
			match(T__27);
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				hostblockbody1();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 985162556764160L) != 0) );
			setState(226);
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
		enterRule(_localctx, 28, RULE_hostblockbody1);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				_localctx = new HardwareEthernetDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(T__46);
				setState(229);
				match(MACADDRESS);
				setState(230);
				match(T__0);
				}
				break;
			case T__47:
				_localctx = new FixedAddressDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(T__47);
				setState(232);
				match(IP4);
				setState(233);
				match(T__0);
				}
				break;
			case T__48:
				_localctx = new OptionHostNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(T__48);
				setState(235);
				match(QUOTEDHOSTNAME);
				setState(236);
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
				setState(237);
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
		"\u0004\u0001E\u00f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000%\b\u0000"+
		"\u000b\u0000\f\u0000&\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002X\b\u0002\n\u0002\f\u0002[\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002e\b\u0002\n\u0002\f\u0002h\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002w\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003}\b\u0003\u000b\u0003\f\u0003~\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003\u0085\b\u0003\u000b\u0003\f\u0003\u0086"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u008b\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0094\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0098\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009d\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00b9\b\n\u000b"+
		"\n\f\n\u00ba\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00c5\b\u000b\u000b\u000b\f"+
		"\u000b\u00c6\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00d9\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00df\b\r"+
		"\u000b\r\f\r\u00e0\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00ef\b\u000e\u0001\u000e\u0000\u0000\u000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u0000\u0005\u0001\u0000\u0003\u0004\u0001\u0000\u0019\u001a\u0001\u0000"+
		"\u0016\u0017\u0001\u0000!#\u0002\u00007799\u010a\u0000\u001e\u0001\u0000"+
		"\u0000\u0000\u0002E\u0001\u0000\u0000\u0000\u0004v\u0001\u0000\u0000\u0000"+
		"\u0006x\u0001\u0000\u0000\u0000\b\u008c\u0001\u0000\u0000\u0000\n\u0093"+
		"\u0001\u0000\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000\u000e\u009c\u0001"+
		"\u0000\u0000\u0000\u0010\u009e\u0001\u0000\u0000\u0000\u0012\u00a9\u0001"+
		"\u0000\u0000\u0000\u0014\u00b4\u0001\u0000\u0000\u0000\u0016\u00be\u0001"+
		"\u0000\u0000\u0000\u0018\u00d8\u0001\u0000\u0000\u0000\u001a\u00da\u0001"+
		"\u0000\u0000\u0000\u001c\u00ee\u0001\u0000\u0000\u0000\u001e$\u0006\u0000"+
		"\uffff\uffff\u0000\u001f%\u0003\u0002\u0001\u0000 %\u0003\u0004\u0002"+
		"\u0000!%\u0003\u000e\u0007\u0000\"%\u0003\u0010\b\u0000#%\u0003\u0012"+
		"\t\u0000$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000()\u0005\u0000\u0000\u0001)*\u0006\u0000"+
		"\uffff\uffff\u0000*\u0001\u0001\u0000\u0000\u0000+,\u0005=\u0000\u0000"+
		",F\u0005\u0001\u0000\u0000-.\u0005\u0002\u0000\u0000./\u0007\u0000\u0000"+
		"\u0000/F\u0005\u0001\u0000\u000001\u0005\u0005\u0000\u000012\u0005?\u0000"+
		"\u00002F\u0005\u0001\u0000\u000034\u0005\u0006\u0000\u000045\u0005<\u0000"+
		"\u00005F\u0005\u0001\u0000\u000067\u0005\u0007\u0000\u000078\u0005<\u0000"+
		"\u00008F\u0005\u0001\u0000\u00009:\u0005\b\u0000\u0000:;\u0005;\u0000"+
		"\u0000;F\u0005\u0001\u0000\u0000<=\u0005\t\u0000\u0000=>\u0005B\u0000"+
		"\u0000>F\u0005\u0001\u0000\u0000?@\u0005\n\u0000\u0000@A\u0005?\u0000"+
		"\u0000AF\u0005\u0001\u0000\u0000BC\u0005\u000b\u0000\u0000CD\u0005>\u0000"+
		"\u0000DF\u0005\u0001\u0000\u0000E+\u0001\u0000\u0000\u0000E-\u0001\u0000"+
		"\u0000\u0000E0\u0001\u0000\u0000\u0000E3\u0001\u0000\u0000\u0000E6\u0001"+
		"\u0000\u0000\u0000E9\u0001\u0000\u0000\u0000E<\u0001\u0000\u0000\u0000"+
		"E?\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000F\u0003\u0001\u0000"+
		"\u0000\u0000GH\u0005\f\u0000\u0000HI\u0005:\u0000\u0000Iw\u0005\u0001"+
		"\u0000\u0000JK\u0005\r\u0000\u0000KL\u0005@\u0000\u0000Lw\u0005\u0001"+
		"\u0000\u0000MN\u0005\u000e\u0000\u0000NO\u00058\u0000\u0000Ow\u0005\u0001"+
		"\u0000\u0000PQ\u0005\u000f\u0000\u0000QR\u0005:\u0000\u0000Rw\u0005\u0001"+
		"\u0000\u0000ST\u0005\u0010\u0000\u0000TY\u00055\u0000\u0000UV\u0005\u0011"+
		"\u0000\u0000VX\u00055\u0000\u0000WU\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\w\u0005\u0001\u0000\u0000"+
		"]^\u0005\u0012\u0000\u0000^_\u00055\u0000\u0000_w\u0005\u0001\u0000\u0000"+
		"`a\u0005\u0013\u0000\u0000af\u0005:\u0000\u0000bc\u0005\u0011\u0000\u0000"+
		"ce\u0005:\u0000\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000iw\u0005\u0001\u0000\u0000jk\u0005\u0014"+
		"\u0000\u0000kl\u0005B\u0000\u0000lw\u0005\u0001\u0000\u0000mn\u0005\u0015"+
		"\u0000\u0000no\u0005\u0016\u0000\u0000op\u0005\u0017\u0000\u0000pq\u0005"+
		"<\u0000\u0000qr\u0005\u0018\u0000\u0000rs\u00053\u0000\u0000st\u0007\u0001"+
		"\u0000\u0000tw\u0005\u0001\u0000\u0000uw\u0003\u0006\u0003\u0000vG\u0001"+
		"\u0000\u0000\u0000vJ\u0001\u0000\u0000\u0000vM\u0001\u0000\u0000\u0000"+
		"vP\u0001\u0000\u0000\u0000vS\u0001\u0000\u0000\u0000v]\u0001\u0000\u0000"+
		"\u0000v`\u0001\u0000\u0000\u0000vj\u0001\u0000\u0000\u0000vm\u0001\u0000"+
		"\u0000\u0000vu\u0001\u0000\u0000\u0000w\u0005\u0001\u0000\u0000\u0000"+
		"xy\u0005\u001b\u0000\u0000yz\u0003\b\u0004\u0000z|\u0005\u001c\u0000\u0000"+
		"{}\u0003\n\u0005\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u008a\u0005\u001d\u0000\u0000\u0081\u0082"+
		"\u0005\u001e\u0000\u0000\u0082\u0084\u0005\u001c\u0000\u0000\u0083\u0085"+
		"\u0003\f\u0006\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"\u001d\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0081\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0007\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005\u0015\u0000\u0000\u008d\u008e\u0007"+
		"\u0002\u0000\u0000\u008e\u008f\u0005\u0018\u0000\u0000\u008f\u0090\u0005"+
		"2\u0000\u0000\u0090\t\u0001\u0000\u0000\u0000\u0091\u0094\u0003\u0004"+
		"\u0002\u0000\u0092\u0094\u0003\u000e\u0007\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u000b\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0003\u0004\u0002\u0000\u0096\u0098\u0003\u000e"+
		"\u0007\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\r\u0001\u0000\u0000\u0000\u0099\u009d\u0003\u001a\r"+
		"\u0000\u009a\u009d\u0003\u0016\u000b\u0000\u009b\u009d\u0003\u0014\n\u0000"+
		"\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u000f\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005\u001f\u0000\u0000\u009f\u00a0\u0005A\u0000\u0000\u00a0"+
		"\u00a1\u0005\u001c\u0000\u0000\u00a1\u00a2\u0005 \u0000\u0000\u00a2\u00a3"+
		"\u0007\u0003\u0000\u0000\u00a3\u00a4\u0005\u0001\u0000\u0000\u00a4\u00a5"+
		"\u0005$\u0000\u0000\u00a5\u00a6\u0005C\u0000\u0000\u00a6\u00a7\u0005\u0001"+
		"\u0000\u0000\u00a7\u00a8\u0005%\u0000\u0000\u00a8\u0011\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005&\u0000\u0000\u00aa\u00ab\u0007\u0004\u0000\u0000"+
		"\u00ab\u00ac\u0005\u001c\u0000\u0000\u00ac\u00ad\u0005\'\u0000\u0000\u00ad"+
		"\u00ae\u00055\u0000\u0000\u00ae\u00af\u0005\u0001\u0000\u0000\u00af\u00b0"+
		"\u0005\u001f\u0000\u0000\u00b0\u00b1\u0005A\u0000\u0000\u00b1\u00b2\u0005"+
		"\u0001\u0000\u0000\u00b2\u00b3\u0005\u001d\u0000\u0000\u00b3\u0013\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005(\u0000\u0000\u00b5\u00b6\u0005A\u0000"+
		"\u0000\u00b6\u00b8\u0005\u001c\u0000\u0000\u00b7\u00b9\u0003\u0016\u000b"+
		"\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u001d\u0000"+
		"\u0000\u00bd\u0015\u0001\u0000\u0000\u0000\u00be\u00bf\u0005)\u0000\u0000"+
		"\u00bf\u00c0\u00055\u0000\u0000\u00c0\u00c1\u0005*\u0000\u0000\u00c1\u00c2"+
		"\u00055\u0000\u0000\u00c2\u00c4\u0005\u001c\u0000\u0000\u00c3\u00c5\u0003"+
		"\u0018\f\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u001d"+
		"\u0000\u0000\u00c9\u0017\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005+\u0000"+
		"\u0000\u00cb\u00cc\u00055\u0000\u0000\u00cc\u00cd\u00055\u0000\u0000\u00cd"+
		"\u00d9\u0005\u0001\u0000\u0000\u00ce\u00cf\u0005,\u0000\u0000\u00cf\u00d0"+
		"\u00056\u0000\u0000\u00d0\u00d9\u0005\u0001\u0000\u0000\u00d1\u00d2\u0005"+
		"-\u0000\u0000\u00d2\u00d3\u00055\u0000\u0000\u00d3\u00d9\u0005\u0001\u0000"+
		"\u0000\u00d4\u00d5\u0005\u0014\u0000\u0000\u00d5\u00d6\u0005B\u0000\u0000"+
		"\u00d6\u00d9\u0005\u0001\u0000\u0000\u00d7\u00d9\u0003\u0004\u0002\u0000"+
		"\u00d8\u00ca\u0001\u0000\u0000\u0000\u00d8\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d1\u0001\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u0019\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005.\u0000\u0000\u00db\u00dc\u0005A\u0000\u0000\u00dc\u00de"+
		"\u0005\u001c\u0000\u0000\u00dd\u00df\u0003\u001c\u000e\u0000\u00de\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u001d\u0000\u0000\u00e3\u001b"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005/\u0000\u0000\u00e5\u00e6\u0005"+
		"4\u0000\u0000\u00e6\u00ef\u0005\u0001\u0000\u0000\u00e7\u00e8\u00050\u0000"+
		"\u0000\u00e8\u00e9\u00055\u0000\u0000\u00e9\u00ef\u0005\u0001\u0000\u0000"+
		"\u00ea\u00eb\u00051\u0000\u0000\u00eb\u00ec\u0005@\u0000\u0000\u00ec\u00ef"+
		"\u0005\u0001\u0000\u0000\u00ed\u00ef\u0003\u0004\u0002\u0000\u00ee\u00e4"+
		"\u0001\u0000\u0000\u0000\u00ee\u00e7\u0001\u0000\u0000\u0000\u00ee\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u001d"+
		"\u0001\u0000\u0000\u0000\u0011$&EYfv~\u0086\u008a\u0093\u0097\u009c\u00ba"+
		"\u00c6\u00d8\u00e0\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}