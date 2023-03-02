## 문자열

가장 기본이 되는 자료형은 숫자형
- 원시 자료형(Premitive Type)

개발자 협업하기
- 명확한 표현
- 문자열

ex) 네이버 메인 화면
- 문자열을 처리할 수 없으면 성능 x, 개발 퍼포먼스도 잘 나오지 않는다
- 문자로 이루어진 배열의 형태로
- [네이버, 로그인, 회원가입]

```java
//String msg = "HELLO";
//[H E L L O]
//
//H : 72
//E : 69
//L : 76
//L : 76
//O : 79
```

객체지향 언어에서는 클래스타입을 사용할 수 있으므로 문자열 역시 별도의 클래스 타입으로 만들어 사용할 수 있다.

[Java]
String 클래스 : 문자열 타입

## 문자열 생성 / 비교

자바에서는 문자열 처리가 매우 쉬움
기본적인 구조의 특징들을 잘 이해하고 사용하지 않으면 생각지못한 문제가 발생
=> 서버의 성능상에 문제가 발생

String 클래스
- 불변 클래스 (immutable)

## String 특징



### immutable
불변의, 변경할 수 없는 뜻
즉, immutable Class 는 변경이 불가능한 클래스

String msg = "hello";
=> reference 타입의 객체이기 떄문에 heap 영역에 생성이 된다.

자바의 immutable class 종류
1. String
2. Boolean
3. Integer
4. Float
5. Long
....

Heap 영역에서 변경 불가능 한 것, 재할당을 못하는게 아님.


a가 참조하고 있는 heap 영역의 객체가 바뀌는 것이지 heap 영역에 있는 값이 바뀌는게 아니다.
=> a가 처음에 참조하고 있는 "aa" 값이 "bb"로 변경되는 것이 아니라
"bb"라는 새로운 객체를 만들고 그 객체를 a가 참조하게 하는 것

"aa"??
=> 객체는 그 누구도 참조하고 있지 않다 -> GC(가비지 콜렉터)


### 문자열 합 '+'
+ 연산자를 이용해서 문자열을 결합하는 경우 인스턴스내의 문자열이 바뀌는 것이 아니라 새로운 문자열이 담긴 String 인스턴스가 생성됨
문자열간의 결합등의 작업은 문자열 "+"를 사용하는 것 보다는 StringBuffer 클래스를 사용

단, str2 주소는 새로 할당 됨
변수의 주소값을 비교하기 때문에 새로만들면 


## String 클래스 주요 메서드
split 문법 => 나누다


### String joiner
StringJoiner sj = new StringJoiner(":", "[", "]");
sj.add("George").add("Sally").add("Fred");
String desiredString = sj.toString();



### String builder & String Buffer
- 기본적으로 동일한 클래스
- 문자열을 결합시 새로운 인스턴스가 계속해서 생겨나기 때문에 for문을 돌면서 지속적으로 문자열을 결합하는 형태의 프로그램은 성능에 큰 영향을 끼침

차이
String Buffer
※ 왜 해당 메소드를 사용했는지 면접에서 물어봄 ※
- Thread safe로 멀티스레드 처리에 안전하지만 성능이 저하
- 데이터 정합성이 중요할 때

멀티스레드처리가 없는 프로그램이라면 StringBuilder

```java
//StringBuffer sb = new StringBuffer();
//
//sb.append("hello");
//sb.append(" world");
//
//String str = sb.toString();
//// hello world
```

* String : 문자열 연산이 적고, 멀티쓰레드 환경일 경우 사용
* StringBuffer : 문자열 연산이 많고, 멀티쓰레드 환경일 경우 사용
* StringBuilder : 문자열 연산이 많고, 단일쓰레드 환경 또는 동기화를 고려하지 않아도 되는 경우


#### String - StringBuffer, StringBuilder 차이점
- String은 불변(immutable) 속성
- StringBuffer, StringBuilder는 가변성(mutable) 속성
  - 문자열의 추가, 수정, 삭제가 빈번하게 발생하는 경우에 사용
  - 동일 객체내에서 문자열을 변경


#### StringBuffer - StringBuilder 차이점
- 동기화의 유무
- StringBuffer는 동기화 키워드를 지원하여 멀티쓰레드 환경에서 안전(thread-safe)
- StringBuilder는 동기화를 지원하지 않음.
  - 단일쓰레드에서의 성능은 StringBuffer 보다 빠름