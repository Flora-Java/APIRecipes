package com.apirecipe.APIRecipe.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Listofrecipes {
	private List<Recipes> results;

	public List<Recipes> getResults() {
		return results;
	}

	public void setResults(List<Recipes> results) {
		this.results = results;
	}

	public Listofrecipes(List<Recipes> results) {
		super();
		this.results = results;
	}

	public Listofrecipes() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Listofrecipes []";
	}
	
	

}
