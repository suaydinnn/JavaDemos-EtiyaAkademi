package com.example.kodlamaiodevs.business.abstracts;

import com.example.kodlamaiodevs.business.requests.CreateTechnologyRequest;
import com.example.kodlamaiodevs.business.requests.UpdateTechnologyRequest;
import com.example.kodlamaiodevs.business.responses.GetAllTechnologyResponse;
import com.example.kodlamaiodevs.business.responses.GetByIdTechnologyResponse;

import java.util.List;

public interface TechnologyService {
    List<GetAllTechnologyResponse> getAll();

    GetByIdTechnologyResponse getById(int id);

    void add(CreateTechnologyRequest createTechnologyRequest);

    void update(UpdateTechnologyRequest updateTechnologyRequest);

    void delete(int id);
}
