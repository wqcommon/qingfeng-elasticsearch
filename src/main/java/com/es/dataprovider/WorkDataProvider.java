package com.es.dataprovider;

import com.es.po.Work;

import java.util.Random;

public class WorkDataProvider {


    public static Work newWork() {
        Random random = new Random();
        int bound = 1000000000;
        Work work = new Work();
        work.setId(String.valueOf(random.nextInt(bound)));
        work.setWorkName("workName" + random.nextInt(bound));
        work.setWorkDesc("workDesc" + random.nextInt(bound));
        return work;
    }
}
