package p91;

public class Break {
	public static void main(String args[]){
		int sum = 0;
		int i =0;
		while(true){
			if(sum>100)
				break;
			i++;
			sum +=i;
		}
		System.out.println("i = :"+i);
		System.out.println("sum = :"+sum);
		
		int cnt=0;
		for(i =1;i<=10; i++)
		{
			if(i%3 ==0) {
				cnt++;
				continue;
			}
			System.out.println(i);
		}
		System.out.printf("3의 배수 갯수는 %d다!",cnt);
	}
}
