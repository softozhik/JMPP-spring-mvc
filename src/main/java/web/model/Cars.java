package web.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Cars {
    private String brand;
    private String model;
    private String govNumber;

//    @Autowired
    public Cars(String brand, String model, String govNumber) {
        this.brand = brand;
        this.model = model;
        this.govNumber = govNumber;
    }

    @Autowired
    public Cars() {}

    @Bean(name = "brand")
    public String getBrand() {
        return brand;
    }

    @Bean(name = "model")
    public String getModel() {
        return model;
    }

    @Bean(name = "govNumber")
    public String getGovNumber() {
        return govNumber;
    }

    @Override
    public String toString() {
        return  "Производитель: '" + brand + '\'' +
                ", Модель: '" + model + '\'' +
                ", Номер: '" + govNumber + '\'';
    }

}
