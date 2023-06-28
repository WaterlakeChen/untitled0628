package cn.lzzy.example.profielconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Date 2023/6/27 19:45
 * @注释
 */
@Configuration
@Profile("dev")
public class DevConnector implements Connector{
    @Override
    public String config(){

        return "土狗";
    }
}
