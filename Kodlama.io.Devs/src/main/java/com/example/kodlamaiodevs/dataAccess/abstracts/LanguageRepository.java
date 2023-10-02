package com.example.kodlamaiodevs.dataAccess.abstracts;

import com.example.kodlamaiodevs.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Integer> {

}
