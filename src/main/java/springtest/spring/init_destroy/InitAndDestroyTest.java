package springtest.spring.init_destroy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InitAndDestroyTest {

    @Test
    public void lll(){
        System.out.println("启动spring容器时，会自动执行注解的初始化方法");
    }


}
