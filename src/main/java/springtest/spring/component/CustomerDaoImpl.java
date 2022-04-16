package springtest.spring.component;

import org.springframework.stereotype.Component;

@Component("CustomerDaoImpl666")
class CustomerDaoImpl implements CustomerDao {
    @Override
    public void addCustomer() {
        System.out.println("CustomerDaoImpl.addCustomer");
    }


}
