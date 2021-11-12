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

import com.th.model.Train;
import com.th.trainrepository.TrainRepository;

@RestController
@RequestMapping("/trains")
public class Controller {
	
	@Autowired
	TrainRepository tr;
	@PostMapping("/inserttrain")
	public ResponseEntity<Train> save(@RequestBody Train t){
		Train td=tr.save(t);
		return new ResponseEntity<Train>(td,HttpStatus.OK);
		
	}
	
	@GetMapping("/getalltrains")
	public ResponseEntity<List<Train>> getAllTrains()
	{
	List<Train> tlist = tr.findAll();
	return new ResponseEntity<List<Train>>(tlist,HttpStatus.OK);

	}

	@GetMapping("/getbytrainno/{trainno}")
	public ResponseEntity<Train> getbytrainno(@PathVariable int trainno){
		Optional<Train> ts=tr.findById(trainno);
		if(ts.isPresent()) {
			Train train=ts.get();
			return new ResponseEntity<Train>(train,HttpStatus.OK);
		}
		return new ResponseEntity<Train>(HttpStatus.NOT_FOUND);
		
	}
	
	@DeleteMapping("/deletebytrainno/{trainno}")
	public ResponseEntity<Train> deletebytrainno(@PathVariable int trainno){
		
		if(tr.existsById(trainno)) {
			tr.deleteById(trainno);
			return new ResponseEntity<Train>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Train>(HttpStatus.NOT_FOUND);
		
	}
	
	
	

}
