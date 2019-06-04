package it.contrader.model;

public class User {
	private int userId;
	private String username;
	private String usertype;
	private String password;
	private String name;
	private String surname;
	private String cf;

	public User() {
	}

	public User(String username, String usertype, String password, String name, String surname, String cf) {
		this.username = username;
		this.usertype = usertype;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.cf = cf;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

    public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}
	
	@Override
	public String toString() {
		return this.getUserId() + "\t" + this.getUsername() + "\t" + this.getUsertype() + "\t" + this.getPassword() + "\t" + this.getName() + "\t" + this.getSurname() + "\t" + this.getCf();
	}

	public boolean equals(User userCompare) {
		if (!this.getUsername().equals(userCompare.getUsername())) {
			return false;
		}

		if (!this.getUsertype().equals(userCompare.getUsertype())) {
			return false;
		}
		
		if (!this.getPassword().equals(userCompare.getPassword())) {
			return false;
		}
		
		if (!this.getName().equals(userCompare.getName())) {
			return false;
		}
		
		if (!this.getSurname().equals(userCompare.getSurname())) {
			return false;
		}
		
		if (!this.getCf().equals(userCompare.getCf())) {
			return false;
		}

		return true;

	}

}
