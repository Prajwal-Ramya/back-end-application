package com.example.springbootproject1.springproject.user;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;






@Entity
@Table(name = "usermaster") 

	
public class UserMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_generator")
	@SequenceGenerator(name = "user_seq_generator", sequenceName = "user_id_seq", allocationSize = 1)
	
	@Column(name="user_id", nullable = false)
	private Long user_id;
	@Column(name="first_name", nullable = false) 
	private String firstName;
	 @Column(name="last_name", nullable = false)
	private String last_name;
	 @Column(name="mail_id", nullable = false)
	private String mail_id;
	 @Column(name="username", nullable = false)
	private String userName;
	 @Column(name="password", nullable = false)
	private String password;
	 @Column(name="confirm_password", nullable = false)
	private String confirmPassword;
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUser_name(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
}
	