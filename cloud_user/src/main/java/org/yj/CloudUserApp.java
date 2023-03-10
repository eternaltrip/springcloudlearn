package org.yj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.yj.config.LoadBalancerConfig;

/**
 * Hello world!
 *
 */

@LoadBalancerClient(name="userservice",configuration = LoadBalancerConfig.class)
@SpringBootApplication
public class CloudUserApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(CloudUserApp.class,args);
    }
}
