package p240;

public class VideoShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp;
		VideoShop vs = new VideoShop();//비디오 가게 생성
		System.out.println("보유한 비디오 갯수는 "+vs.getCount());
		
		//1. 3개의 비디오 반납
		vs.enQueue("매트릭스1");
		vs.enQueue("매트릭스2");
		vs.enQueue("매트릭스3");
		System.out.println("보유한 비디오 갯수는 "+vs.getCount());
		System.out.println("-----보유 목록----");
		vs.getStore();
		System.out.println("---------------");
		//2. 3개의 비디오 빌리기
		temp = vs.deQueue(); System.out.println(temp + " 빌림");
		temp = vs.deQueue(); System.out.println(temp + " 빌림");
		temp = vs.deQueue(); System.out.println(temp + " 빌림");
		System.out.println("보유한 비디오 갯수는 " + vs.getCount());
	}

}
