public class MilitaryOffice {
    public static void main(String[] args) {
        //набиваем данные в объекты Address и Person
        Address konstantinsAddress = new Address("Belarus", "Vitebsk");
        Person konstantin = new Person("Konstantin", 20, "FEMALE", konstantinsAddress);

        Address glebsAddress = new Address("Belarus", "Vitebsk");
        Person gleb = new Person("Gleb", 26, "FEMALE", glebsAddress);

        Address artemAddress = new Address("Bel", "Orsha");
        Person artem = new Person("Artem", 18, "FEMALE", artemAddress);

        Address pavelAddress = new Address("Belarus", "Minsk");
        Person pavel = new Person("Pavel", 27, "FEMALE", pavelAddress);


        //создали массив куда поместили наших призывников
        PersonRegistry registry = new PersonRegistry(new Person[]{gleb, konstantin, artem, pavel});

        //б) вывести количество годных призывников в городе Минске.
        System.out.println(registry.countPeople("Minsk"));
    }

}
