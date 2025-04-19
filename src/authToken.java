
public class authToken {

	String FCMToken;
	String date_lastLogin;
	String date_latestLogin;
	boolean active;
	
	public authToken() {
		
	}
	
	public authToken(String FCMToken, String date_lastLogin, String date_latestLogin, boolean active) {
		this.FCMToken = FCMToken;
		this.date_lastLogin = date_lastLogin;
		this.date_latestLogin = date_latestLogin;
		this.active = active;
	}

	public String getFCMToken() {
		return FCMToken;
	}
	
	public void printObject() {
		System.out.println("FCM Token: "+this.FCMToken+"\nDate lastLogin: "+this.date_lastLogin+"\nDate latestLogin: "+this.date_latestLogin+"\nActive: "+this.active);
	}

	public void setFCMToken(String fCMToken) {
		FCMToken = fCMToken;
	}

	public String getDate_lastLogin() {
		return date_lastLogin;
	}

	public void setDate_lastLogin(String date_lastLogin) {
		this.date_lastLogin = date_lastLogin;
	}

	public String getDate_latestLogin() {
		return date_latestLogin;
	}

	public void setDate_latestLogin(String date_latestLogin) {
		this.date_latestLogin = date_latestLogin;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
