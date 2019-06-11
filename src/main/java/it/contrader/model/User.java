package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	
	@Id
	@Column(name = "iduser")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iduser;

	@Column(name = "username")
	@NotNull
	private String username;

	@Column(name = "password")
	@NotNull
	private String password;

	@NotNull
	@Column(name = "usertype")
	private String usertype;

	@NotNull
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Column(name = "surname")
	private String surname;
	
	@NotNull
	@Column(name = "ssn")
	private String ssn;
}
