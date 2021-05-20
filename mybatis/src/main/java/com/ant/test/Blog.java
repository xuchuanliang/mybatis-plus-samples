package com.ant.test;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Blog {
    private Long id;
    private String name;
    private Long time;

}
