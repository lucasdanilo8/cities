package com.dio.lucasdanilo8.cities.Countries.Resource;

import com.dio.lucasdanilo8.cities.Countries.entities.Country;
import com.dio.lucasdanilo8.cities.Countries.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {
    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public Country getOne(@PathVariable Long id) {
    Optional<Country> optional = repository.findById(id);
    return optional.get();
    }

}
