package com.project.questapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "comments")
@Data
public class Comment {

	@Id
	@Column(name = "id")
	Long id;

	@Column(name = "post_id")
	Long postId;

	@Column(name = "user_id")
	Long userId;

	@Lob
	@Column(name = "text")
	String text;

}
