package com.es.controller;

import com.es.dataprovider.WorkDataProvider;
import com.es.po.Work;
import com.es.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work")
public class WorkController {

    @Autowired
    private WorkService workService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(){
        Work work = WorkDataProvider.newWork();
        boolean added = workService.addWork(work);
        if(added){
            return "success";
        }
        return "faliure";
    }
}
