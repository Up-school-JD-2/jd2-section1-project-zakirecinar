public class User {
	private int userId;
	private String userName;
	private String password;
	private String email;
	
	public User() {
		
	}
	
	public User(int id, String userName,String password,String email) {
		this.userId=id;
		this.userName=userName;
		this.password=password;
		this.email=email;
		}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "id: "+this.userId+", Kullanıcı adı: " + this.userName + ", Email: " + this.email;
	}
	
}
