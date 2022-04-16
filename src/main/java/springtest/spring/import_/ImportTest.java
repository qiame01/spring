package springtest.spring.import_;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * @Import ：在配置类A中引入配置类B、C。B、C加不加 @Component/@Configuration 都行，但是A必须加。
 * 作用：好处就是，被引入的类，可以在不加 @Component/@Configuration 注解的情况下，就被加载到spring容器中
 * 所谓配置类，就是带 @Component 或者 @Configuration 的类。其实 Configuration 包含了 Component
 */
@SpringBootTest
public class ImportTest {

    @Autowired
    private CccConfig cccConfig;

    // @Import
    // 作用；被引入的类，在不用加注解的情况下，就可以被加载到spring容器里，从而被 @Autowired注入和使用
    @Test
    public void www() {
        System.out.println(cccConfig.getAaa() + "----999999999");
    }
}
