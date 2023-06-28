package cn.lzzy.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动类
 */
@SpringBootApplication
@ImportResource("classpath:xmlproperties.xml")
public class ChapterApplication {
    public static void main(String[] args) {

        SpringApplication.run(ChapterApplication.class, args);
//        System.out.println("第一个 Spring Boot 项目");
    }
}