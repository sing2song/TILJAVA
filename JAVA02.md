## 배열

메모리 안에서 **연속되어서** 자리잡고있는 데이터=같은 타입

알고리즘의 꽃🌸

**같은 타입**의 변수를 하나의 묶음으로 모아 놓은 것

기본형은 그자리에 가면 값과 주소가 있음.

설치형은 한번에 assecss해서 가면 value가 있지않으므로 더 들어가야함. (주소만 갖고있다)

### 메모리구조

Stack에 넣는지 Heap에 넣는지확인해야한다.



### 배열생성

![image-20210202102651928](md-images/image-20210202102651928.png)

int [] a; int a[];

a = new int[3];

int[] a1={1,2,3,4};

a.length()



### 배열 선언

배열 참조 변수란 배열 객체를 가르키는 변수.

new를 사용하여 생성해야한다.

대괄호 안의 숫자는 고정된 배열 크기 나타냄.

선언과 동시에 생성

**자바에서는 배열을 선언할 때 배열의 크기를 지정할 수 없다**

배열을 초기화 할 때 선언과 초기화를 따로 해야하는 경우의 배열을 작성하기.

```java
int[] arr1[];
int[] arr2= {1,2,3};
int[] arr3 = new int [5];
//int[] arr4 = new int[5] {1,2,3,4,5}; - wrong
int[] arr4 = new int[] {1,2,3,4,5};
//int arr5[5]; - wrong
int arr5[];
int[] arr6[] = new int[3][];
//다차원에 배열에서 마지막 차수는 크기를 지정하지 않는다.
```

![image-20210202103325995](md-images/image-20210202103325995.png)

heap에 저장되게 된다.



### 배열의 참조값 복사

![image-20210202110641885](md-images/image-20210202110641885.png)



**메모리 차원에서의 배열 복사**

부분 배열 복사 (얕은 복사) : System.arraycopy()

전체 배열 복사 (깊은 복사) : clone()

arraycopy()가 더 빠르다.

```java
public static void main(String[] args){
    int[] source = new int[]{5, 4, 6, 9, 7, 9};
    int[] target = {100, 200, 300, 400, 500, 600,700};
    //부분 배열 복사의 예
    System.arraycopy(source, 2, target, 3, 4);
    for(int i=0; i<target.length; i++){
   		System.out.println("target["+i+"]:" + target[i]);
    }
} //end of main
```



### 2차원 배열

```java
int[][] score2= {
				{10,10,10},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		int[][] result=new int[score2.length+1][score2[0].length+1];
		//Q. 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지
		//막 요소에 각 열과 행의 총합을 저장하고 출력해보자.
		
		for(int i=0;i<score2.length;i++) {
			for(int j=0;j<score2[i].length;j++) {
				
				result[i][j]=score2[i][j];
				//누적
				result[i][score2[i].length]=result[i][score2[i].length]+score2[i][j];
				result[score2.length][j]=result[score2.length][j]+score2[i][j];
				
				//마지막 끝값
				result[score2.length][score2[i].length]=result[score2.length][score2[i].length]+score2[i][j];
				
			}
			
		}
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}
```







## Package

관련있는 클래스나 인터페이스들을 묶은 것.

기본적인 클래스들을 제공하는 java.lang패키지와 GUI에 관한 클래스제공하는 java.awt가 있다.

패키지 이름은 소문자. 메서드는 대문자.

자바언어패키지는 java, javax로 시작



> 패키지의 장점 

- 클래스의 이름이 동일하더라도 서로 다른 패키지에 속한다면 문제가 없다. - 패키지 별로 클래스 접근에 제약을 가할 수 있다. 
- 클래스를 기능 별로 분류할 수 있어 필요한 클래스의 식별이 용이하다.



### 계층구조 package

![image-20210202121116247](md-images/image-20210202121116247.png)









## 객체지향 프로그래밍1

c는 절차지향 언어. 

java는 추상화시켜서 객체화하는 것.

객체는 클래스에서 만들어진다.



1.추상화

객체에서 공통되는 특성이나 속성을 추출하여 파악하는 작용

- 메시지 : 메소드이름, 인자, 수신자객체이름
- 메소드 : 메시지(이벤트)를 받았을때의 반응(행위)을 나타낸다.



2. 캡슐화

객체의 속성과 행위를 하나로 묶는 개념. 

데이터를 감추고 외부와는 메소드를 통해 접근한다. (정보은닉)

java의 디폴트레벨은 package레벨(생략가능) 같은 패키지 않에서만 사용가능.

public < protected (내 자식에게 준다)





## 객체지향 프로그래밍2



## 내부클래스





## Object 클래스





## 제네릭과 컬렉션

