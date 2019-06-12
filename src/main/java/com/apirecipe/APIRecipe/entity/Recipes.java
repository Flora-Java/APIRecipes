package com.apirecipe.APIRecipe.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipes {
	private String title;
	private String ingredients;
	private String thumbnail;
	private Integer id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Recipes(String title, String ingredients, String thumbnail, Integer id) {
		super();
		this.title = title;
		this.ingredients = ingredients;
		this.thumbnail = thumbnail;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Recipes [title=" + title + ", ingredients=" + ingredients + ", thumbnail=" + thumbnail + ", id=" + id
				+ "]";
	}
	public Recipes(String title, String ingredients, String thumbnail) {
		super();
		this.title = title;
		this.ingredients = ingredients;
		this.thumbnail = thumbnail;
	}
	public Recipes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
