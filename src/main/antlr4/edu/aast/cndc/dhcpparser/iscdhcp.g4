    grammar iscdhcp;

    /* The ISC DHCP Grammer */
    /*
        Todo:
            
            1-Add the correct subnet mask RegEx
            2-Adding option arch
                
    */

    /* 
    @header {
        package edu.aast.cndc.dhcpparser;
    }
    */

    @members {
        // You can add any helper methods or fields here if needed
        void startFile() {   }
        void finishFile() { }
    }


    //Start the main directives
    config: { startFile(); } (serverconfline | commonconfline | confblock | keyblock | zoneblock)+ EOF {   finishFile();}                      # DHCPConfig    
        ;

    serverconfline: SINGLEDIRECTIVE';'                                              # AuthoritativeDirective
                  | 'allow' ('booting'|'bootp')';'                                  # AllowBootingDirective 
                  | 'update-static-leases' ONOFFSWITCH';'                           # UpdateStaticLeasesDirective  
                  | 'default-lease-time' POSTIVENUMBER';'                               # DefaultLeaseTimeDirective    
                  | 'max-lease-time' POSTIVENUMBER';'                                   # MaxLeaseTimeDirective   
                  | 'log-facility' LOGFACILITY';'                                   # LogFacilityDirective
                  | 'include' FILEPATH';'                                           # IncludeDirective  
                  | 'ddns-updates' ONOFFSWITCH';'                                   # DDNSUpdatesDirective 
                  | 'ddns-update-style' UPDATESTYLES';'                             # DDNSUpdateStyleDirective
                    ;

    commonconfline: 'ddns-domainname' QUOTEDDOMAINNAME';'                                 # DDNSDomainNameDirective           
                  | 'ddns-hostname' QUOTEDHOSTNAME';'                               # DDNSHostNameDirective    
                  | 'ddns-rev-domainname' QUOTEDREVDOMAINNAME';'                          # DDNSRevDomainNameDirective
                  | 'option domain-name' QUOTEDDOMAINNAME';'                              # OptionDomainNameDirective   
                  | 'option domain-name-servers' (IP4 (',' IP4)*)';'                # OptionDomainNameServersDirective
                  | 'option routers' IP4';'                                         # OptionRoutersDirective    
                  | 'option domain-search' (QUOTEDDOMAINNAME (',' QUOTEDDOMAINNAME)*)';'        # OptionDomainSearchDirective
                  | 'filename' FILEPATH';'                                         # FilenameDirectiveCommon    
                  | 'option'  'arch' 'code' POSTIVENUMBER '=' TYPE ('16'|'32') ';'      # OptionArchDirective
                  | if                                                          # IfOnlyDirective
                  ;

    if: 'if' ifcondition '{' iftrueblocks+ '}' ('else' '{' ifelseblocks+  '}')?               #IfConditionBlock
      ;

    ifcondition: 'option' ('arch' | 'code') '=' ARCHTYPE                      #IfConditionArch
               ;

    iftrueblocks: commonconfline                                        #IfTrueCommonConfLine
                 | confblock                                             #IfTrueConfBlock
                ;

    ifelseblocks: commonconfline                                       #IfElseCommonConfLine
                 | confblock                                            #IfElseConfBlock
                ;


    confblock: hostblock                                                            # HostBlockDirective                                                                               
             | subnetblock                                                          # SubnetBlockDirective    
             | sharednetblock                                                       # SharedNetBlockDirective
             ;

    keyblock: 'key' HOSTNAME '{'                                                    
                'algorithm' ('hmac-md5' | 'hmac-sha1' | 'hmac-sha256')';'                        
                'secret' SECRET';'                                 
            '};'                                                                    # KeyBlockDirective
            ;                                                                      
    zoneblock: 'zone' (DOMAINNAME|REVDOMAINNAME) '{'                                                    
                'primary' IP4';'                                 
                'key' HOSTNAME';'                                 
            '}'                                                                    # ZoneBlockDirective
            ;               
    sharednetblock: 'shared-network' HOSTNAME '{' subnetblock+  '}';                                                   

    subnetblock: 'subnet' IP4 'netmask' IP4 '{' subnetblockbody+  '}';              
    subnetblockbody: 'range' IP4 IP4';'                                             # RangeDirective
                   | 'option subnet-mask' NETMASK';'                                # OptionSubnetMaskDirective
                   | 'next-server' IP4';'                                           # NextServerDirective   
                   | 'filename' FILEPATH';'                                         # FilenameDirective 
                   | commonconfline                                                 # CommonConfLineInSubnetblock
                   ;

    hostblock: 'host' HOSTNAME '{' hostblockbody1+  '}'; 
    hostblockbody1: 'hardware ethernet' MACADDRESS';'                               # HardwareEthernetDirective    
                  | 'fixed-address' IP4';'                                          # FixedAddressDirective    
                  | 'option host-name' QUOTEDHOSTNAME';'                            # OptionHostNameDirective
                  | commonconfline                                                  # CommonConfLineInHostblock
                  ;

    // Start the tokens here  
    ARCHTYPE: '00:'('00'|'06'|'07'|'09'|'0A');
    TYPE: ('string' | 'boolean' | 'ip-address' | 'ip-addresses' | 'unsigned integer' | 'unsigned-integers' | 'integer' | 'integers' | 'octet' | 'octets' );
    MACADDRESS: HEX HEX ':' HEX HEX ':' HEX HEX ':' HEX HEX ':' HEX HEX ':' HEX HEX ;
    IP4 : OCTET'.'OCTET'.'OCTET'.'OCTET;
    NETMASK : OCTET'.'OCTET'.'OCTET'.'OCTET;
    REVDOMAINNAME: [0-9]+('.'[0-9]+)+'.in-addr.arpa';
    QUOTEDREVDOMAINNAME: '"' [0-9]+('.'[0-9]+)+'.in-addr.arpa' '"';
    DOMAINNAME: [a-zA-Z][a-zA-Z0-9-_]+('.'[a-zA-Z][a-zA-Z0-9-_]+)+;
    QUOTEDDOMAINNAME: '"'[a-zA-Z][a-zA-Z0-9-_]+('.'[a-zA-Z][a-zA-Z0-9-_]+)+'"';
    
    LOGFACILITY : ('warn' | 'crit' | 'err' | 'local'[0-9]);
    POSTIVENUMBER: [0-9]+;
    SINGLEDIRECTIVE: 'authoritative';
    UPDATESTYLES: ('interim'|'none'|'standard'|'ad-hoc');
    ONOFFSWITCH: ('on'|'off');
    QUOTEDHOSTNAME: '"'HOSTNAME'"';
    HOSTNAME: [a-zA-Z][a-zA-Z0-9-_]*;
    FILEPATH: '"'[-_./a-zA-Z0-9]+'"';
    SECRET: '"' [a-zA-Z0-9+/=]+ '"';
    COMMENT: '#' ~[\r\n]* -> skip;      
    WS : [ \t\r\n]+ -> skip ;
    fragment OCTET : ([0-9] | [0-9][0-9] | [0-1][0-9][0-9] | '2'[0-5][0-5]);
    fragment HEX: [0-9a-fA-F];
