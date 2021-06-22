package com.projet.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.projet.dao.ICatalogDAO;
import com.projet.entities.Carburant;

@Transactional
public class CatalogServiceImpl implements ICatalogService {
	private ICatalogDAO dao;

	public void setDao(ICatalogDAO dao) {
		this.dao = dao;
	}

	public void addCarburant(Carburant c) {
		dao.addCarburant(c);

	}

	public List<Carburant> listCarburant() {
		return dao.listCarburant();
	}

	public Carburant getCarburant(String ref) {
		return dao.getCarburant(ref);
	}

	public void deleteCarburant(String ref) {
		dao.deleteCarburant(ref);

	}

	public void updateCarburant(Carburant c) {
		dao.updateCarburant(c);

	}

}
