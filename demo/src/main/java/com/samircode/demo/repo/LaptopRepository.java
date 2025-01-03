package com.samircode.demo.repo;

import com.samircode.demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
      public void save(Laptop lap){
          System.out.println("Saved in Database.. za3ma");
      }
}
