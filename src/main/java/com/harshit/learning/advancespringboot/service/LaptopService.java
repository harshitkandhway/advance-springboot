package com.harshit.learning.advancespringboot.service;

import com.harshit.learning.advancespringboot.domain.Laptop;
import com.harshit.learning.advancespringboot.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public List<Laptop> getAll() {
        return laptopRepository.findAll();
    }

    public Laptop addLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }
}
