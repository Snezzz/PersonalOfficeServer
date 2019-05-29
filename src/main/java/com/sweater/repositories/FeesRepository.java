package com.sweater.repositories;

import com.sweater.entities.Fees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeesRepository extends JpaRepository<Fees,Integer> {
    List<Fees> findBySemester(int sem);
    List<Fees> findByCourse(int course);
    List<Fees> findByType(String type);
    List<Fees> findByCourseAndSemester(int course, int semester);
    List<Fees> findByCourseAndSemesterAndType(int course, int semester,String type);

}
