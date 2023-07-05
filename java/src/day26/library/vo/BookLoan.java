package day26.library.vo;

import lombok.Data;

@Data
	public class BookLoan {
	private String bookloannumber;
	
	public BookLoan(String bookloannumber) {
		this.bookloannumber = bookloannumber;
}
}
