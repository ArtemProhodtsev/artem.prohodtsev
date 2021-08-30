//6) Пишем библиотеку.
//        * Для каждой книги библиотечного фонда известны автор, название и год издания.
//        * Для читателя библиотеки будем хранить ФИО и электронный адрес. Каждый читатель может взять в библиотеке одну или несколько книг.
//        * Ещё нам понадобится флаг читательского согласия на уведомления по электронной почте.
//        * Рассылки организуют сотрудники библиотеки: напоминают о сроке возврата книг, сообщают новости.
//        * Создаем классы:
//        *  - Book с полями Автор, Название, Год издания
//        *  - Reader(читатель) с полями ФИО, электронный адрес, флаг согласия на рассылку, список взятых книг
//        *  - EmailAddress  с полями электронный адрес, дополнительная информация
//        *  - Library содержит список книг и список читателей.
//        *
//        *  Задачи:
//        *  a) Получить список всех книг библиотеки, отсортированных по году издания.
//        *  b) Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
//        *      При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
//        *  c) Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку.
//        *      Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
//        *  d) Получить список всех книг, взятых читателями.
//        *      Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
//        *  e) Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Пушкина Александра Сергеевича.
//        *
//        *  Задачи со ЗВЕЗДОЧКОЙ:
//        *  а) Узнать наибольшее число книг, которое сейчас на руках у читателя.
//        *  b) Необходимо рассылать разные тексты двум группам:
//        *      * тем, у кого взято меньше двух книг, просто расскажем о новинках библиотеки;
//        *      * тем, у кого две книги и больше, напомним о том, что их нужно вернуть в срок.
//        *      То есть надо написать метод, который вернёт два списка адресов (типа EmailAddress): с пометкой OK — если книг не больше двух,
//        *      или TOO_MUCH — если их две и больше. Порядок групп не важен.
//        *  с) Для каждой группы (OK, TOO_MUCH) получить списки читателей в каждой группе.
//        *  d) Для каждой группы (OK, TOO_MUCH) получить ФИО читателей в каждой группе, перечисленные через запятую.
//        *      И ещё каждый такой список ФИО нужно обернуть фигурными скобками.
//        *      Пример: TOO_MUCH {Иванов Иван Иванович, Васильев Василий Васильевич}
//        *              OK {Семёнов Семён Семёнович}

package Task6;

import Task6.model.Book;
import Task6.model.Email;
import Task6.model.Library;
import Task6.model.Reader;
import Task6.service.LibraryService;
import Task6.service.LibraryServiceImpl;
import Task6.service.MessageService;
import Task6.service.MessageServiceImpl;

import java.util.List;
import java.util.Map;

public class T6 {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryService libraryService = new LibraryServiceImpl(library);
        MessageService messageService = new MessageServiceImpl();

        List<Book> booksList = List.of(
                new Book(1, "Пушкин Александр Сергеевич", "Дубровский", 1842),
                new Book(2, "Куприн Александр Иванович", "Над землёй", 1909),
                new Book(3, "Чехов Антон Павлович", "Студент", 1894),
                new Book(4, "Есенин Сергей Александрович", "Поэтам Грузии", 1924),
                new Book(5, "Фамилия Имя Отчество", "Название произведения", 1234)
        );

        List<Reader> readers = List.of(
                new Reader(1, "Иванов Иван Иванович", new Email("ivan@pisem.net"), true),
                new Reader(2, "Петров Пётр Петрович", new Email("petr@pisem.net"), false),
                new Reader(3, "Фамилия Имя отчество", new Email("name@pisem.net"), true),
                new Reader(4, "Тест0 Тест1 Тест2", new Email("test1@pisem.net"), false)
        );

        Map<Integer, List<Integer>> readerBookList = Map.of(
                1, List.of(1),
                2, List.of(2, 3, 4),
                3, List.of(4, 2, 5),
                4, List.of(5)
        );

        booksList.forEach(libraryService::addBook);
        readers.forEach(libraryService::addReader);

        var key = readerBookList.keySet();
        key.forEach(k -> readerBookList.get(k)
                .forEach(value -> libraryService.addBookToReader(k, value)));

        libraryService.getAllSortedBooksByYear().forEach(System.out::println);

        messageService.sendMessage("Текст 1", readers)
                .forEach(System.out::println);

        messageService.sendMessage("Текст 2", libraryService.findAllReadersAgree())
                .forEach(System.out::println);

        messageService.sendMessageByAgreeReaders("Текст 3", readers)
                .forEach(System.out::println);

        libraryService.getBooksOfReaders().forEach(System.out::println);

        Map<Boolean, List<Reader>> checkBook = libraryService.checkBookByAuthor();
        for (Map.Entry<Boolean, List<Reader>> entry : checkBook.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}