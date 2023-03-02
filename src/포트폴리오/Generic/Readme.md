## Generic

정의 : "일반적인" 뜻
        데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법

LinkedList<Double> list3 = new LinkedList<Double>();  
LinkedList<Character> list4 = new LinkedList<Character>();

- 비효율적이고, 불편  
해결방안 : *제너릭*  
- 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미한다.  
- 컴파일 할 때 해당 타입으로 캐스팅하여 매개변수화 된 유형을 삭제하는 것이다.

장점
1. 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지 가능
2. 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가없다
3. 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아진다

특징
타입 안전성(Type Safe)

// T : Type
// E : Element
// K : Key
// V : Value
// N : Number

주의해야할 점
- 타입 파라미터로 명시할 수 있는 것은 참조 타입 밖에 올 수 없다.
- int, double, char => primitive type (x)
- Integer, Double 같은 Wrapper Type 으로 사용할 수 있다.



## 제너릭 와일드 카드

일반적으로 제너릭
- 타입을 T라고 하고 외부클래스에서 Integer 를 파라미터로 보내면
- T Integer 가 되고, String을 보내면 String이 된다

ex) main  
Test(1);  
Test("1");  
Test(new Student());

클래스를 만들었을 때 T 파라미터를 Student로 보내면 객체가 된다.  
=> 제너릭은 참조 타입 모두가 될 수 있다.

특정 범위 내로 좁혀서 제한하고 싶다면?
- extends
- super
- ? => 와일드 카드

### extends

< K extends T> // T와 T의 자손 타입만 가능  
< K super T> // T와 T의 부모(조상) 타입만 가능  

< ? extends T> // T와 T의 자손 타입만 가능  
< ? super T> // T와 T의 부모(조상) 타입만 가능  

< ?> // 모든 타입이 가능 == <? extends Object>

extends T : 상한 경계  
super T : 하한 경계

#### <? extends T> < K extends T > 차이점
- 유형 경계를 지정하는 것은 같으나 경계가 지정되고 K는 특정 타입이 지정이 되지만,
- ?는 타입이 지정되지 않는다는 의미

```java
// <K extends Number>
/*
Number 와 이를 상속하는 Integer, Short, Double, Long 등등 타입이 지정될 수 있으며,
객체 혹은 메소드를 호출할 경우 K는 지정된 타입으로 변환이 됨
*/

// <? extends Number>
/*
Number와 이를 상속하는 Integer, Short, Double, Long 등등 타입이 지정될 수 있으며,
객체 혹은 메소드를 호출 할 경우 지정되는 타입이 없어 타입 참조 할 수 없음
*/ 
```

특정 타입의 데이터를 조작하고자 할 경우에는 K 같이 특정 제너릭 인수로 지정 필요.
=> 타입 세이프하게 설계하기 위해서

EX)
  A
B   D
C   E

< T extends B>	// B와 C타입만 올 수 있음  
< T extends E>	// E타입만 올 수 있음  
< T extends A>	// A, B, C, D, E 타입이 올 수 있음  

< ? extends B>	// B와 C타입만 올 수 있음  
< ? extends E>	// E타입만 올 수 있음  
< ? extends A>	// A, B, C, D, E 타입이 올 수 있음  

==> extends 뒤에 오는 타입이 최상위 타입으로 한계가 정해짐

수를 표현하는 래퍼 클래스로만 제한하고 싶은 경우
```java
public class ClassName <K extends Number> { 
//	...
}

public class Main {
        public static void main(String[] args) {
                ClassName<Double> a1 = new ClassName<Double>();	// OK!
                ClassName<String> a2 = new ClassName<String>();	// error!
        }
}
```


### super
부모 타입만 가능

< K super B>	// B와 A타입만 올 수 있음  
< K super E>	// E, D, A타입만 올 수 있음  
< K super A>	// A타입만 올 수 있음  

< ? super B>	// B와 A타입만 올 수 있음  
< ? super E>	// E, D, A타입만 올 수 있음  
< ? super A>	// A타입만 올 수 있음

super 뒤에 오는 타입이 최하위 타입으로 한계가 정해지는 것

사용 시기
 : 대표적으로 해당 객체가 업캐스팅(Up Casting)이 될 때 사용


### ? (와일드카드)
< ? extends Object>
Object는 자바의 최상위 타입
-> 어떤 타입이던지 상관 없다는 의미

외부조직 <> 우리조직
설계(x)     어떤 데이터가 오는지 모름