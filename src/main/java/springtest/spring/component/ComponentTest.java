package springtest.spring.component;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 指导纲领：
 * 直接启动本类。启动时，对象装配和属性注入都会进行并完成，可以查看打印日志。
 * 属性注入都在 CustomerController 里
 * 虽然component目录下看起来很多类，实际大部分是为了测试 属性注入的
 * <p>
 * 对象装配：就是把对象放入spring容器里，然后再用@Component等属性注入的4个注解取出来，并调用该对象的方法。即装配-注入-调用方法
 * 0-：@Component，及其衍生的三个同类注解：@Controller @Service @Repository。它们功能完全一样，名字不同只是为了标识不同层而已
 * 1-当注解只有一个属性且名字叫 value 时，可以不写注解里的 value=。。如：@Service(value = "customServiceName" )
 * 2-不管有几个实现类，若装配时 不自定义 类名，则默认用类名首字母小写装配进容器
 * 3-多个实现类装配时自定义类名，详见：@Autowired注意点
 * <p>
 */
@SpringBootTest
public class ComponentTest {
    @Autowired
    private CustomerController controller;

    @Test
    public void ddd() {
        controller.addCustomer();
    }

}
