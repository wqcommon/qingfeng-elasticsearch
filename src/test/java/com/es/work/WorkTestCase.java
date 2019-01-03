package com.es.work;


import com.alibaba.fastjson.JSONObject;
import com.es.ElasticApplication;
import com.es.dao.WorkDao;
import com.es.po.Work;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ElasticApplication.class)
public class WorkTestCase {

    @Autowired
    private WorkDao workDao;

    @Test
    public void testFindOfWorkName(){
//        PageRequest pageRequest = PageRequest.of(0,10);
        QPageRequest pageRequest = new QPageRequest(0,10);
        Page<Work> pageWorks = workDao.findOfWorkName("workName604035726",pageRequest);
        System.out.println(JSONObject.toJSONString(pageWorks));
        assert pageWorks.getTotalElements() == 1;

    }
}
