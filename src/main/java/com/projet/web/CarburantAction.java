package com.projet.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.projet.entities.Carburant;
import com.projet.services.ICatalogService;

public class CarburantAction extends ActionSupport {
	public Carburant carburant = new Carburant();
	public List<Carburant> carburants;
	public String ref;
	public boolean editMode = false;
	@Autowired
	private ICatalogService service;

	public String index() {
		carburants = service.listCarburant();
		return SUCCESS;
	}

	public String save() {
		if (editMode == false)
			service.addCarburant(carburant);
		else {
			service.updateCarburant(carburant);
			editMode = false;
			carburant = new Carburant();
		}
		carburants = service.listCarburant();
		return SUCCESS;
	}

	public String delete() {
		service.deleteCarburant(ref);
		carburants = service.listCarburant();
		return SUCCESS;
	}

	public String edit() {
		editMode = true;
		carburant = service.getCarburant(ref);
		carburants = service.listCarburant();
		return SUCCESS;
	}

}
