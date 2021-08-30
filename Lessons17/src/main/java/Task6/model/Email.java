package Task6.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Email {
    private String addressName;
    private String message;

    public Email(String addressName) {
        this.addressName = addressName;
    }
}
