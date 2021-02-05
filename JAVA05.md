### Queue

프론트에서 데이터 삭제가 일어나고 중간에 특정 데이터를 추가할 수 없다.

예제에서 사용한 큐의 형태.

LinkedList와 Iterator를 사용했다.(p.371)

```java
static Queue q = new LinkedList();
///
LinkedList tmp = (LinkedList) q;
ListIterator it = tmp.listIterator();
while (it.hasNext()) {
			System.out.println(++i + "." + it.next());
		}
```



Queue에 데이터를 추가, 삭제, 검색할 때 제공되는 메서드들의 차이는 기능적인 것은 아니며 문제 상황에서 예외를 던지느냐 아니면 null 또는 false를 반환하느냐에 있다.

예외처리를 발생하는 함수: `add()` , `remove()`,  `element()`

T/F를 리턴하는 함수 : `offer()`, `poll()`, `peek()`

![image-20210205093225614](md-images/image-20210205093225614.png)







### MAP

많은 데이터 중에서 우너하는 데이터를 빠르게 찾을 수 있는 자료구조.

맵은 사전과 같은 자료 구조!

key, value로 구성된 Map.Entry객체를 저장하는 구조

```java
Map<String, String> map = new HashMap<String, String>();
map.put("1", "길동");
map.put("2", "동희");
map.put("3", "순희");
```



> 저장된 전체 객체 를 대상으로 하나씩 얻어 오는 방법

1) keySet()

Set컬렉션을 얻은 후, 반복자로 하나씩 get() 통해 값 가져온다.

```java
Set<String> keys = map.keySet();
Iterator<String> it = keys.iterator();
while (it.hasNext()) {
    String key = it.next();
    System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
}

for (String key : map.keySet()) {
    System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
}
```



2) entrySet()

entrySet()  메소드로 모든 Map.Entry 를 Set 컬렉션으로 얻은 후, 반복자를 통해 Map.Entry를 하나씩 얻고 getKey()와 getValue() 메소드를 이용해 키와 값을 얻는다. 

```java
Set<Map.Entry<K,V>> entrySet = map.entrySet();
Iterator<Map.Entry<K,V>> entryIterator = entrySet.iterator();
while(entryIterator.hasNext()){
    Map.Entry<K, V> entry = entryIterator.next();
    K key = enry.getKey();
    V value = entry.getValue();
}

for (Map.Entry<String, String> entry : map.entrySet()) {
    System.out.println(String.format("키 : %s, 값 : %s", entry.getKey(), entry.getValue()));
}
```





### Collenctions 클래스

여러 유용한 알고리즘을 구현한 메소드들을 제공한다.

중요한 알고리즘은 정렬(Sorting), 섞기(Shuffling), 탐색(Searching)이 있다.

제네릭 기술을 이용하여 이 메소드들이 작성되었고 정적인 형태로 되어 있다.



#### ComapreTo함수❗

- sort를 사용하려면 CompareTo메서드를 재정의해줘야한다.

```java
class Grade implements Comparable<Grade> { //Comparable 인터페이스는 compareTo() 라는 메소드를 가진다.
    int number;
    String grade;
    public Grade(int number,String grade) {
        this.number = number;
        this.grade = grade;
    }
    public String toString() {
    	return grade;
    }
    public int compareTo(Grade g) { // 객체를 서로 비교하기 위한 메소드이다.
        //1)
    	return number – g.number;
        //2)
        return this.getGrade().compareTo(g.getGrade());	//grade로 비교

    }
}

public class SortTest {
    public static void main(String[] args) {
        Grade array[] = {
            new Grade(20130001, “A+”),
            new Grade(20130002, “C+”),
            new Grade(20130003, “B+”),
            new Grade(20130004, “D”)
        };
        List<Grade> list = Arrays.asList(array);
        Collections.sort(list); // 정렬하는 도중에 Grade클래스의 compareTo() 메소드를 사용한다.
        System.out.println(list);
    }
}
```

> 결과

[A+, C+, B+, D]





#### 섞기 Shuffling

정렬(Sorting)의 반대로 동작하여 리스트의 정렬을 파괴하고 순서를 랜덤 하게 한다.



#### 탐색 Searching

이진탐색트리



## 내부클래스(p245)

클래스 안에 클래스가 있는 것. 정보은닉. 다른 클래스에서는 내부에 있는 클래스를 사용할 수 없다!!



## Wrapper클래스(p258)

기초 자료형의 효율적인 관리와 은닉화, 객체화를 위해 만들어진 대체 클래스이다.

