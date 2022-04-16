package springtest.spring.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {

    // getCustomer1 和 getCustomer2 作用：测试多个 @Bean 情况下的自定义类名
    @Bean(name = "customer55")
    public Customer getCustomer1() {
        return new Customer();
    }

    @Bean(name = "customer66")
    public Customer getCustomer2() {
        return new Customer();
    }

    // @Qualifier 加在方法入参上
    @Bean(name = "job77")
    public Job getJobClass(@Qualifier("customer55") Customer customer) {
        Job job = new Job();
        customer.setName("manager");
        job.setCustomerName(customer.getName());
        return job;
    }


}
