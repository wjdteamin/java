package day2_8;

import java.time.*;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {
	private String username;
	@Setter
	private String password;
	private String irum;
	private String email;
	private LocalDate birthday;
}