package com.hackathon.project.employeewellbeing;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chatinfo")
public class ChatBox {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String avatar;
	private Boolean reply;
	private String type;
	private String file;
	private String date;
	
	public ChatBox(int id, String name, String avatar, Boolean reply, String type, String file, String date) {
		super();
		this.id = id;
		this.name = name;
		this.avatar = avatar;
		this.reply = reply;
		this.type = type;
		this.file = file;
		this.date = date;
	}
	
	public ChatBox(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Boolean getReply() {
		return reply;
	}
	public void setReply(Boolean reply) {
		this.reply = reply;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
