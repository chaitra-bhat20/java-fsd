package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.citizens;

public interface citizensRepository extends JpaRepository<citizens, Long> {
//   Optional<List<citizens>> findByVaccinationCenterId(Long vaccinationCenterId);
	   Optional<citizens> findByVaccinationCenterId(Long vaccinationCenterId);
}
