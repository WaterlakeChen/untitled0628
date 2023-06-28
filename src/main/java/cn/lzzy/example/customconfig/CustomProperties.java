package cn.lzzy.example.customconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Configuration
@PropertySource("classpath:custom.properties")
@EnableConfigurationProperties(CustomProperties.class)
@ConfigurationProperties(prefix = "")
public class CustomProperties {
    private int id;
    private String name;
    private int age;
    private String[] hobby;
    private List electProduct;
    private Map friends;

    @Override
    public String toString() {
        return "CustomProperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                ", electProduct=" + electProduct +
                ", friends=" + friends +
                '}';
    }
}
