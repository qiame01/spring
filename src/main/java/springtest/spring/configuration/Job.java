package springtest.spring.configuration;

public class Job {
    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getName(Customer customer){
        return customer.getName();
    }

}
