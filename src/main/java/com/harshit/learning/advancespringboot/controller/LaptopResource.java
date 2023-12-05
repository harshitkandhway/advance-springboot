package com.harshit.learning.advancespringboot.controller;

import com.harshit.learning.advancespringboot.domain.Laptop;
import com.harshit.learning.advancespringboot.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/laptops")
public class LaptopResource {

    @Autowired
    private LaptopService laptopService;

    @GetMapping
    public ResponseEntity<List<Laptop>> getLaptop(){
        List<Laptop> all = laptopService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(all);
    }

    @PostMapping
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){
        Laptop saved = laptopService.addLaptop(laptop);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

}
