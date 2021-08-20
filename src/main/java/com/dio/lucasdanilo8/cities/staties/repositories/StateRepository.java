package com.dio.lucasdanilo8.cities.staties.repositories;

import com.dio.lucasdanilo8.cities.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
