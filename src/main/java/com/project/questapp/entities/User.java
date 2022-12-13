package com.project.questapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

	@Id
	@Column(name = "id")
	Long id;

	@Column(name = "user_name")
	String userName;

	@Column(name = "password")
	String password;

}
