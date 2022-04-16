package springtest.spring.component;

import org.springframework.stereotype.Component;

@Component(value = "customerServiceImpl222") // 若指定了类名，则注入时，必须用该名
class CustomerServiceImpl2 implements CustomerService {
    @Override
    public void addCustomer() {
        System.out.println("CustomerServiceImpl2.addCustomer.自定义类名");
    }


}
