package tn.enig.gestionMagasin.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.gestionMagasin.dao.IMagasinDao;
import tn.enig.gestionMagasin.dao.IProduitDao;
import tn.enig.gestionMagasin.model.Magasin;
import tn.enig.gestionMagasin.model.Produit;

@RestController
public class AppRest {
	
	@Autowired
	IProduitDao prodDao;

	public IProduitDao getProdDao() {
		return prodDao;
	}

	public void setProdDao(IProduitDao prodDao) {
		this.prodDao = prodDao;
	}
	
	@Autowired
	IMagasinDao magDao;

	public IMagasinDao getMagDao() {
		return magDao;
	}

	public void setMagDao(IMagasinDao magDao) {
		this.magDao = magDao;
	}
	@GetMapping("/produits")
	public List<Produit> getProd(){
		return prodDao.findAll();
	}
	
	@PostMapping("/addProd")
	public void addProd(@RequestBody Produit p) {
		prodDao.save(p);
	}
	@DeleteMapping("/deleteProd/{id}")
	public void deleteProd(@PathVariable("id") int id) {
		magDao.deleteById(id);
	}
	@GetMapping("/magasins")
	public List<Magasin> getMag(){
		return magDao.findAll();
	}
	@PostMapping("/addMag")
	public void addMag(@RequestBody Magasin m) {
		magDao.save(m);
	}
	@DeleteMapping("/deleteMag/{id}")
	public void deleteMag(@PathVariable("id") int id) {
		magDao.deleteById(id);
	}
	

}
