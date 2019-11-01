package com.example.restdemo.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Data
@Entity
@Table(name = "notes")
public class Note { //Class with data handling
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String title;
	private String body;
	@CreationTimestamp
	private Timestamp created;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return body;
	}
	public void setMessage(String message) {
		this.body = message;
	}
	
	
	
}
 