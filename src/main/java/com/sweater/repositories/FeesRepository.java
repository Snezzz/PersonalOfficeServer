package com.sweater.repositories;

import com.sweater.entities.Fees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeesRepository extends JpaRepository<Fees,Integer> {
    List<Fees> findBySemester(int sem);
    List<Fees> findByCourse(int course);
    List<Fees> findByType(String type);
    List<Fees> findByStudentId(int student_id);
    List<Fees> findByStudentIdAndCourse(int student_id,int course);
    List<Fees> findByStudentIdAndSemester(int student_id, int semester);
    List<Fees> findByStudentIdAndType(int student_id,String type);
    List<Fees> findByStudentIdAndCourseAndType(int student_id,int course, String type);
    List<Fees> findByStudentIdAndSemesterAndType(int student_id,int semester, String type);
    List<Fees> findByStudentIdAndCourseAndSemester(int student_id,int course, int semester);
    List<Fees> findByStudentIdAndCourseAndSemesterAndType(int student_id,int course,int semester,String type);

}
