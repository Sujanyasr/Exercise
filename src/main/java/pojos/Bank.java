package pojos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Bank {
	private String cardExpire;
	private String cardNumber;
	private String cardType;
	private String currency;
	private String iban;
}
