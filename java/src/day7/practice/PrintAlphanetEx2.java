package day7.practice;

public class PrintAlphanetEx2 {

	public static void main(String[] args) {
		//a부터 z까지 출력하는 코드를 작성하세요.
		char a = 'A', end;
		int i;
		
		for(end = 'A'; end <= 'Z'; end++) {
			System.out.print(end + " ");
		
		for (a = 'A'; a <= end; a++) {
			System.out.print(a + " ");
			}
		System.out.println();
		}
		/*while(a <= 'Z') {
			System.out.printf(a++);
		}*/
	}

}
