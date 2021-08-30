package Task6.service;

import Task6.model.Email;
import Task6.model.Reader;

import java.util.List;
import java.util.stream.Collectors;


public class MessageServiceImpl implements MessageService {
    @Override
    public List<Email> sendMessage(String message, List<Reader> readers) {
        return readers.stream()
                .map(r -> new Email(r.getEmail().getAddressName(), message))
                .collect(Collectors.toList());
    }

    public List<Email> sendMessageByAgreeReaders(String message, List<Reader> readers) {
        return readers.stream()
                .filter(Reader::isReaderConsent)
                .filter(reader -> reader.getBorrowedBooks().size() > 1)
                .map(r -> new Email(r.getEmail().getAddressName(), message))
                .collect(Collectors.toList());
    }
}