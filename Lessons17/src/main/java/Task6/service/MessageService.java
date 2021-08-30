package Task6.service;

import Task6.model.Email;
import Task6.model.Reader;

import java.util.List;

public interface MessageService {

    List<Email> sendMessage(String message, List<Reader> readers);

    List<Email> sendMessageByAgreeReaders(String message, List<Reader> readers);

}