package com.example.demo2.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@Data
public class User implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String school;

    /**
     * 
     */
    private String name;

    private static final long serialVersionUID = 1L;
}