package springtest.spring.import_;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Import({CccConfig.class})
//@Import({CccConfig.class,CccConfig.class})
@Component // 或者用 @Configuration 都一样
public class ConfigurationA {
}
