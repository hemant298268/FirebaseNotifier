import java.util.List;

public class userObject {

	public String userID;
	public String userName;
	public String usage_lastDate;
	public boolean subscription_active;
	public boolean freeTrial_active;
	public String localFCMToken;
	public int passwordAttempts;
	public String loginBlockedTimestamp;
	public List<authToken> tokenList;
	
	public int getPasswordAttempts() {
		return passwordAttempts;
	}

	public void setPasswordAttempts(int passwordAttempts) {
		this.passwordAttempts = passwordAttempts;
	}

	public String getLoginBlockedTimestamp() {
		return loginBlockedTimestamp;
	}

	public void setLoginBlockedTimestamp(String loginBlockedTimestamp) {
		this.loginBlockedTimestamp = loginBlockedTimestamp;
	}

	public userObject() {
		
	}
	
	public userObject(String userID, String userName, String usage_lastDate, boolean subscription_active, boolean freeTrial_active, String localFCMToken, int passwordAttempts, String loginBlockedTimestamp, List<authToken> tokenList) {
		this.userID = userID;
		this.userName = userName;
		this.usage_lastDate = usage_lastDate;
		this.subscription_active = subscription_active;
		this.freeTrial_active = freeTrial_active;
		this.localFCMToken = localFCMToken;
		this.tokenList = tokenList;
	}
	
	public void printObject() {
		System.out.println("User ID: "+this.userID+"\nuserName: "+this.userName+"\nUsage lastDate: "+this.usage_lastDate+"\nSubscription Active: "+this.subscription_active+"\nFreetrial Active: "+this.freeTrial_active+"\nPasswordAttempts: "+this.passwordAttempts+"\nlogin blockedTimestamp: "+this.loginBlockedTimestamp+"\nLocal FCMToken: "+this.localFCMToken);
		System.out.println("Token List");
		for(authToken token : this.tokenList)
			token.printObject();
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUsage_lastDate() {
		return usage_lastDate;
	}
	public void setUsage_lastDate(String usage_lastDate) {
		this.usage_lastDate = usage_lastDate;
	}
	public boolean isSubscription_active() {
		return subscription_active;
	}
	public void setSubscription_active(boolean subscription_active) {
		this.subscription_active = subscription_active;
	}
	public boolean isFreeTrial_active() {
		return freeTrial_active;
	}
	public void setFreeTrial_active(boolean freeTrial_active) {
		this.freeTrial_active = freeTrial_active;
	}
	public String getLocalFCMToken() {
		return localFCMToken;
	}
	public void setLocalFCMToken(String localFCMToken) {
		this.localFCMToken = localFCMToken;
	}
	public List<authToken> getTokenList() {
		return tokenList;
	}
	public void setTokenList(List<authToken> tokenList) {
		this.tokenList = tokenList;
	}
}
