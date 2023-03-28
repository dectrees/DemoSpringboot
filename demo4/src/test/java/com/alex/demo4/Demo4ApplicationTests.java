package com.alex.demo4;

import com.alex.demo4.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootTest
@Slf4j
class Demo4ApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void createPerson(){
        Person p = new Person();
        p.setId("2");
        p.setAge(28);
        p.setEmail("adsd@asdf.com");
        p.setName("alex");
        Person pt = mongoTemplate.insert(p);
        log.info(pt.toString());
    }

    @Test
    public void findAll(){
        List<Person> list = mongoTemplate.findAll(Person.class);
        list.forEach(p->log.info("name: "+p.getName()));
    }
}
