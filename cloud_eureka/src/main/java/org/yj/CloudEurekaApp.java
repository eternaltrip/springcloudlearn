package org.yj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(CloudEurekaApp.class,args);
    }
}
