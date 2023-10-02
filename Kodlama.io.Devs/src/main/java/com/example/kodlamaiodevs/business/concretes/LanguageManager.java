package com.example.kodlamaiodevs.business.concretes;


import com.example.kodlamaiodevs.business.abstracts.LanguageService;
import com.example.kodlamaiodevs.business.requests.CreateLanguageRequest;
import com.example.kodlamaiodevs.business.requests.UpdateLanguageRequest;
import com.example.kodlamaiodevs.business.responses.GetAllLanguageResponse;
import com.example.kodlamaiodevs.business.responses.GetByIdLanguageResponse;
import com.example.kodlamaiodevs.core.ModelMapperService;
import com.example.kodlamaiodevs.dataAccess.abstracts.LanguageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllLanguageResponse> getAll() {

        return null;
    }

    @Override
    public GetByIdLanguageResponse getById(int id) {
      return null;
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {

    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest) {

    }

    @Override
    public void delete(int id) {
        this.languageRepository.deleteById(id);
    }
}