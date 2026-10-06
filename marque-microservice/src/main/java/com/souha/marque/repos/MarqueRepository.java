package com.souha.marque.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.souha.marque.entities.Marque;

public interface MarqueRepository extends JpaRepository<Marque,Long>{
}
