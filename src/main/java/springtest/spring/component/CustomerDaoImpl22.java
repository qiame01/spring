package springtest.spring.component;

import org.springframework.stereotype.Component;

@Component("customerDaoImpl33") // 搜索：customerDaoImpl33
class CustomerDaoImpl22 implements CustomerDao {
    @Override
    public void addCustomer() {
        System.out.println("CustomerDaoImpl22.addCustomer");
    }


}
