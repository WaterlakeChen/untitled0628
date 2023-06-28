package cn.lzzy.example.profielconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Date 2023/6/27 19:45
 * @注释
 */
@Configuration
@Profile("test")
public class TestConnector implements Connector{
    @Override
    public String config(){

        return "这是一个测试环境";
    }

}
