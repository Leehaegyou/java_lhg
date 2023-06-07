package day6.practice;

public class PrimeNumberEx {

	public static void main(String[] args) {
		//2부터 100사이의 소수를 출력하는 코드를 작성하세요.
	int i = 2, j, count = 0;
	
	while (i <= 100) {
	
	//i가 소수 이면 i를 출력
	j = 1;
	count = 0;
			while(j <= i) {
			if(i % j == 0) {
				count++;
				}	
			j++;
			}
			if(count == 2) {
			System.out.println(i);
			}	
			i++;
		}
	}
}

