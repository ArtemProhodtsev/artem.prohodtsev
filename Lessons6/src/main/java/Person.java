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

    // да, тут можно использовать lombok, но мне пока так понятней когда рассписано
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(Address address) {
        this.address = address;
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