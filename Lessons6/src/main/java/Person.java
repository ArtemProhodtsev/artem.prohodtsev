import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    //4) Создать класс Person, который будет содержать следующие поля имя, возраст, пол, адрес(страна, город)
    //Создадим поля
    private String name;
    private int age;
    private String sex;
    private Address address;

    //сделаем констуктор для создания объекта персоны призывника

    public Person(String nameConscript, int ageConscript, String sexConscript, Address addressConscript) {
        this.name = nameConscript;
        this.age = ageConscript;
        this.sex = sexConscript;
        this.address = addressConscript;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address=" + address +
                '}';
    }
}