package com.projet.dao;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.projet.entities.Carburant;

public class CatalogDAOJPAImpl implements ICatalogDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addCarburant(Carburant c) {
		em.persist(c);

	}

	@Override
	public List<Carburant> listCarburant() {
		Query req = em.createQuery("SELECT c FROM Carburant c ");
		return req.getResultList();
	}

	@Override
	public Carburant getCarburant(String ref) {
		return em.find(Carburant.class, ref);
	}

	@Override
	public void deleteCarburant(String ref) {
		Carburant c = getCarburant(ref);
		em.remove(c);

	}

	@Override
	public void updateCarburant(Carburant c) {
		em.merge(c);

	}
}
