package com.th.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.model.Product;
import com.th.productrepository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	
	@Autowired
	ProductRepository pr;
	
	@PostMapping("/product")
	public ResponseEntity<Product> save(@RequestBody Product p){
		
		Product pro = pr.save(p);
		return new ResponseEntity<Product>(pro,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getAllproducts")
	public ResponseEntity<List<Product>> getAllproducts(){
		
		List<Product> allpro = pr.findAll();
		return new ResponseEntity<List<Product>>(allpro,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/getAproduct/{pid}")
	public ResponseEntity<Product> getAproduct(@PathVariable int pid){
		
		Optional<Product> pro = pr.findById(pid);
		if(pro.isPresent()) {
			Product p = pro.get();
			return new ResponseEntity<Product>(p,HttpStatus.OK);
			
			
		}
		
		
		
		return  new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		
		}
	
	
	
	@DeleteMapping("/deleteAproduct/{pid}")
	public ResponseEntity<Product> deleteaproduct(@PathVariable int pid){
		
		if(pr.existsById(pid)) {
			pr.deleteById(pid);
			return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
			
		}
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		
		
	}
	
	
	
	
	
	

}
