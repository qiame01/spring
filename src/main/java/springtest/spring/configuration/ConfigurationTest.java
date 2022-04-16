package springtest.spring.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Configuration：与 @Component 功能相同，包含了后者。用于标识该类是 Spring 配置类，相当于原xml配置文件。spring启动构建容器时会加载该类
 * @Bean：源头见 特例@Bean。作用：加载方法上，用于构建一个对象返回
 * @Qualifier 加在方法入参上的情况测试，该注解通过指定具体名称的对象名，可以避免遇到多个同类对象导致无法注入的问题。源头见 测试 @Qualifier
 */
@SpringBootTest
public class ConfigurationTest {

    @Autowired
    private Customer customer55;
    @Autowired
    private Customer customer66;

    @Autowired
    private Job job;

    // 1-@Configuration。见：ConfigurationClass 顶部
    @Test
    public void sss() {

    }

    // 2-@Bean。注入同一个类的多个对象
    @Test
    public void ddd() {
        System.out.println(customer55.doSth()); // Customer.doSth
        System.out.println(customer66.doSth()); // Customer.doSth
    }

    // 3-@Qualifier 加在方法入参上的情况测试
    @Test
    public void ggg() {
        System.out.println(job.getCustomerName());
    }


}
