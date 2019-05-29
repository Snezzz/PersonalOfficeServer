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
    public List<Fees> getFeesByFilter(int course,int semester,String type){
        switch (type){
            case "all":
                return feesRepository.findByCourseAndSemester(course,semester);
            case "exams":
                return feesRepository.findByCourseAndSemesterAndType(course,semester,"exams");
            case "tests":
                return feesRepository.findByCourseAndSemesterAndType(course,semester,"tests");

        }
        return null;
    }
}
