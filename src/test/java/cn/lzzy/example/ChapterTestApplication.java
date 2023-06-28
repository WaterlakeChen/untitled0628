package cn.lzzy.example;


import cn.lzzy.example.org.ChapterController;
import cn.lzzy.example.profielconfig.DevConnector;
import cn.lzzy.example.student.Person;
import cn.lzzy.example.student.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterTestApplication {
    String TAG = "ChapterTestApplication";

    @Autowired //注入ChapterController类
    private ChapterController chapterController;

//    @Autowired //注入Student类
////    private Student student;
//    private Person person;

    @Value("${student.id}")
    int id;
    @Autowired
    Person person;
    @Autowired
    User user;

    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    DevConnector devConnector;

    @Test
    public void contextLoads() {
//        System.out.println(TAG + "--- 单元测试返回的数据 ---" + chapterController.sayHello());
//        System.out.println(TAG + "--- 单元测试返回的数据 ---" + student);
//        System.out.println(user);
//        System.out.println(person);
//         MyProperties myProperties = (MyProperties) applicationContext.getBean("myProperties");
//         if (myProperties==null){
//             System.out.println("失败了，土狗");
//         }else {
//             myProperties.getResult();
//         }

        System.out.println(devConnector.config());


    }
}
