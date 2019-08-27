package com.sweater.repositories;

import com.sweater.entities.Direction;
import com.sweater.entities.Fees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectionRepository extends JpaRepository<Direction,Integer> {
}
