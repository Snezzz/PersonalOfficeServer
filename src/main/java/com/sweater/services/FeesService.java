package com.sweater.services;

import com.sweater.entities.Fees;
import com.sweater.repositories.FeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeesService {
    FeesRepository feesRepository;

    @Autowired
    public FeesService(FeesRepository feesRepository) {
        this.feesRepository = feesRepository;
    }

    public void addFee(Fees fee){
        feesRepository.save(fee);
    }
    public void deleteFee(Fees fee){
        feesRepository.delete(fee);
    }
    public void deleteFeeById(int id){
        feesRepository.deleteById(id);
    }
    public List<Fees> getFeesList(){
        return feesRepository.findAll();
    }
    public Fees getFeeById(int id){
        return feesRepository.findById(id).get();
    }
    //по семестру
    public List<Fees> getFeesBySemester(int sem){
        return feesRepository.findBySemester(sem);
    }
    //по курсу
    public List<Fees> getFeesByCourse(int course){
        return feesRepository.findByCourse(course);
    }
    //по типу
    public List<Fees> getFeesByType(String type){
        return feesRepository.findByType(type);
    }
    public List<Fees> getFeesByFilter(int student_id,int course,int semester,String type){
        if(course==-1){
            if(semester==-1){
                //0 0 0
                //0 0 1
                    switch (type){
                        case "all":
                            return feesRepository.findByStudentId(student_id);
                        case "экзамен":
                            return feesRepository.findByStudentIdAndType(student_id,"экзамен");
                        case "зачет":
                            return feesRepository.findByStudentIdAndType(student_id,"зачет");

                    }
            }
            //0 1
            else{
                //0 1 0
                //0 1 1
                    switch (type){
                        case "all":
                            return feesRepository.findByStudentIdAndSemester(student_id,semester);
                        case "экзамен":
                            return feesRepository.findByStudentIdAndSemesterAndType(student_id,semester,"экзамен");
                        case "зачет":
                            return feesRepository.findByStudentIdAndSemesterAndType(student_id,semester,"зачет");

                }
            }
        }
        else {
            if (semester == -1) {
                //1 0 0
                //1 0 1
                    switch (type){
                        case "all":
                            return feesRepository.findByStudentIdAndCourse(student_id,course);
                        case "экзамен":
                            return feesRepository.findByStudentIdAndCourseAndType(student_id,
                                    course,"экзамен");
                        case "зачет":
                            return feesRepository.findByStudentIdAndCourseAndType(student_id,
                                    course,"зачет");

                    }
            }
            else{
                //1 1 0
                //1 1 1
                    switch (type){
                        case "all":
                            return feesRepository.findByStudentIdAndCourseAndSemester(student_id,course,semester);
                        case "экзамен":
                            return feesRepository.findByStudentIdAndCourseAndSemesterAndType(student_id,course,
                                    semester,"экзамен");
                        case "зачет":
                            return feesRepository.findByStudentIdAndCourseAndSemesterAndType(student_id,course,
                                    semester, "зачет");

                    }

            }
        }

        return null;
    }
}
