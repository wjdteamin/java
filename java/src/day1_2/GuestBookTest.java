package day1_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class GuestBookTest {
	private GuestBookService service =new GuestBookService();
	
	
	@Test
	public void saveTest() {
		ArrayList<GuestBook> list = service.findAll();
		assertEquals(0L, list.size());

		service.save(new GuestBook(1L, "살려줘", "제목 집",  LocalDate.now()));
		ArrayList<GuestBook> list2 = service.findAll();
		
		assertEquals(1L, list2.size());
	}
	
	@Test
	public void findByldTest() {
		service.save(new GuestBook(2L, "살려줘", "제목 집",  LocalDate.now()));
		GuestBook list = service.findByld(1L);
		assertEquals(2L,list.getGno());
		//assertNotNull(list);
	}
}
