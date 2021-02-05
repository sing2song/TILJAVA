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

