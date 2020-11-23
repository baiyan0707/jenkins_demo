package xyz.byan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author bai
 * @Description
 * @Date 2020/11/23 1:44 PM
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JenkinsSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(JenkinsSpringBootApplication.class,args);
    }
}
