package com.es.service;

import com.es.dao.WorkDao;
import com.es.po.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkService {

    @Autowired
    private WorkDao workDao;

    public boolean addWork(Work work) {
        Work r = workDao.index(work);
        if(r != null){
            return true;
        }
        return false;
    }
}
