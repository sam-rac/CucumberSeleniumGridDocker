package PractiseAutomation.CustomType;


import PractiseAutomation.Objects.Product;
import io.cucumber.java.ParameterType;

public class CustomParameterTypes {
    @ParameterType(".*")
    public Product product(String name){
        return new Product(name.replace("\"",""));
    }
}
