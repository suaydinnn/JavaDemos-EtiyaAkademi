package com.example.kodlamaiodevs.business.concretes;

import com.example.kodlamaiodevs.business.abstracts.TechnologyService;
import com.example.kodlamaiodevs.business.requests.CreateTechnologyRequest;
import com.example.kodlamaiodevs.business.requests.UpdateTechnologyRequest;
import com.example.kodlamaiodevs.business.responses.GetAllTechnologyResponse;
import com.example.kodlamaiodevs.business.responses.GetByIdTechnologyResponse;
import com.example.kodlamaiodevs.dataAccess.abstracts.TechnologyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TechnologyManager implements TechnologyService {

    private TechnologyRepository technologyRepository;


    @Override
    public List<GetAllTechnologyResponse> getAll() {

        return null;
    }


    @Override
    public GetByIdTechnologyResponse getById(int id) {
         return null;

    }


    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {

    }

    @Override
    public void update(UpdateTechnologyRequest updateTechnologyRequest) {

    }

    @Override
    public void delete(int id) {
        this.technologyRepository.deleteById(id);
    }
}