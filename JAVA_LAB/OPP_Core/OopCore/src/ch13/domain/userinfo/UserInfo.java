package ch13.domain.userinfo;

public class UserInfo {

	private String UserId;
	private String passwd;
	private String userName;
	
	public String getUserId() {
		return UserId;
	}
	
	public void setUserId(String userId) {
		UserId = userId;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
