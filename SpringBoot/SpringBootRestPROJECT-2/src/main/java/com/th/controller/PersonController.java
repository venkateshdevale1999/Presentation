package com.th.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.model.Person;
import com.th.repository.Personrepo;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	
	@GetMapping("/getpersons")
	public ResponseEntity<List<Person>> getpersons(){
		
		Personrepo p = new Personrepo();
		
		List<Person> plist = p.getpersons();
		return new ResponseEntity<List<Person>>(plist,HttpStatus.OK);
		
		
	}

}
