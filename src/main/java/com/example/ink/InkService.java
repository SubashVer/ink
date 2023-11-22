package com.example.ink;

import com.example.ink.Ink;
import com.example.ink.InkRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class InkService {

	
	private InkRepository repository;
	
	public InkService(InkRepository repository) {
		this.repository = repository;
	}
	
	public Ink create(Ink ink) {
		return repository.save(ink);
	}
	
	public Optional<Ink> get(Integer inkId) {
		Optional<Ink> optionalInk = repository.findById(inkId);
		return optionalInk;
	}
	
	 public List<Ink> getAll() {
	        List<Ink> inks = null;
	       // try {
	            inks = repository.findAll();
	       /* } catch (Exception e) {
	            System.out.println("STackTrace: " + Arrays.toString(e.getStackTrace()));
	            System.out.println("Caught an Exception....");
	            inks = new ArrayList<>();
	        }*/
	        return inks;
	 }
	        public Ink update(Integer inkId, Ink ink) {
	        if (inkId != ink.getInkId()) {
	            //throw new InkValidationException("Mismatch in InkId");
	        }
	        Optional<Ink> inkOptional = repository.findById(inkId);
	        if (inkOptional.isPresent()) {
	            return repository.save(ink);
	        }
	        else {
	            //throw new InkNotFoundException("Employee Not found: " + inkId);
	        	return null;
	        }
}
}
