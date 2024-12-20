package com.entity;

import java.util.Date;
import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Note {
	
	@Id
	private int id;
	private String title;
	@Column(length = 2000)
	private String content;
	private Date date;

//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getContent() {
//		return content;
//	}
//	public void setContent(String content) {
//		this.content = content;
//	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
//	
	public Note(String title, String content, Date date) {
		super();
		this.id = new Random().nextInt(1000);
		this.title = title;
		this.content = content;
		this.date = date;
	}
//	
//	public Note() {
//		super();
//	}	
	
}
