package lang.immutable.address;

public class MemberV2 {
    
    private String name;
    
    private Address address;
    
    public MemberV2(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
