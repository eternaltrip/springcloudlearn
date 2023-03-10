package org.yj.config;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.reactive.ReactiveLoadBalancer;
import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


/**
 * 配置负载均衡模式
 */
@Configuration
public class LoadBalancerConfig {


    /**
     * spring-cloud2021开始，就不再使用ribbon来做负载均衡的组件
     * springcloud目前提供两种模式，一个是轮询，一个是随机。如果需要自定义，就需要自己实现
     * @param environment
     * @param loadBalancerClientFactory
     * @return
     */
    @Bean
    public ReactiveLoadBalancer<ServiceInstance> randomLoadBalancer(Environment environment , LoadBalancerClientFactory loadBalancerClientFactory){
        String serviceId = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
        return new RandomLoadBalancer(loadBalancerClientFactory.getLazyProvider(serviceId , ServiceInstanceListSupplier.class) ,serviceId);
    }

}
