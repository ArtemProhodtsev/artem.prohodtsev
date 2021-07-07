//это регистратура в которой мы будем работать с нашими призывниками

public class PersonRegistry {
    private Person[] conscript;// призывники

    public PersonRegistry(Person[] conscript) {
        //тут пока не сильно понятно что сделали
        this.conscript = conscript;
    }

    //данный метод будет делать фильтровать людей и выводить колличество проживающих в одной городе
    public int countPeople(String city) {//проживающий в стране
        int count = 0;
        for (Person person : conscript) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }
}