package PractiseAutomation.Objects;

public class Customer {
    private String name;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String address;
    private String state;
    private String city;
    private String zipcode;
    private String mobileNumber;

    public Customer(String name,String firstname, String lastname,
                    String email, String password, String address,
                    String state, String city, String zipcode, String mobileNumber) {
        this.name=name;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zipcode = zipcode;
        this.mobileNumber = mobileNumber;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getAddress() {
        return address;
    }
    public String getState() {
        return state;
    }
    public String getCity() {
        return city;
    }
    public String getZipcode() {
        return zipcode;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


}
