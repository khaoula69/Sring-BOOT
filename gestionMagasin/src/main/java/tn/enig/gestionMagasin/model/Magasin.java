package tn.enig.gestionMagasin.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity

public class Magasin  {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	 Integer id;
	 String nom;
	 String lieu;
	public Magasin(int id, String nom, String lieu) {
		super();
		this.id = id;
		this.nom = nom;
		this.lieu = lieu;
	}
	public Magasin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	

}
