package com.example.kodlamaiodevs.webApi;

import com.example.kodlamaiodevs.business.abstracts.TechnologyService;
import com.example.kodlamaiodevs.business.requests.CreateTechnologyRequest;
import com.example.kodlamaiodevs.business.requests.UpdateTechnologyRequest;
import com.example.kodlamaiodevs.business.responses.GetAllTechnologyResponse;
import com.example.kodlamaiodevs.business.responses.GetByIdTechnologyResponse;
import jakarta.validation.Valid;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
@AllArgsConstructor
public class TechnologyController {
    private TechnologyService technologyService;


    @GetMapping("/getall")
    public List<GetAllTechnologyResponse> getAll() {
        return technologyService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateTechnologyRequest createTechnologyRequest) {
        this.technologyService.add(createTechnologyRequest);
    }

    @GetMapping("/{id}")
    public GetByIdTechnologyResponse getById(@PathVariable int id) {
        return technologyService.getById(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateTechnologyRequest updateLanguageRequest) {
        this.technologyService.update(updateLanguageRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.technologyService.delete(id);
    }
}