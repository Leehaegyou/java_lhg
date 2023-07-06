package day26.library.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

//대출 열람(도서대출 기록)
@Data
public class LoanBrowsing implements Serializable {

	private static final long serialVersionUID = 4272632230761810647L;

	private Book book;//대출 도서
	private Date loanDate;//대출일
	private Date returnDate;//반납일
	private Date estimatedDate;//반납 예정일
	
	public LoanBrowsing(Book book, Date date, int loanPeriod) {
		this.book = book;
		this.loanDate = date;
		//대출 기한을 이용하여 반납 예정일을 추가
		caㅣculateReturnDate(loanPeriod);
	}
	
	private void caㅣculateReturnDate(int loanPeriod) {
		if(loanDate == null) {
			return;
		}
		Long loanDateMs = loanDate.getTime();//대출일을 밀리초로 환산
		Long periodMs = loanPeriod * 24 * 60 * 60 * 1000L;
		//new Date() : 현재 시간은 Date객체로 생성
		//new Date(Long a) : 1970년 1월 1일 0시를 기준으로 a밀리초만큼 흐른 날짜
		estimatedDate = new Date(loanDateMs + periodMs);
	}

	public String getLoanDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(loanDate);
	}

	public String getReturnDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(returnDate);
	}
	public String getEstimatedDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(estimatedDate);
	}
	
}







