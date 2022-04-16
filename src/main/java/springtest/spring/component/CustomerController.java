package springtest.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
/**
 * 本 CustomerController 作用有两个：
 * 1-为测试 @Component 等的装配提供 一个负载用的 Controller
 * 2-测试 @Value 等的注入(源头见：这三个字，是用于标识处这些属性注入的注解的目录所在)
 * <p>
 * 以下全是测试 属性注入
 */
@Component
public class CustomerController {

    // 以下全是测试 属性注入
    public void addCustomer() {
        // @Value 测试
        System.out.println("@Value 测了试：" + name);

        // @Autowired 测试
        customerServiceImpl1.addCustomer();
        customerServiceImpl222.addCustomer();

        // @Qualifier 测试：见下面 customerServiceImpl333

        // @Resource 测试：见下面 ccddee
        customerDaoImpl44.addCustomer();
        CustomerDaoImpl2.addCustomer();
    }


    // 源头见：测试 @Value (全局搜索 关键字：测试 @Value)
    @Value("${aaa.bbb:ccc}") // 从 application.properties 文件里获取属性，ccc是缺省值（点击ddd，才会复现缺省值）
    // @Value("小鱼锅贴")
    private String name;

    public String getName() {
        return name;
    }

    // 源头见：测试 @Autowired
    @Autowired
    private CustomerService customerServiceImpl1;
    @Autowired
    private CustomerService customerServiceImpl222;

    // 源头见：测试 @Qualifier
    // 若要测试，可暂时将下面 customerServiceImpl222 改为 customerServiceImpl333
    @Autowired
    @Qualifier("customerServiceImpl222")
    private CustomerService customerServiceImpl333;

    // 源头见：测试 @Resource
    //  // 若有多个实现类，常用name进行注入。 (ccddee勿删，标识位置用)
    @Resource(name = "customerDaoImpl33")
    private CustomerDao customerDaoImpl44;
    @Resource(name = "CustomerDaoImpl666")
    // @Resource(type=CustomerDao.class) // type这个暂时不测，用得少
    private CustomerDao CustomerDaoImpl2;

}
