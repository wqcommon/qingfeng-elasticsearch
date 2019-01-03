package com.es.dao;

import com.es.po.Work;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkDao extends ElasticsearchRepository<Work,String>{


        @Query("{\"bool\":{\"must\":{\"match\":{\"workName\":\"?0\"}}}}")
        Page<Work> findOfWorkName(String name, Pageable pageable);

}
