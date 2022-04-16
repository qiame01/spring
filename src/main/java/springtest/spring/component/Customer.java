package springtest.spring.component;

class Customer {
    private long custId;
    private String name;
    private String address;
    private String phone;

    public Customer() {
    }

    //TODO 加上带参构造是为了测试注解情况下的实例化方式是否需要无参构造
    public Customer(long custId, String name, String address, String phone) {
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String doSth(){
        return "Customer.doSth";
    }
}
