//это регистратура в которой мы будем работать с нашими призывниками
public class PersonRegistry {

    private Person[] conscript;// призывники

    public PersonRegistry(Person[] conscript) {
        //тут пока не сильно понятно что сделали
        this.conscript = conscript;
    }

    //данный метод будет фильтровать людей и выводить количество проживающих в одном городе
    public int countPeople(String city) {
        int count = 0;
        for (Person person : conscript) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }

    //данный метод будет возвращать нам количество людей с определённым именем
    public int countPeopleName(String name) {
        int count = 0;
        for (Person person : conscript) {
            String personsName = person.getName();
            if (personsName.equals(name)) {
                count++;
            }
        }
        return count;
    }

    // данный метод будет возвращать количество человек в возрасте от 25 и до 27 лет
    public int countPeopleAge() {
        int count = 0;
        for (Person person : conscript) {
            int personAge = person.getAge();
            if (personAge >= 25 && personAge <= 27) {
                count++;
            }
        }
        return count;
    }

    //данный метод возвращает имена призывников подпадающих под призыв по возрасту и полу
    public int countPeopleCount() {
        int count = 0;
        for (Person person : conscript) {
            int personAge = person.getAge();
            String personSex = person.getSex();
            if (personAge >= 18 && personAge <= 27 && personSex.equals("MALE")) {
                count++;
            }
        }
        return count;
    }
}
