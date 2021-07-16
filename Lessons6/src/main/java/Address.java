import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String country;
    private String city;

    //сделаем констуктор для создания объекта адреса призывника
    public Address(String countryConscript, String cityConscript) {
        this.country = countryConscript;
        this.city = cityConscript;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
