package tn.enig.gestionMagasin.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Produit  {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer idp;
	 String description;
	 String dateAjout;
	 int quantite ;
	 float prixAchat;
	 float prixVente;
	@ManyToOne
	@JoinColumn(name = "magasin_id")
	 Magasin magasin;
	
	


	
	public Produit(Integer idp, String description, String dateAjout, int quantite, float prixAchat, float prixVente,
			Magasin magasin) {
		super();
		this.idp = idp;
		this.description = description;
		this.dateAjout = dateAjout;
		this.quantite = quantite;
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
		this.magasin = magasin;
	}


	public Produit() {
		super();	}


	public Integer getIdp() {
		return idp;
	}


	public void setIdp(Integer idp) {
		this.idp = idp;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDateAjout() {
		return dateAjout;
	}


	public void setDateAjout(String dateAjout) {
		this.dateAjout = dateAjout;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public float getPrixAchat() {
		return prixAchat;
	}


	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}


	public float getPrixVente() {
		return prixVente;
	}


	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
	}


	public Magasin getMagasin() {
		return magasin;
	}


	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}



}
