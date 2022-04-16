package springtest.spring.init_destroy;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class InitAndDestroy {
    //用注解自定义初始化和销毁方法
    //加载配置文件时，会创建工厂对象，并且调用初始化方法
    @PostConstruct
    public void fff() {
        System.out.println("@PostConstruct.注解方式自定义初始化方法");
    }

    //关闭容器时执行销毁方法
    @PreDestroy
    public void ggg() {
        System.out.println("@PreDestroy.注解方式自定义销毁方法");
    }


}
