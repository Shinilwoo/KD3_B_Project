package com.example.demo.user;

public interface UserService {
	
	// Join_Form PAGE
	public void InsertUser (User userDTO); // Join(insert)
//	public void FindID (String usermail); // FindID (for e-mail)
//	public void FindPW (String usermail, String userID);// FindPW (for e-mail + ID )
	public User Login (String userID, String password); // Login (ID,PW) + kakaoAPI, GoogleAPI...
//	
//	// MY PAGE_Form
//	public void UpdatePW(String UserPWcurrent, String UserPWnext);// UpdatePW (UserPWcurrent -> UserPWnext)
//	// deleteUser
//	public void DeleteUser(String password);;

	
	
}
