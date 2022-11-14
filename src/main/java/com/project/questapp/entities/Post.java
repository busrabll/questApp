package com.project.questapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

	@Id
	@Column(name = "id")
	Long id;

	@Column(name = "user_id")
	Long userId;

	@Column(name = "title")
	String title;

	@Lob
	@Column(name = "text")
	String text;
}
