package pojo;

import java.util.Date;

public class User {
private int id;
private String username;
private Date Birthday;
private char sex;
private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Date getBirthday() {
	return Birthday;
}
public void setBirthday(Date birthday) {
	Birthday = birthday;
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
