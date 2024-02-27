package day2_4;

import lombok.*;

@Getter
@Setter
public class UriCola {
	private static String name = "우리콜라";
	private static Long price = 1500L;
	private String factory;
	
	public UriCola() {
	}
	
	public UriCola(String factory) {
		this.factory = factory;
	}
}