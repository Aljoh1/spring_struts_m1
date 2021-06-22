package com.projet.dao;

import java.util.*;

import org.apache.log4j.Logger;

import com.projet.entities.Carburant;

public class CatalogDAOImpl implements ICatalogDAO {
	private Map<String, Carburant> carburant = new HashMap<String, Carburant>();
	Logger log = Logger.getLogger(this.getClass());

	public void addCarburant(Carburant c) {
		carburant.put(c.getReference(), c);

	}

	public List<Carburant> listCarburant() {
		return new ArrayList<Carburant>(carburant.values());
	}

	public Carburant getCarburant(String ref) {
		return carburant.get(ref);
	}

	public void deleteCarburant(String ref) {
		carburant.remove(ref);

	}

	public void updateCarburant(Carburant c) {
		carburant.put(c.getReference(), c);

	}

	public void initialiser() {
		addCarburant(new Carburant("123", "ABCD", 4560, 45));
		addCarburant(new Carburant("456", "NFIFJ", 4560, 45));
		addCarburant(new Carburant("59", "JKFP", 4560, 45));
		addCarburant(new Carburant("48", "ABDI", 4560, 45));
		log.info("Initialisation de liste de Carburant");
	}

}
