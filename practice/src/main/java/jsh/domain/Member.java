package jsh.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {

	private String userId;
	private String password;

	private String userName;

	private String email;
	private String gender;
	private String hobby;
	private String[] hobbyArray;
	private List<String> hobbyList;
	private boolean foreigner;
	private String developer;
	private String nationality;

	private Address address;

	private List<Card> cardList;

	private String cars;
	private String[] carArray;
	private List<String> carList;

	private String introduction;

	private LocalDate dateOfBirth;

}
