package com.example.kodlamaiodevs.business.abstracts;

import com.example.kodlamaiodevs.business.requests.CreateLanguageRequest;
import com.example.kodlamaiodevs.business.requests.UpdateLanguageRequest;
import com.example.kodlamaiodevs.business.responses.GetAllLanguageResponse;
import com.example.kodlamaiodevs.business.responses.GetByIdLanguageResponse;

import java.util.List;

public interface LanguageService {
    List<GetAllLanguageResponse> getAll();

    GetByIdLanguageResponse getById(int id);

    void add(CreateLanguageRequest createLanguageRequest);

    void update(UpdateLanguageRequest updateLanguageRequest);

    void delete(int id);


}