package com.project.questapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "likes")
@Data
public class Like {

	@Id
	@Column(name = "id")
	Long id;

	@Column(name = "post_id")
	Long postId;

	@Column(name = "user_id")
	Long userId;
}
