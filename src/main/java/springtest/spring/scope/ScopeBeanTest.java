package springtest.spring.scope;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 作用域的背景知识，自行百度
 *
 * @Scope 要搭配 @Component 使用
 * 详细说明，见类 ScopeBean 上方注释
 */
@SpringBootTest
public class ScopeBeanTest {

    @Autowired
    private ScopeBean scopeBean;
    @Autowired
    private ScopeBean scopeBean2;

    /**
     * 什么也不配，默认是单例，效果同配置了 @Scope("singleton")
     * 对象只创建一次，每次注入的都是同一个对象，它们的地址值相同
     */
    @Test
    public void ttt() {
        System.out.println(scopeBean);  // springtest.spring.scope.ScopeBean@6ea94d6a
        System.out.println(scopeBean2); // springtest.spring.scope.ScopeBean@6ea94d6a
    }

    /**
     * 多例：每次注入，都会创建一个新对象，地址值不同
     *
     * @Scope("prototype")
     */
    @Test
    public void ddd() {
        System.out.println(scopeBean);  // springtest.spring.scope.ScopeBean@51745f40
        System.out.println(scopeBean2); // springtest.spring.scope.ScopeBean@45673f68

    }

}