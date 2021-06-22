package com.projet.services;

import java.util.List;

import com.projet.entities.Carburant;

public interface ICatalogService {
	public void addCarburant(Carburant c);

	public List<Carburant> listCarburant();

	public Carburant getCarburant(String ref);

	public void deleteCarburant(String ref);

	public void updateCarburant(Carburant c);
}
