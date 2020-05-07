package com.management.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import javax.persistence.JoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(	name = "users", 
uniqueConstraints = { 
		@UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "password") 
	})


public class User implements Serializable{
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public User(Long id, @NotBlank @Size(max = 20) String username, @NotBlank @Size(max = 250) String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 20)
	private String username;

	@NotBlank
	@Size(max = 250)
	private String password;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_roles", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
