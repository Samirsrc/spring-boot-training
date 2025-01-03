package com.samircode.demo.service;

import com.samircode.demo.model.Laptop;
import com.samircode.demo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
@Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }
    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
