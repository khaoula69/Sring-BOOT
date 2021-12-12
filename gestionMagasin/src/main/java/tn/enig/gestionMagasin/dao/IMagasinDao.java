package tn.enig.gestionMagasin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.gestionMagasin.model.Magasin;

@Repository
public interface IMagasinDao extends JpaRepository<Magasin, Integer> {

}
