package com.example.kodlamaiodevs.webApi;

import com.example.kodlamaiodevs.business.responses.GetAllLanguageResponse;
import com.example.kodlamaiodevs.business.responses.GetByIdLanguageResponse;
import jakarta.validation.Valid;
import com.example.kodlamaiodevs.business.abstracts.LanguageService;
import com.example.kodlamaiodevs.business.requests.CreateLanguageRequest;
import com.example.kodlamaiodevs.business.requests.UpdateLanguageRequest;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor
public class LanguageController {

    private LanguageService languageService;


    @GetMapping("/getall")
    public List<GetAllLanguageResponse> getAll() {
        return languageService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateLanguageRequest createLanguageRequest) {
        this.languageService.add(createLanguageRequest);
    }

    @GetMapping("/{id}")
    public GetByIdLanguageResponse getById(@PathVariable int id) {
        return languageService.getById(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateLanguageRequest updateLanguageRequest) {
        this.languageService.update(updateLanguageRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.languageService.delete(id);
    }
}