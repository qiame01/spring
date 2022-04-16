package springtest.spring.propertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

// 以下都可以，可以不带 value和classpath
// 导入一个
//@PropertySource("aaa.properties")
//@PropertySource("classpath:aaa.properties")
//@PropertySource(value = "aaa.properties")
//@PropertySource(value = "classpath:aaa.properties")

// 导入多个
//@PropertySource({"aaa.properties","bbb.properties"})
//@PropertySource({"classpath:aaa.properties","classpath:bbb.properties"})
@PropertySource(value = {"aaa.properties", "bbb.properties"})
//@PropertySource(value = {"classpath:aaa.properties","classpath:bbb.properties"})
public class AaaConfig {

    // 以下来自 aaa.properties
    @Value("${aaa.aaa}")
    private String aaa;

    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    // 以下来自 bbb.properties
    @Value("${jdbc.driverClass:wwwsss}")
    private String driverClass;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String user;

    @Value("${jdbc.password}")
    private String password;

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
