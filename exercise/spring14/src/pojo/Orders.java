package pojo;

import java.util.Date;

public class Orders {
private int id;
private int user_id;
private Date createtime;
private String number;
private String note;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public Date getCreatetime() {
	return createtime;
}
public void setCreatetime(Date createtime) {
	this.createtime = createtime;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
}
