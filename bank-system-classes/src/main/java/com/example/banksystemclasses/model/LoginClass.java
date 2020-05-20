package com.example.banksystemclasses.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter@Setter
public class LoginClass
{
	@NotNull(message="Id cannot be empty")
//	@Pattern(regexp="^[0-9]",message="Please enter Id in correct format.")
    private Long id;

	@NotNull(message="password cannot be empty")
    private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
