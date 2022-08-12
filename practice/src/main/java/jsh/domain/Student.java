package jsh.domain;

import lombok.*;

@Data
@ToString
@EqualsAndHashCode(of="studentNo")
public class Student {
	
	private int studentNo;
	private String name;

}
