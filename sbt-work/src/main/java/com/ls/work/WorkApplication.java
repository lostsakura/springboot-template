package com.ls.work;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScans({
        @MapperScan("com.ls.work.mapper")
})
@SpringBootApplication
public class WorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkApplication.class);
    }
}
