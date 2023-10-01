package com.example.rentacar.dataAccess.abstracts;

import com.example.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll(); //get all ı çağıran birisi markaları listeler.
}
