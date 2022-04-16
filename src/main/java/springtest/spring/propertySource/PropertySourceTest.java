package springtest.spring.propertySource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试：@PropertySource
 * 要点均在 AaaConfig 顶部
 * 作用：可以导入根路径下(前缀 classpath:)一个或多个以.properties结尾的配置文件
 */
@SpringBootTest
public class PropertySourceTest {

    @Autowired
    private AaaConfig aaaConfig;

    @Test
    public void ddd() {
        System.out.println(aaaConfig.getAaa() + "----来自.aaa.properties");
        System.out.println(aaaConfig.getDriverClass() + "--------来自.bbb.properties");
    }

}
