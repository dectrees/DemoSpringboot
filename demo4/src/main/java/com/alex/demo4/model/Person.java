package com.alex.demo4.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/26/2023, Sunday
 **/
@Data
@Document("Person")
public class Person {
    private String id;
    private String name;
    private Integer age;
    private String email;
    private String createDate;
}
