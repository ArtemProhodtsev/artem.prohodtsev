package Task6.service;

import Task6.model.Book;
import Task6.model.Reader;

import java.util.List;
import java.util.Map;

public interface LibraryService {

    List<Book> getAllSortedBooksByYear();

    void addBook(Book book);

    List<Book> getAllBooks();

    void addReader(Reader reader);

    List<Reader> getAllReader();

    List<Book> findAllBooksByReader(Reader reader);

    List<Reader> findAllReadersAgree();

    Book findBookById(int id);

    Reader findReaderById(int id);

    void addBookToReader(int readerInt, int bookId);

    void receiveBookToLibrary(int bookId, int readerId);

    List<Book> getBooksOfReaders();

    Map<Boolean, List<Reader>> checkBookByAuthor();

}