package es.iesoterohernandez.daw.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")

public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dni;
	private String name;
	private char sexo;
	private int categoria;
	private int anyos;
	public Persona() {
		
	}

	
	
	public Persona(int id, String dni, String name, char sexo, int categoria, int anyos) {
		super();
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.sexo = sexo;
		this.categoria = categoria;
		this.anyos = anyos;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public int getCategoria() {
		return categoria;
	}



	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


	public int getAnyos() {
		return anyos;
	}



	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}

}
