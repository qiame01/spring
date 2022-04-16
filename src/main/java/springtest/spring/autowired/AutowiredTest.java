package springtest.spring.autowired;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 属性注入：
 * 普通属性：@Value 对象属性：@Autowired @Qualifier @Resource
 */
@SpringBootTest
public class AutowiredTest {

    /**
     * 测试 @Value
     * 特点：1-注入普通属性、2-el表达式("${key:defaultValue}")可以读取配置文件中key对应的值，冒号后面是缺省值
     * 详见 CustomerController-小鱼锅贴
     */
    @Test
    public void aaa() {
    }

    /**
     * 测试 @Autowired
     * 特点：按照类型注入
     * 详见：ComponentTest 上方注释及其代码实践：CustomerController
     *
     * @Autowired注意点
     * <p>
     * 使用 @Autowired 测试对象的注入时，注意：
     * 当只有一个实现类时，无论装配时自定义类名或者不自定义类名，在 @Autowired 注入时，都只有一种情况：
     * 1若用接口或实现类接收，则注入的实现类对象名称可以任意取
     * <p>
     * 当有两个及以上实现类时，若装配时 都不自定义 各自的类名，则 @Autowired 注入时，分两种情况：
     * 1若都用接口接收，则每个注入的实现类对象名称也必须使用类名首字母小写
     * 2若某个或全部都使用各自的实现类名接收，则每个注入的实现类对象名称可以任意
     * <p>
     * 当有两个及以上实现类时，若装配时 部分或全部实现类 自定义 各自的类名，则 @Autowired 注入时，分两种情况：
     * 1若都用接口接收，则先前装配时 没有 自定义实现类对象名称的类，必须使用类名首字母小写；而自定义类名的类，必须使用定义名
     * 2若某个或全部都使用各自的实现类名接收，则每个注入的实现类对象名称可以任意
     * 3特例@Bean：详见：ConfigurationTest
     * 若用 @Bean 装配同一个类的单个对象时，若自定义了类名，则在 @Autowired 注入时，必须使用该名；
     * 若用 @Bean 装配同一个类的单个对象时，若不自定义类名，则 @Autowired 注入时，对象名任意
     * 若用 @Bean 装配同一个类的多个对象时，必须每个类都自定义类名，并在 @Autowired 注入时，使用该名
     */
    @Test
    public void bbb() {
    }

    /**
     * 测试 @Qualifier
     * 特点：
     * 1-若加在类上时，必须与 @Autowired 搭配使用
     * 2-@Qualifier 后的名称必须与装配时的自定义类名一致，但在下面类名 customerServiceImpl333 可以重命名
     * 详见 CustomerController-customerServiceImpl333
     * 3-若加在方法入参前，则单独使用。详见：getJobClass：@Qualifier 加在方法入参上
     */
    @Test
    public void ddd() {
    }

    /**
     * 测试 @Resource
     * 特点：常用的用两个属性：name和type。接口或实现类都可以接收，但注意：
     * 0-若有多个实现类，一般使用name将该类对象注入到其他类中，name要与实现类上自定义类名一致(记住这个就够了)
     *
     * 1-若两个属性都不配，则默认先找name，找到则注入，无则再找type(type这个待定)
     * 2-若只配其中一个，则只会按照该属性进行查找，找不到或找到多个，则报错。单独使用type时，用接口/实现类接收，要保持 type=接口名/实现类名
     * 3-若都配，则两个都要匹配，不然报错
     *
     * @Resource 后的名称必须与装配时的自定义类名一致，但在下面类名 customerDaoImpl44 可以重命名
     *
     * 详见 CustomerController-@Resource 测试
     */
    @Test
    public void eee() {
    }

}
