package com.evalsba.springboot.web.dto;

public class UsuarioRegistrationDto {
	private String nombres;
	private String apellidos;
	private String email;
	private String password;
	
	public UsuarioRegistrationDto(){
		
	}

	public UsuarioRegistrationDto(String nombres, String apellidos, String email, String password) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
