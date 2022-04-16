package springtest.spring.component;

import org.springframework.stereotype.Component;

@Component
class CustomerServiceImpl1 implements CustomerService {
    @Override
    public void addCustomer() {
        System.out.println("CustomerServiceImpl1.addCustomer");
    }

}
