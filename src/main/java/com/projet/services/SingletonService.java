package com.projet.services;

import com.projet.dao.CatalogDAOImpl;

public class SingletonService {
	private static CatalogServiceImpl service;
	static {
		CatalogDAOImpl dao = new CatalogDAOImpl();
		dao.initialiser();
		service = new CatalogServiceImpl();
		service.setDao(dao);
	}

	public static CatalogServiceImpl getService() {
		return service;
	}
}
