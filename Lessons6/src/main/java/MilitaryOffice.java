public class MilitaryOffice {
    public static void main(String[] args) {
        //набиваем данные в объекты Address и Person
        Address konstantinsAddress = new Address("Belarus", "Vitebsk");
        Person konstantin = new Person("Konstantin", 20, "MALE", konstantinsAddress);

        Address glebsAddress = new Address("Belarus", "Vitebsk");
        Person gleb = new Person("Gleb", 26, "MALE", glebsAddress);

        Address artemAddress = new Address("Bel", "Orsha");
        Person artem = new Person("Artem", 25, "MALE", artemAddress);

        Address pavelAddress = new Address("Belarus", "Minsk");
        Person pavel = new Person("Pavel", 27, "MALE", pavelAddress);

        Address aleksandrAddress = new Address("Belarus", "Minsk");
        Person aleksandr = new Person("Александр", 17, "MALE", aleksandrAddress);

//
        //создали массив куда поместили наших призывников
        PersonRegistry registry = new PersonRegistry(new Person[]{gleb, konstantin, artem, pavel, aleksandr});
        //a) вывести имена всех людей годных к военной службе на текущий момент времени, которые есть в PersonRegistry
        //T.е нужно написать метод в классе MilitaryOffice, который будет отфильтровывать годных к службе призывников
        //(годными считать мущин от 18 до 27 лет, проверяем пол и возраст)
        registry.countPeopleCount();
        //б) вывести количество годных призывников в городе Минске.
        System.out.println("Колличество призывников проживающих в Минске: " + registry.countPeople("Minsk"));
        //в) вывести количество призывников от 25 до 27 лет
        System.out.println("Количество призывников в возрасте от 25 до 27 лет: " + registry.countPeopleAge());
        //г) вывести количество призывников у которых имя Александр.
        System.out.println("Колличество призывников с именем Александр: " + registry.countPeopleName("Александр"));
    }
}
