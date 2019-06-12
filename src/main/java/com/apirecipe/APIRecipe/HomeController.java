package com.apirecipe.APIRecipe;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.apirecipe.APIRecipe.entity.Recipes;

@RestController
public class HomeController {

	RestTemplate rt = new RestTemplate();
	
	@GetMapping("/")
	public  List<Recipes> listAll() {
		
		ArrayList<Recipes> list =  new ArrayList();
		return list;
	}
	
}
