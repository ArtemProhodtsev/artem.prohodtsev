package Task6.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Reader {
    private int id;
    private String fullName;
    private Email email;
    private boolean readerConsent;
    private List<Book> borrowedBooks;

    public Reader(int id, String fullName, Email email, boolean readerConsent) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.readerConsent = readerConsent;
        borrowedBooks = new ArrayList<>();
    }
}