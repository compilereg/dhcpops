package models;

public class DNSUpdateKeyModel {
	private String KeyName;
	private String Alg;
	private String Secret;
	
	public String getKeyName() {
		return KeyName;
	}
	public void setKeyName(String keyName) {
		KeyName = keyName;
	}
	public String getAlg() {
		return Alg;
	}
	public void setAlg(String alg) {
		Alg = alg;
	}
	public String getSecret() {
		return Secret;
	}
	public void setSecret(String secret) {
		Secret = secret;
	}
	
	
}
