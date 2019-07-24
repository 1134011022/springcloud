package com.ops.server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2019/7/17
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name",defaultValue = "forezp")String name){
        return "hi "+name + " ,i am from port :"+port;
    }


}
