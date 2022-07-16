package co.edu.iudigital.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5083347833938441930L;

	//id INT NOT NULL AUTO_INCREMENT,
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//username VARCHAR(45) NOT NULL,
	@Column(name = "username", length = 120, nullable = false, unique = true )
	private String username;
	
	//nombre VARCHAR(45) NOT NULL,
	@Column(name = "nombre", length = 45, nullable = false)
	private String nombre;
	
	//apellido VARCHAR(120) NULL,
	@Column(name = "apellido", length = 120)
	private String apellido;
	
	//password VARCHAR(250) NULL,
	@Column(name = "password", length = 250)
	private String password;
	
	//fecha_nacimiento DATE NULL,
	@Column(name = "fecha_nacimiento")
	private LocalDate fechaNacimiento;
	
	//enabled TINYINT NULL DEFAULT 1,
	@Column(columnDefinition = "NULL DEFAULT 1")
	private Boolean enable;
	
	//red_social TINYINT NULL DEFAULT 0,
	@Column(name ="red_social")
	private Boolean redSocial;
	
	//image TEXT NULL DEFAULT 'https://www.business2community.com/social-media-articles/importance-profile-picture-career-01899604',
	private String image; 
	
	@PrePersist
	public void persist() {
		if(redSocial == null) {
			redSocial = false;
		}
		if(image == null || "".equals(image)) {
			image = "https://www.business2community.com/social-media-articles/importance-profile-picture-career-01899604";
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Boolean getRedSocial() {
		return redSocial;
	}

	public void setRedSocial(Boolean redSocial) {
		this.redSocial = redSocial;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	}
	
	
	
	//PRIMARY KEY(id),
	//UNIQUE(username)


