package com.example.kodlamaiodevs.dataAccess.abstracts;


import com.example.kodlamaiodevs.entities.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {
}
