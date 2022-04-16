package springtest.spring.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("某作用域")：如果不指定，即不加@Scope，则实际就是启用默认的作用域，实际就是单例。有两种方式：
// 方式1：手写字符串
@Scope("prototype")
//@Scope("singleton")
// 方式2：常量。注意：
// 使用注解指定作用域时，对于所有 Spring 应用，工具类是 ConfigurableBeanFactory;
// 使用注解指定作用域时，对于Springmvc web应用，工具类不是 ConfigurableBeanFactory，而是 WebApplicationContext
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(WebApplicationContext) // web应用才有
public class ScopeBean {

}
