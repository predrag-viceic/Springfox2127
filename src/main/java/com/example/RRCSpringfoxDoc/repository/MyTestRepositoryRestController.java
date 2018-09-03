package com.example.RRCSpringfoxDoc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.RRCSpringfoxDoc.entity.MyTestBean;


//https://docs.spring.io/spring-data/rest/docs/current/reference/html/#customizing-sdr.overriding-sdr-response-handlers
@RepositoryRestController
public class MyTestRepositoryRestController{

    private final MyTestRepository repository;

    @Autowired
    public MyTestRepositoryRestController(MyTestRepository repo) { 
        repository = repo;
    }
	
	
    @RequestMapping(method = RequestMethod.GET, value = "/myTestBeans/count_entities")
	public @ResponseBody Long count() {
		return repository.count();
	}
}
