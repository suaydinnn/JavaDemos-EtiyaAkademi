package com.example.rentacar.webApi.controllers;

import com.example.rentacar.business.abstracts.BrandService;
import com.example.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//annotation, spring framework bu uygulamayı derlediğinde restcontroller olduğu için bu classı erişim noktası kabul eder.
@RequestMapping("/api/brands") //insanların controllerla iletişim kurmasını sağlar, adresleme
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getAll")
    public List<Brand> getAll(){
        return brandService.getAll();
    }
}
