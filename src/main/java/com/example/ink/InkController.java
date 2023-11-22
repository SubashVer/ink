package com.example.ink;

import com.example.ink.Ink;
import com.example.ink.InkService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/ink")
@RestController
public class InkController {

	private InkService service;

    public InkController(InkService service) {
        this.service = service;
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Ink> getInk(@PathVariable("id") Integer inkId) {
        return service.get(inkId);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Ink updateInk(@PathVariable("id") Integer inkId, @RequestBody Ink ink) {
        return service.update(inkId, ink);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ink> getAll() {
        return service.getAll();
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Ink createInk(@RequestBody Ink ink) {
        Ink createdInk = service.create(ink);
        return createdInk;
    }
}
