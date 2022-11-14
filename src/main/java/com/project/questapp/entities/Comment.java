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
@Table(name = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
