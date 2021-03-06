package com.andr7st.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="clientes") // Por norma de convencion el nombre en la base de datos comienza por minuscula y son en plural.
public class Cliente implements Serializable {

	@Id // Es llave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	
//	@Column()
	@Column(nullable=false)
	private String nombre;
	private String apellido;
	@Column(nullable=false, unique=true)
	private String email;
	
	@Column(name="create_at") // El nombre en la base de datos no usa camelCase.
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt = new java.util.Date();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	private static final long serialVersionUID = 1L;
}
