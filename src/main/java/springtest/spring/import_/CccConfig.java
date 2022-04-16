package springtest.spring.import_;

import org.springframework.beans.factory.annotation.Value;

public class CccConfig {

    @Value("${ddddd:fffff}")
    private String aaa;

    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

}
