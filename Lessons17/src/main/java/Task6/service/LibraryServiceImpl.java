package Task6.service;

import Task6.model.Book;
import Task6.model.Library;
import Task6.model.Reader;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class LibraryServiceImpl implements LibraryService {
    private final Library library;

    public LibraryServiceImpl(Library library) {
        this.library = library;
    }

    @Override
    public List<Book> getAllSortedBooksByYear() {
        return getAllBooks().stream()
                .sorted(Comparator.comparingInt(Book::getYearOfPublishing))
                .collect(toList());
    }

    @Override
    public void addBook(Book book) {
        getAllBooks().add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return library.getBookList();
    }

    @Override
    public void addReader(Reader reader) {
        getAllReader().add(reader);
    }

    @Override
    public List<Reader> getAllReader() {
        return library.getReaderList();
    }

    @Override
    public List<Book> findAllBooksByReader(Reader reader) {
        return reader.getBorrowedBooks();
    }

    @Override
    public List<Reader> findAllReadersAgree() {
        return getAllReader().stream()
                .filter(Reader::isReaderConsent)
                .collect(toList());
    }

    @Override
    public Book findBookById(int id) {
        return getAllBooks().stream()
                .filter(book -> book.getId() == id)
                .findAny().orElse(null);
    }

    @Override
    public Reader findReaderById(int id) {
        return getAllReader().stream()
                .filter(reader -> reader.getId() == id)
                .findAny().orElse(null);
    }

    @Override
    public void addBookToReader(int readerInt, int bookId) {
        try {
            Book book = findBookById(bookId);
            List<Book> readersBooks = getBooksFromReader(readerInt);
            readersBooks.add(book);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void receiveBookToLibrary(int bookId, int readerId) {
        try {
            Book book = findBookById(bookId);
            List<Book> readerBooks = getBooksFromReader(readerId);
            readerBooks.remove(book);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    private List<Book> getBooksFromReader(int readerId) {
        List<Book> readerBooks = null;
        try {
            Reader reader = findReaderById(readerId);
            readerBooks = findAllBooksByReader(reader);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
        return readerBooks;
    }

    public List<Book> getBooksOfReaders() {
        return getAllReader().stream()
                .flatMap(reader -> findAllBooksByReader(reader).stream())
                .distinct()
                .sorted(Comparator.comparing(Book::getId))
                .collect(toList());
    }

    public Map<Boolean, List<Reader>> checkBookByAuthor() {
        return getAllReader().stream()
                .collect(partitioningBy(reader -> findAllBooksByReader(reader).stream()
                        .anyMatch(book -> book.getAuthor().equals("Пушкин Александр Сергеевич")), toList())
                );
    }
}