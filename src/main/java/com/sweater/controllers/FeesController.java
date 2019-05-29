package com.sweater.controllers;

import com.sweater.entities.Fees;
import com.sweater.services.FeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeesController {
    private FeesService feesService;

    @Autowired
    public FeesController(FeesService feesService) {
        this.feesService = feesService;
    }


    @CrossOrigin(origins = "http://localhost:")
    @PostMapping("/fees")
    public void addFee(@RequestBody Fees fee) {
        feesService.addFee(fee);
    }

    //все оценки
    @CrossOrigin(origins = "http://localhost:")
    @GetMapping("/fees")
    public List<Fees> getAllFees() {
        return feesService.getFeesList();
    }

    //semester
    @CrossOrigin(origins = "http://localhost:")
    @GetMapping("/fees/sem/{semester}")
    public List<Fees> getFilterSemesterFees(@PathVariable("semester")int semester) {
        return feesService.getFeesBySemester(semester);
    }

    //filter
    @CrossOrigin(origins = "http://localhost:")
    @GetMapping("/fees/filter")
    @ResponseBody
    public List<Fees> getFilterCourseFees(@RequestParam(name = "course",required = false,defaultValue = "1")int course,
                                          @RequestParam(name = "semester", required = false,defaultValue = "1")int semester,
                                          @RequestParam(name = "type", required = false,defaultValue = "all")String type) {

        return feesService.getFeesByFilter(course,semester,type);
    }


    //зачет/экзамен
    @CrossOrigin(origins = "http://localhost:")
    @GetMapping("/fees/type/{type}")
    public List<Fees> getFilterTypeFees(@PathVariable("type")String type) {
        return feesService.getFeesByType(type);

    }
}
