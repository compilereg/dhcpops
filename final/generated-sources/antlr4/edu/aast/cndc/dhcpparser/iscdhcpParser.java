// Generated from edu/aast/cndc/dhcpparser/iscdhcp.g4 by ANTLR 4.13.1
package edu.aast.cndc.dhcpparser;
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
		T__38=39, T__39=40, T__40=41, MACADDRESS=42, IP4=43, NETMASK=44, REVDOMAINNAME=45, 
		QUOTEDREVDOMAINNAME=46, DOMAINNAME=47, QUOTEDDOMAINNAME=48, LOGFACILITY=49, 
		TIMEINSEC=50, SINGLEDIRECTIVE=51, UPDATESTYLES=52, ONOFFSWITCH=53, QUOTEDHOSTNAME=54, 
		HOSTNAME=55, FILEPATH=56, SECRET=57, COMMENT=58, WS=59;
	public static final int
		RULE_config = 0, RULE_serverconfline = 1, RULE_commonconfline = 2, RULE_confblock = 3, 
		RULE_keyblock = 4, RULE_zoneblock = 5, RULE_sharednetblock = 6, RULE_subnetblock = 7, 
		RULE_subnetblockbody = 8, RULE_hostblock = 9, RULE_hostblockbody1 = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"config", "serverconfline", "commonconfline", "confblock", "keyblock", 
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
			"','", "'option routers'", "'option domain-search'", "'key'", "'{'", 
			"'algorithm'", "'hmac-md5'", "'hmac-sha1'", "'hmac-sha256'", "'secret'", 
			"'};'", "'zone'", "'primary'", "'}'", "'shared-network'", "'subnet'", 
			"'netmask'", "'range'", "'option subnet-mask'", "'next-server'", "'filename'", 
			"'host'", "'hardware ethernet'", "'fixed-address'", "'option host-name'", 
			null, null, null, null, null, null, null, null, null, "'authoritative'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "MACADDRESS", "IP4", "NETMASK", "REVDOMAINNAME", 
			"QUOTEDREVDOMAINNAME", "DOMAINNAME", "QUOTEDDOMAINNAME", "LOGFACILITY", 
			"TIMEINSEC", "SINGLEDIRECTIVE", "UPDATESTYLES", "ONOFFSWITCH", "QUOTEDHOSTNAME", 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterDHCPConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitDHCPConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitDHCPConfig(this);
			else return visitor.visitChildren(this);
		}
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
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(28);
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
					setState(23);
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
					setState(24);
					commonconfline();
					}
					break;
				case T__30:
				case T__31:
				case T__37:
					{
					setState(25);
					confblock();
					}
					break;
				case T__19:
					{
					setState(26);
					keyblock();
					}
					break;
				case T__27:
					{
					setState(27);
					zoneblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2252081404444644L) != 0) );
			setState(32);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterDDNSUpdateStyleDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitDDNSUpdateStyleDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitDDNSUpdateStyleDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UpdateStaticLeasesDirectiveContext extends ServerconflineContext {
		public TerminalNode ONOFFSWITCH() { return getToken(iscdhcpParser.ONOFFSWITCH, 0); }
		public UpdateStaticLeasesDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterUpdateStaticLeasesDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitUpdateStaticLeasesDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitUpdateStaticLeasesDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllowBootingDirectiveContext extends ServerconflineContext {
		public AllowBootingDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterAllowBootingDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitAllowBootingDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitAllowBootingDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DDNSUpdatesDirectiveContext extends ServerconflineContext {
		public TerminalNode ONOFFSWITCH() { return getToken(iscdhcpParser.ONOFFSWITCH, 0); }
		public DDNSUpdatesDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterDDNSUpdatesDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitDDNSUpdatesDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitDDNSUpdatesDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AuthoritativeDirectiveContext extends ServerconflineContext {
		public TerminalNode SINGLEDIRECTIVE() { return getToken(iscdhcpParser.SINGLEDIRECTIVE, 0); }
		public AuthoritativeDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterAuthoritativeDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitAuthoritativeDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitAuthoritativeDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncludeDirectiveContext extends ServerconflineContext {
		public TerminalNode FILEPATH() { return getToken(iscdhcpParser.FILEPATH, 0); }
		public IncludeDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterIncludeDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitIncludeDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitIncludeDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogFacilityDirectiveContext extends ServerconflineContext {
		public TerminalNode LOGFACILITY() { return getToken(iscdhcpParser.LOGFACILITY, 0); }
		public LogFacilityDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterLogFacilityDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitLogFacilityDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitLogFacilityDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultLeaseTimeDirectiveContext extends ServerconflineContext {
		public TerminalNode TIMEINSEC() { return getToken(iscdhcpParser.TIMEINSEC, 0); }
		public DefaultLeaseTimeDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterDefaultLeaseTimeDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitDefaultLeaseTimeDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitDefaultLeaseTimeDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxLeaseTimeDirectiveContext extends ServerconflineContext {
		public TerminalNode TIMEINSEC() { return getToken(iscdhcpParser.TIMEINSEC, 0); }
		public MaxLeaseTimeDirectiveContext(ServerconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterMaxLeaseTimeDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitMaxLeaseTimeDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitMaxLeaseTimeDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServerconflineContext serverconfline() throws RecognitionException {
		ServerconflineContext _localctx = new ServerconflineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_serverconfline);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLEDIRECTIVE:
				_localctx = new AuthoritativeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(SINGLEDIRECTIVE);
				setState(36);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new AllowBootingDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(T__1);
				setState(38);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(39);
				match(T__0);
				}
				break;
			case T__4:
				_localctx = new UpdateStaticLeasesDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(T__4);
				setState(41);
				match(ONOFFSWITCH);
				setState(42);
				match(T__0);
				}
				break;
			case T__5:
				_localctx = new DefaultLeaseTimeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(T__5);
				setState(44);
				match(TIMEINSEC);
				setState(45);
				match(T__0);
				}
				break;
			case T__6:
				_localctx = new MaxLeaseTimeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				match(T__6);
				setState(47);
				match(TIMEINSEC);
				setState(48);
				match(T__0);
				}
				break;
			case T__7:
				_localctx = new LogFacilityDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				match(T__7);
				setState(50);
				match(LOGFACILITY);
				setState(51);
				match(T__0);
				}
				break;
			case T__8:
				_localctx = new IncludeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				match(T__8);
				setState(53);
				match(FILEPATH);
				setState(54);
				match(T__0);
				}
				break;
			case T__9:
				_localctx = new DDNSUpdatesDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				match(T__9);
				setState(56);
				match(ONOFFSWITCH);
				setState(57);
				match(T__0);
				}
				break;
			case T__10:
				_localctx = new DDNSUpdateStyleDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				match(T__10);
				setState(59);
				match(UPDATESTYLES);
				setState(60);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterDDNSRevDomainNameDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitDDNSRevDomainNameDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitDDNSRevDomainNameDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionRoutersDirectiveContext extends CommonconflineContext {
		public TerminalNode IP4() { return getToken(iscdhcpParser.IP4, 0); }
		public OptionRoutersDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterOptionRoutersDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitOptionRoutersDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitOptionRoutersDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionDomainSearchDirectiveContext extends CommonconflineContext {
		public List<TerminalNode> QUOTEDDOMAINNAME() { return getTokens(iscdhcpParser.QUOTEDDOMAINNAME); }
		public TerminalNode QUOTEDDOMAINNAME(int i) {
			return getToken(iscdhcpParser.QUOTEDDOMAINNAME, i);
		}
		public OptionDomainSearchDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterOptionDomainSearchDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitOptionDomainSearchDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitOptionDomainSearchDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DDNSHostNameDirectiveContext extends CommonconflineContext {
		public TerminalNode QUOTEDHOSTNAME() { return getToken(iscdhcpParser.QUOTEDHOSTNAME, 0); }
		public DDNSHostNameDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterDDNSHostNameDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitDDNSHostNameDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitDDNSHostNameDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DDNSDomainNameDirectiveContext extends CommonconflineContext {
		public TerminalNode QUOTEDDOMAINNAME() { return getToken(iscdhcpParser.QUOTEDDOMAINNAME, 0); }
		public DDNSDomainNameDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterDDNSDomainNameDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitDDNSDomainNameDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitDDNSDomainNameDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionDomainNameServersDirectiveContext extends CommonconflineContext {
		public List<TerminalNode> IP4() { return getTokens(iscdhcpParser.IP4); }
		public TerminalNode IP4(int i) {
			return getToken(iscdhcpParser.IP4, i);
		}
		public OptionDomainNameServersDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterOptionDomainNameServersDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitOptionDomainNameServersDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitOptionDomainNameServersDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionDomainNameDirectiveContext extends CommonconflineContext {
		public TerminalNode QUOTEDDOMAINNAME() { return getToken(iscdhcpParser.QUOTEDDOMAINNAME, 0); }
		public OptionDomainNameDirectiveContext(CommonconflineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterOptionDomainNameDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitOptionDomainNameDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitOptionDomainNameDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonconflineContext commonconfline() throws RecognitionException {
		CommonconflineContext _localctx = new CommonconflineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commonconfline);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new DDNSDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(T__11);
				setState(64);
				match(QUOTEDDOMAINNAME);
				setState(65);
				match(T__0);
				}
				break;
			case T__12:
				_localctx = new DDNSHostNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__12);
				setState(67);
				match(QUOTEDHOSTNAME);
				setState(68);
				match(T__0);
				}
				break;
			case T__13:
				_localctx = new DDNSRevDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(T__13);
				setState(70);
				match(QUOTEDREVDOMAINNAME);
				setState(71);
				match(T__0);
				}
				break;
			case T__14:
				_localctx = new OptionDomainNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(T__14);
				setState(73);
				match(QUOTEDDOMAINNAME);
				setState(74);
				match(T__0);
				}
				break;
			case T__15:
				_localctx = new OptionDomainNameServersDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(T__15);
				{
				setState(76);
				match(IP4);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(77);
					match(T__16);
					setState(78);
					match(IP4);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(84);
				match(T__0);
				}
				break;
			case T__17:
				_localctx = new OptionRoutersDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(T__17);
				setState(86);
				match(IP4);
				setState(87);
				match(T__0);
				}
				break;
			case T__18:
				_localctx = new OptionDomainSearchDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				match(T__18);
				{
				setState(89);
				match(QUOTEDDOMAINNAME);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(90);
					match(T__16);
					setState(91);
					match(QUOTEDDOMAINNAME);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(97);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterSharedNetBlockDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitSharedNetBlockDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitSharedNetBlockDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HostBlockDirectiveContext extends ConfblockContext {
		public HostblockContext hostblock() {
			return getRuleContext(HostblockContext.class,0);
		}
		public HostBlockDirectiveContext(ConfblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterHostBlockDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitHostBlockDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitHostBlockDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubnetBlockDirectiveContext extends ConfblockContext {
		public SubnetblockContext subnetblock() {
			return getRuleContext(SubnetblockContext.class,0);
		}
		public SubnetBlockDirectiveContext(ConfblockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterSubnetBlockDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitSubnetBlockDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitSubnetBlockDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfblockContext confblock() throws RecognitionException {
		ConfblockContext _localctx = new ConfblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_confblock);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				_localctx = new HostBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				hostblock();
				}
				break;
			case T__31:
				_localctx = new SubnetBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				subnetblock();
				}
				break;
			case T__30:
				_localctx = new SharedNetBlockDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterKeyBlockDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitKeyBlockDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitKeyBlockDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyblockContext keyblock() throws RecognitionException {
		KeyblockContext _localctx = new KeyblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_keyblock);
		int _la;
		try {
			_localctx = new KeyBlockDirectiveContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__19);
			setState(106);
			match(HOSTNAME);
			setState(107);
			match(T__20);
			setState(108);
			match(T__21);
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			match(T__0);
			setState(111);
			match(T__25);
			setState(112);
			match(SECRET);
			setState(113);
			match(T__0);
			setState(114);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterZoneBlockDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitZoneBlockDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitZoneBlockDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZoneblockContext zoneblock() throws RecognitionException {
		ZoneblockContext _localctx = new ZoneblockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_zoneblock);
		int _la;
		try {
			_localctx = new ZoneBlockDirectiveContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__27);
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==REVDOMAINNAME || _la==DOMAINNAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(118);
			match(T__20);
			setState(119);
			match(T__28);
			setState(120);
			match(IP4);
			setState(121);
			match(T__0);
			setState(122);
			match(T__19);
			setState(123);
			match(HOSTNAME);
			setState(124);
			match(T__0);
			setState(125);
			match(T__29);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterSharednetblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitSharednetblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitSharednetblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharednetblockContext sharednetblock() throws RecognitionException {
		SharednetblockContext _localctx = new SharednetblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sharednetblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__30);
			setState(128);
			match(HOSTNAME);
			setState(129);
			match(T__20);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				subnetblock();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__31 );
			setState(135);
			match(T__29);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterSubnetblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitSubnetblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitSubnetblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubnetblockContext subnetblock() throws RecognitionException {
		SubnetblockContext _localctx = new SubnetblockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subnetblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__31);
			setState(138);
			match(IP4);
			setState(139);
			match(T__32);
			setState(140);
			match(IP4);
			setState(141);
			match(T__20);
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				subnetblockbody();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 257698951168L) != 0) );
			setState(147);
			match(T__29);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterRangeDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitRangeDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitRangeDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilenameDirectiveContext extends SubnetblockbodyContext {
		public TerminalNode FILEPATH() { return getToken(iscdhcpParser.FILEPATH, 0); }
		public FilenameDirectiveContext(SubnetblockbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterFilenameDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitFilenameDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitFilenameDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NextServerDirectiveContext extends SubnetblockbodyContext {
		public TerminalNode IP4() { return getToken(iscdhcpParser.IP4, 0); }
		public NextServerDirectiveContext(SubnetblockbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterNextServerDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitNextServerDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitNextServerDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionSubnetMaskDirectiveContext extends SubnetblockbodyContext {
		public TerminalNode NETMASK() { return getToken(iscdhcpParser.NETMASK, 0); }
		public OptionSubnetMaskDirectiveContext(SubnetblockbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterOptionSubnetMaskDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitOptionSubnetMaskDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitOptionSubnetMaskDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommonConfLineInSubnetblockContext extends SubnetblockbodyContext {
		public CommonconflineContext commonconfline() {
			return getRuleContext(CommonconflineContext.class,0);
		}
		public CommonConfLineInSubnetblockContext(SubnetblockbodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterCommonConfLineInSubnetblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitCommonConfLineInSubnetblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitCommonConfLineInSubnetblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubnetblockbodyContext subnetblockbody() throws RecognitionException {
		SubnetblockbodyContext _localctx = new SubnetblockbodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subnetblockbody);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				_localctx = new RangeDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__33);
				setState(150);
				match(IP4);
				setState(151);
				match(IP4);
				setState(152);
				match(T__0);
				}
				break;
			case T__34:
				_localctx = new OptionSubnetMaskDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__34);
				setState(154);
				match(NETMASK);
				setState(155);
				match(T__0);
				}
				break;
			case T__35:
				_localctx = new NextServerDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(T__35);
				setState(157);
				match(IP4);
				setState(158);
				match(T__0);
				}
				break;
			case T__36:
				_localctx = new FilenameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(T__36);
				setState(160);
				match(FILEPATH);
				setState(161);
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
				setState(162);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterHostblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitHostblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitHostblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostblockContext hostblock() throws RecognitionException {
		HostblockContext _localctx = new HostblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_hostblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__37);
			setState(166);
			match(HOSTNAME);
			setState(167);
			match(T__20);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				hostblockbody1();
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3848291610624L) != 0) );
			setState(173);
			match(T__29);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterHardwareEthernetDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitHardwareEthernetDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitHardwareEthernetDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommonConfLineInHostblockContext extends Hostblockbody1Context {
		public CommonconflineContext commonconfline() {
			return getRuleContext(CommonconflineContext.class,0);
		}
		public CommonConfLineInHostblockContext(Hostblockbody1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterCommonConfLineInHostblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitCommonConfLineInHostblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitCommonConfLineInHostblock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FixedAddressDirectiveContext extends Hostblockbody1Context {
		public TerminalNode IP4() { return getToken(iscdhcpParser.IP4, 0); }
		public FixedAddressDirectiveContext(Hostblockbody1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterFixedAddressDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitFixedAddressDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitFixedAddressDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionHostNameDirectiveContext extends Hostblockbody1Context {
		public TerminalNode QUOTEDHOSTNAME() { return getToken(iscdhcpParser.QUOTEDHOSTNAME, 0); }
		public OptionHostNameDirectiveContext(Hostblockbody1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).enterOptionHostNameDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof iscdhcpListener ) ((iscdhcpListener)listener).exitOptionHostNameDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof iscdhcpVisitor ) return ((iscdhcpVisitor<? extends T>)visitor).visitOptionHostNameDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hostblockbody1Context hostblockbody1() throws RecognitionException {
		Hostblockbody1Context _localctx = new Hostblockbody1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_hostblockbody1);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				_localctx = new HardwareEthernetDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(T__38);
				setState(176);
				match(MACADDRESS);
				setState(177);
				match(T__0);
				}
				break;
			case T__39:
				_localctx = new FixedAddressDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(T__39);
				setState(179);
				match(IP4);
				setState(180);
				match(T__0);
				}
				break;
			case T__40:
				_localctx = new OptionHostNameDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(T__40);
				setState(182);
				match(QUOTEDHOSTNAME);
				setState(183);
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
				setState(184);
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
		"\u0004\u0001;\u00bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u001d\b\u0000\u000b"+
		"\u0000\f\u0000\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001>\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002P\b\u0002\n\u0002\f\u0002S\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002]\b\u0002\n\u0002\f\u0002`\t\u0002\u0001\u0002\u0003"+
		"\u0002c\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003h\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0004\u0006\u0084\b\u0006\u000b\u0006\f\u0006"+
		"\u0085\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0090\b\u0007\u000b\u0007\f"+
		"\u0007\u0091\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00a4\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00aa\b\t"+
		"\u000b\t\f\t\u00ab\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ba\b\n\u0001\n\u0000"+
		"\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000"+
		"\u0003\u0001\u0000\u0003\u0004\u0001\u0000\u0017\u0019\u0002\u0000--/"+
		"/\u00d1\u0000\u0016\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000"+
		"\u0004b\u0001\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000\bi\u0001"+
		"\u0000\u0000\u0000\nt\u0001\u0000\u0000\u0000\f\u007f\u0001\u0000\u0000"+
		"\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000"+
		"\u0000\u0012\u00a5\u0001\u0000\u0000\u0000\u0014\u00b9\u0001\u0000\u0000"+
		"\u0000\u0016\u001c\u0006\u0000\uffff\uffff\u0000\u0017\u001d\u0003\u0002"+
		"\u0001\u0000\u0018\u001d\u0003\u0004\u0002\u0000\u0019\u001d\u0003\u0006"+
		"\u0003\u0000\u001a\u001d\u0003\b\u0004\u0000\u001b\u001d\u0003\n\u0005"+
		"\u0000\u001c\u0017\u0001\u0000\u0000\u0000\u001c\u0018\u0001\u0000\u0000"+
		"\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f \u0001\u0000\u0000\u0000 !\u0005\u0000\u0000\u0001!\"\u0006"+
		"\u0000\uffff\uffff\u0000\"\u0001\u0001\u0000\u0000\u0000#$\u00053\u0000"+
		"\u0000$>\u0005\u0001\u0000\u0000%&\u0005\u0002\u0000\u0000&\'\u0007\u0000"+
		"\u0000\u0000\'>\u0005\u0001\u0000\u0000()\u0005\u0005\u0000\u0000)*\u0005"+
		"5\u0000\u0000*>\u0005\u0001\u0000\u0000+,\u0005\u0006\u0000\u0000,-\u0005"+
		"2\u0000\u0000->\u0005\u0001\u0000\u0000./\u0005\u0007\u0000\u0000/0\u0005"+
		"2\u0000\u00000>\u0005\u0001\u0000\u000012\u0005\b\u0000\u000023\u0005"+
		"1\u0000\u00003>\u0005\u0001\u0000\u000045\u0005\t\u0000\u000056\u0005"+
		"8\u0000\u00006>\u0005\u0001\u0000\u000078\u0005\n\u0000\u000089\u0005"+
		"5\u0000\u00009>\u0005\u0001\u0000\u0000:;\u0005\u000b\u0000\u0000;<\u0005"+
		"4\u0000\u0000<>\u0005\u0001\u0000\u0000=#\u0001\u0000\u0000\u0000=%\u0001"+
		"\u0000\u0000\u0000=(\u0001\u0000\u0000\u0000=+\u0001\u0000\u0000\u0000"+
		"=.\u0001\u0000\u0000\u0000=1\u0001\u0000\u0000\u0000=4\u0001\u0000\u0000"+
		"\u0000=7\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000>\u0003\u0001"+
		"\u0000\u0000\u0000?@\u0005\f\u0000\u0000@A\u00050\u0000\u0000Ac\u0005"+
		"\u0001\u0000\u0000BC\u0005\r\u0000\u0000CD\u00056\u0000\u0000Dc\u0005"+
		"\u0001\u0000\u0000EF\u0005\u000e\u0000\u0000FG\u0005.\u0000\u0000Gc\u0005"+
		"\u0001\u0000\u0000HI\u0005\u000f\u0000\u0000IJ\u00050\u0000\u0000Jc\u0005"+
		"\u0001\u0000\u0000KL\u0005\u0010\u0000\u0000LQ\u0005+\u0000\u0000MN\u0005"+
		"\u0011\u0000\u0000NP\u0005+\u0000\u0000OM\u0001\u0000\u0000\u0000PS\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000Tc\u0005\u0001\u0000"+
		"\u0000UV\u0005\u0012\u0000\u0000VW\u0005+\u0000\u0000Wc\u0005\u0001\u0000"+
		"\u0000XY\u0005\u0013\u0000\u0000Y^\u00050\u0000\u0000Z[\u0005\u0011\u0000"+
		"\u0000[]\u00050\u0000\u0000\\Z\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000ac\u0005\u0001\u0000\u0000b?\u0001"+
		"\u0000\u0000\u0000bB\u0001\u0000\u0000\u0000bE\u0001\u0000\u0000\u0000"+
		"bH\u0001\u0000\u0000\u0000bK\u0001\u0000\u0000\u0000bU\u0001\u0000\u0000"+
		"\u0000bX\u0001\u0000\u0000\u0000c\u0005\u0001\u0000\u0000\u0000dh\u0003"+
		"\u0012\t\u0000eh\u0003\u000e\u0007\u0000fh\u0003\f\u0006\u0000gd\u0001"+
		"\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"h\u0007\u0001\u0000\u0000\u0000ij\u0005\u0014\u0000\u0000jk\u00057\u0000"+
		"\u0000kl\u0005\u0015\u0000\u0000lm\u0005\u0016\u0000\u0000mn\u0007\u0001"+
		"\u0000\u0000no\u0005\u0001\u0000\u0000op\u0005\u001a\u0000\u0000pq\u0005"+
		"9\u0000\u0000qr\u0005\u0001\u0000\u0000rs\u0005\u001b\u0000\u0000s\t\u0001"+
		"\u0000\u0000\u0000tu\u0005\u001c\u0000\u0000uv\u0007\u0002\u0000\u0000"+
		"vw\u0005\u0015\u0000\u0000wx\u0005\u001d\u0000\u0000xy\u0005+\u0000\u0000"+
		"yz\u0005\u0001\u0000\u0000z{\u0005\u0014\u0000\u0000{|\u00057\u0000\u0000"+
		"|}\u0005\u0001\u0000\u0000}~\u0005\u001e\u0000\u0000~\u000b\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u001f\u0000\u0000\u0080\u0081\u00057\u0000"+
		"\u0000\u0081\u0083\u0005\u0015\u0000\u0000\u0082\u0084\u0003\u000e\u0007"+
		"\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u001e\u0000"+
		"\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089\u008a\u0005 \u0000\u0000"+
		"\u008a\u008b\u0005+\u0000\u0000\u008b\u008c\u0005!\u0000\u0000\u008c\u008d"+
		"\u0005+\u0000\u0000\u008d\u008f\u0005\u0015\u0000\u0000\u008e\u0090\u0003"+
		"\u0010\b\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u001e"+
		"\u0000\u0000\u0094\u000f\u0001\u0000\u0000\u0000\u0095\u0096\u0005\"\u0000"+
		"\u0000\u0096\u0097\u0005+\u0000\u0000\u0097\u0098\u0005+\u0000\u0000\u0098"+
		"\u00a4\u0005\u0001\u0000\u0000\u0099\u009a\u0005#\u0000\u0000\u009a\u009b"+
		"\u0005,\u0000\u0000\u009b\u00a4\u0005\u0001\u0000\u0000\u009c\u009d\u0005"+
		"$\u0000\u0000\u009d\u009e\u0005+\u0000\u0000\u009e\u00a4\u0005\u0001\u0000"+
		"\u0000\u009f\u00a0\u0005%\u0000\u0000\u00a0\u00a1\u00058\u0000\u0000\u00a1"+
		"\u00a4\u0005\u0001\u0000\u0000\u00a2\u00a4\u0003\u0004\u0002\u0000\u00a3"+
		"\u0095\u0001\u0000\u0000\u0000\u00a3\u0099\u0001\u0000\u0000\u0000\u00a3"+
		"\u009c\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u0011\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005&\u0000\u0000\u00a6\u00a7\u00057\u0000\u0000\u00a7\u00a9\u0005"+
		"\u0015\u0000\u0000\u00a8\u00aa\u0003\u0014\n\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005\u001e\u0000\u0000\u00ae\u0013\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005\'\u0000\u0000\u00b0\u00b1\u0005*\u0000"+
		"\u0000\u00b1\u00ba\u0005\u0001\u0000\u0000\u00b2\u00b3\u0005(\u0000\u0000"+
		"\u00b3\u00b4\u0005+\u0000\u0000\u00b4\u00ba\u0005\u0001\u0000\u0000\u00b5"+
		"\u00b6\u0005)\u0000\u0000\u00b6\u00b7\u00056\u0000\u0000\u00b7\u00ba\u0005"+
		"\u0001\u0000\u0000\u00b8\u00ba\u0003\u0004\u0002\u0000\u00b9\u00af\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b2\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u0015\u0001"+
		"\u0000\u0000\u0000\f\u001c\u001e=Q^bg\u0085\u0091\u00a3\u00ab\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}