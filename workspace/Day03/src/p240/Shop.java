package p240;

import java.util.Vector;

public class Shop {
	//가게에 물건을 저장할 수 있는 공간
	protected Vector store = new Vector();
	//가게에 물건의 갯수를 알 수 있는 메서드
	public int getCount(){
	return store.size();
	}
	public void getStore() {
		for(int i=0;i<store.size();i++) {
			System.out.println(store.get(i));
		}
		
	}
}
