# CS

# 객체지향

기존의 프로그래밍언어에서 몇가지 새로운 규칙을 추가한 형태로 발전된것이다. "객체지향은 실세계를 직접적이고 직관적으로 모델링 할 수 있는 패러다임" 이다. 이 말이 어떤 뜻을 의미할까? 이 설명이 담고 있는 뜻은 객체지향 프로그래밍이란 현실 속에 존재하는 사물을 최대한 유사하게 모방해 소프트웨어 내부로 옮겨오는 작업이기 때문에 그 결과물인 객체지향 소프트웨어는 실세계의 투영이며, 객체란 현실 세계에 존재하는 사물에 대한 추상화라는것.

## 객체지향 언어의 특징(장점)

### 1. 코드의 재사용성이 높다.

새로운 코드 작성시 기존의 코드 이용해 쉽게 작성

### 2. 코드의 관리가 용이하다.

코드간의 관계를 이용해 적은 노력으로 쉽게 코드 변경

### 3. 신뢰성이 높은 프로그래밍을 가능하게 한다.

제어자와 메서드를 이용해 데이터를 보호하고, 코드의 중복을 제거해 코드의 불일치로 인한 오작동 방지

## 클래스

객체를 정의해 놓은 틀 혹은 객체의 설계도 또는 틀 이라고 정의 할 수 있다. 객체는 클래스에 정의된대로 생성된다. 클래스와 객체를 실생활의 예로 들어본다면 클래스는 제품설계도 객체는 제품이 될것이다. 즉, 클래스를 잘 만들어 놓으면 객체를 생성하는 일은 쉬워진다. 클래스로부터 객체를 생성해서 사용하면 된다.

## 인스턴스

클래스로부터 객체를 만드는 일을 클래스의 인스턴스화(instantiate)라고 하고, 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스(instance)라고 한다. 결국 인스턴스와 객체는 같은 의미를 가지지만 객체는 모든 인스턴스를 대표하는 포괄적인 의미를 갖고 있고, 인스턴스는 보다 구체적인 의미를 가지고 있다. 예를 들어 보면, 책상은 객체다 라고 더 많이 쓰며 책상은 클래스의 인스턴스다라는 말을 더 많이 쓴다.

## 상속(inheritance)

상속이란 기존의 클래스를 재사용해서 새로운 클래스를 작성하는 것상속을 통해 클래스 작성시 보다 적은 양의 코드로 새로운 클래스 작성할 수 있게 된다. 이런 특징으로 코드의 재사용성을 높이고 코드의 중복을 제거해 프로그램의 생산성과 유지보수에 기여한다.

```jsx
class Child extends Parent{
    ...
}
```

이렇게 자바에서는 extends와 함께 써주면 된다. 이 두 클래스는 상속 관계에 있다고 하고 상속해 주는 클래스를 Parent Class(조상 클래스), 상속 받는 클래스를 Child Class(자식 클래스)라고 한다. Child Class는 Parent Class로 부터 모든 멤버를 상속받는다. 즉, Parent Class를 변경시 Child class에도 자동으로 반영이 된다.

### 상속을 왜 쓸까?

이렇게 Child와 Child2 모두 Parent class를 상속 받고 있으므로 Parent class 와 Child class 그리고 Parent class와 Child2 class모두 서로 상속 관계에 있다. 만약 Child클래스와 Child2클래스에 공통적으로 추가되야 하는 부분이 있으면 Parent class에 추가 시킬 수 있다. 두 클래스에 따로 코드를 추가 시킬 필요가 없어 지고 Parent만 변경하면 되니 작업이 간단해 진다. 그리고 더 중요하게 코드의 중복이 줄어든다.

> 코드의 중복이 많아지면 유지보수가 어렵고 일관성 유지가 힘듬
>

### 상속 코드 예시

```jsx
class Tv {

   boolean power; // 전원상태 (on / off)
   int channel;   // 채널

   void power()       {   power = !power; }
   void channelUp()   {   ++channel;      }
   void channelDown() {   --channel;      }
}

class CaptionTv extends Tv {

   boolean caption;     // 캡션상태 (on / off)
   
   void displayCaption(String text) {
       if (caption) {   // 캡션 상태가 on (true) 일 때만 text를 보여준다.
           System.out.println(text);
       }
   }
}

class CaptionTvTest {

   public static void main(String [] args) {
       CaptionTv ctv = new CaptionTv();
       ctv.channel = 10;                          // 조상 클래스로부터 상속받은 멤버
       ctv.channelUp();                           // 조상 클래스로부터 상속받은 멤버
       System.out.println(ctv.channel);
       ctv.displayCaption("Hello, World");
       ctv.caption = true;          // 캡션 (자막) 기능을 켠다.
       ctv.displayCaption("Hello, World");
   }
}
```

> c++은 여러클래스로 부터 상속 받는 다중상속을 허용하지만 자바에서는 단일 상속만을 허용한다. 그 이유는 다중상속을 사용하면 클래스간의 관계가 매우 복잡해지고 서로 다른 클래스로부터 상속받은 멤버간의 이름이 같은 경우 구별할 방법이 없다.
>

### 포함관계(클래스간의 관계)

클래스간의 상속이외에 클래스를 재사용할 수 있는 방법중 하나이다. 클래스간의 포함관계를 맺어주는 것은 클래스의 멤버변수로 다른 클래스를 선언하는 것을 뜻한다.

```jsx
class Circle{
    int x;
    int y;
    int r;
}

class Point
    int x;
    int y;
}
```

이렇게 기존에 Circle Class와 Point Class가 있다고 가정해본다면 우리는 Point Class를 재사용해 Circle Class를 작성할 수 있다.

```jsx
class Circle{
    Point p = new Point();
    int r;
}
```

이렇게 한 클래스를 다른 클래스의 멤버변수로 정의해 포함시키는 것은 좋은 방법이다. 하나의 거대한 클래스로 작성하는 것보다 단위별로 여러개의 클래스를 작성해 포함관계로 사용하면 더 간결하고 쉽게 클래스 작성이 가능해진다.

> 포함관계 v.s 상속관계클래스 작성시 상속관계를 맺을지 포함관계를 맺을지 혼란스러울 수 있다. 위에서 나온 Circle class도 Point Class를 상속시켜줬어도 결과적으로는 별 차이가 없어 보인다. 그럴 경우, '~ 은 ~이다'(상속관계) 와 '~은 ~을 가지고 있다'(포함관계)를 사용해 문장을 만들어 보면 무엇을 사용할지 알 수 있다.
>

> 원은 점이다(상속관계)원은 점을 가지고 있다.(포함관계) 이것으로 우리는 포함관계를 사용해야한다는것을 명백히 알 수 있다.
>

### 다형성(Polymorphism)

객체지향에서 다형성이란 '여러가지 형태를 가질 수 있는 능력'을 의미하며, 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함으로써 다형성을 프로그램적으로 구현했다. 조금 더 자세히 말하면, 조상클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조할 수 있도록 했다는 의미이다.

상속에서 본 코드 예시에서 두 클래스의 인스턴스를 생성하기 위해서 인스턴스 타입과 일치하는 참조변수만 사용했었다.

```jsx
Tv t = new Tv();
CaptionTv c = new CaptionTv();
```

하지만, Tv클래스와 CaptionTV클래스는 서로 상속관계에 있어, 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조하도록 하는 것도 가능하다.

```jsx
Tv t = new CaptionTv();
```

반대로 자손타입의 참조변수로 조상 클래스의 인스턴스를 참조하도록하는것은 불가능하다.

### 참조변수의 형변환

서로 상속관계에 있는 클래스 사이에서 자손타입의 참조변수를 조상타입의 참조변수로 또는 그 반대로 형변환이 가능하다.

> 자손타입->조상타입(up-casting): 형변환 생략 가능
>

> 자손타입<-조상타입(Down-casting): 형변환 생략 불가
>

```jsx
class Car{
    ...
}
class FireEngine extends Car{
    ...
}
class Ambulance extends Car{
    ...
}

이렇게 3개의 클래스가 있다고 한다면

Car car = null;
FireEngine fe = new FireEngine();
FireEngine fe2 = null;

car = fe;                       //car=(Car)fe;에서 형변환 생략된 형태
fe2 = (FireEngine)car;          //형변환 생략할 수 없음
```

조상타입의 참조변수로 형변환하는 것은 참조변수가 다룰 수 있는 멤버의 개수가 실제 인스턴스가 갖고 있는 멤버의 개수보다 적을 것이 분명하므로 문제가 되지 않아 형변환 생략 가능.

형변환은 참조변수의 타입을 바꾸는것 인스턴스를 변환하는 것은 아니기에 형변환은 인스턴스에 아무런 영향을 미치지 않는다.

또, 다형성은 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 의미하기도 한다. 즉, 오버라이딩과 오버로딩이 다형성의 다른 예들이다.

### 오버라이딩(Overriding)

Parent Class로부터 상속 받은 메소드의 내용을 변경하는것을 오버라이딩이라고 한다. 오버라이딩은 메서드의 내용만을 새로 작성하는 것이다. 따라서, 메서드의 선언부는 Parent Class에 있는것과 일치해야한다. 즉, 이름 매개변수, 리턴타입이 같아야 한다.

**Parent Class를 Child Class에서 오버라이딩할때**

1. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
2. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
3. 인스턴스 메서드를 static메서드로 또는 그 반대로 변경할 수 없다.

```jsx
class Person{
    void speak(){
        System.out.println("안녕하세요");
    }
}

class baby extends Person{
    @Override
    public void speak(){
        System.out.println("응애응애");
    }
}
```

### 오버로딩(Overloading)

자바에서는 매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메서드를 정의할 수 있다. 이렇게 한 클래스 내에 같은 이름의 메서드를 여러 개 정의 하는 것을 오버로딩이라고 한다.

**오버로딩 조건**

1. 메서드 이름이 같아야 한다.
2. 매개변수 개수 또는 타입이 달라야한다.
3. 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않는다.

> 매개변수가 다르면 메서드 이름이 같더라도 구분이 가능하지만, 만약 서로 같은 경우는 구분할 수 없어서 메서드가 중복정의 된것으로 간주해 컴파일시 에러발생
>

대표적인 오버로딩의 예로는 println메서드 이다. 우리가 어떤 타입을 println해도 값을 출력할 수 있도록 PrintStream클래스에는 10개의 오버로딩된 println메서드를 정의해 놓고 있다.

```jsx
class OverloadingMethods {
	public void print() {
		System.out.println("오버로딩1");
	}

	String print(Integer a) {
		System.out.println("오버로딩2");
		return a.toString();
	}
}
```

### 추상화(Abstraction)

클래스를 설계도에 비유하면, 추상클래스는 미완성 설계도에 비유할 수 있다. 추상클래스는 미완성 설계도이기에 이 클래스 만으로 인스턴스를 생성하는 것은 가능하지 않다. 추상클래스는 상속을 통해서 자손 클래스에 의해서 완성이 될 수 있다.

추상클래스는 미완성 메소드(추상 메서드)를 포한하고 있다는 것을 제외하고는 일반 클래스와 같다. abstract를 붙여줘서 상속을 통해 구현해주어야 한다는것을 쉽게 알 수 있다.

### 추상 메서드

메서드 선언만 한채 구현을 하지 않은채로 남겨둔 메서드

### 추상클래스 예시 코드

```jsx
abstract class Player { // 추상 클래스
    abstract void play(int pos); // 추상 메서드
    abstract void stop(); // 추상 메서드
}
class AudioPlayer extends Player {
    void play(int pos) { /*내용 생략*/ } // 추상 메서드를 구현
    void stop() { /*내용 생략*/ } // 추상 메서드를 구현
}
abstract class AbstractPlayer extends Player {
	void play(int pos)  { /*내용 생략*/ } // 추상 메서드를 구현
}
```

### 캡슐화

객체의 속성(data fields)과 행위(메서드, methods)를 하나로 묶고, 실제 구현 내용 일부를 외부에 감추어 은닉한다.객체가 외부에 노출되지 않아야할 정보를 접근제어자를 통해 제어 권한이 있는 객체에서만 접근할 수 있도록 한다.

### 접근제어자

접근 제어자는 `private -> default -> protected -> public` 순으로 보다 많은 접근을 허용한다.

- private : private 이 붙은 변수, 메서드는 해당 클래스에서만 접근이 가능하다.
- protected : protected가 붙은 변수, 메서드는 동일 패키지의 클래스 또는 해당 클래스를 상속받은 다른 패키지의 클래스에서만 접근이 가능하다.

## 객체지향의 단점

1. 설계시 많은 시간과 노력이 필요하다.
2. 코드의 처리 속도가 느리다.

### Q. 상속의 단점

- 부모자식 관계가 컴파일 시점에 결정되어 구현에 의존한다.
- 부모클래스가 자식 클래스와 강하게 결합되어 유연성 및 확장성이 떨어진다. 부모클래스가 변경되면 자식 클래스들을 변경해주어야 한다.
- 다중상속 불가

### Q. 상속을 사용하는 확실한 목적

위의 단점들 때문에 상속은 is-a 관계일때만 사용하는것이 좋다.

### Q. private 메서드에서 getter & setter 사용하면 캡슐화가 무조건 지켜지는가?

아니다. 상황에 맞게 getter와 setter가 필요한곳, 해당 변수가 다른 클래스에서 불려지고 바꿔지는것이 필요한 경우에만 사용한다.

---

# Spring

### Bean

- Spring의 DI Container에 의해 관리되는 POJO(Plain Old Java Object) 이다.
- 구성요소
    - class : Bean 으로 등록할 Java 클래스
    - id : Bean 의 고유 식별자
    - scope : Bean 을 생성하기 위한 방법
    - constructor-arg : Bean 생성시 생성자에 전달할 파라미터
    - property : Bean 생성시 setter 에 전달할 인수

### Bean Scope

- Spring은 자바 객체를 쉽게 관리할 수 있도록 Spring IoC 컨테이너에 등록하여 사용하는데요, 이때 등록된 자바 객체를 **bean**이라고 합니다.
    - spring IoC Container :  빈을 관리하는 객체

이 객체들은 **스프링 IoC 컨테이너에** 의해 생성되고 소멸되는 등의 관리가 이루어 집니다. 이때 bean이 관리되는 범위를 **Bean scope**라고 합니다. 여기서 bean이 싱글턴화 돼서 관리되는 이유는 spring bean의 기본 scope 전략이 **Singleton** 이기 때문입니다.

[종류]

- ****singleton****
    - 가방 보편적인 scope로, bean 등록시 따로 설정을 하지 않았다면 싱글턴으로 등록됩니다.
      어플리케이션에 오직 하나만 생성되는 일반적인 scope 입니다
- ****prototype****
    - 프로토타입 스코프는 컨테이너에게 빈을 요청할 때마다 매번 새로운 객체를 생성해줍니다.프로토타입을 받은 클라이언트가 객체를 관리하여 줍니다
- ****web scope****
    - 웹환경에서만 동작하는 스코프

싱글턴 스코프는 상태값을 가지지 않을경우 (내부 로직만 존재)에 선택하는 것이 좋습니다.

로직만을 처리할 경우 매번 객체를 생성해줄 필요는 없기 때문입니다.

- @Bean
    - 반드시 @Configuration 안에서 사용되어야 한다.
- @Configuration
    - @Bean 설정을 담당하는 클래스가 된다.
    - 빈을 정의하고 생명주기를 설정하게 된다.
- @Component
    - 빈을 선언하는 클래스를 작성하기 위해 넣는 어노테이션이다.
- @ComponentScan
    - @Configuration 과 함께 쓰면, 이 클래스는 자바 빈 설정 클래스가 된다.

## Servlet

- 자바를 사용하여 웹을 만들기 위해 필요한 기술
- 클라이언트가 어떠한 요청을 하면 그에 대한 결과를 전송해주어야 하는데, 이 역할을 하는 자바 프로그램이다.
- 웹서버가 동적인 페이지를 제공할 수 있도록 도와주는 어플리케이션이다
- MVC 패턴에서 Controller 로 이용된다.
- html 을 사용하여 응답한다.

## Servlet Container

- 서블릿이 스스로 동작하는 것이 아니라 관리가 필요한데 그 관리를 해주는 역할이 서블릿 컨테이너이다.
- 클라이언트의 요청(Request)를 받아주고 응답 할 수 있게, 웹서버와 소켓으로 통신한다.
- ex) 톰캣 : 웹서버와 통신하여 JSP(자바 서버 페이지)와 서블릿이 작동하는 환경을 만들어준다.

## IoC / DI

**DI (Defendency Injection) - 의존성 주입**

- 객체를 사용하는 class 내부의 생성자에서 해당 객체를 생성하지 않고 주입받아 사용한다.
- 그럼 이 객체를 누가 생성해주는가 ? **IoC Container**

**IoC Container (Inversion of Control) - 제어의 역전**

- Bean 이라고 불리는 객체들을 관리해주는데 이 Bean 객체들을 등록하고 등록된 Bean 객체들의 의존성을 관리해주고 (객체를 생성해) 주입시켜주는 역할을 한다.
- IoC Container 가 Bean 객체의 의존성을 관리하기 때문에 Bean 객체가 아니면 의존성을 주입시켜 줄 수 없다.
- 기존에는 자바 코드를 작성할 때 객체의 생성, 의존관계 설정 등을 개발자가 해줘야 했지만, 프레임워크가 대신해준다는 의미입니다.

### Filter, Intercepter

- Filter
    - 디스패처 서블릿(Dispatcher Servlet)에 요청이 전달되기 전/후에 url 패턴에 맞는 모든 요청에 대해 부가작업을 처리할 수 있는 기능을 제공한다.
    - 인터페이스를 구현(implements) 해야 하고, 3가지 메소드를 가지고 있다.
        - init 메소드
            - 필터 객체를 초기화하고 서비스에 추가하기 위한 메소드이다.
        - doFilter 메소드
            - url-pattern에 맞는 모든 HTTP 요청이 디스패처 서블릿으로 전달되기 전에 웹 컨테이너에 의해 실행되는 메소드이다.
        - destroy 메소드
            - 필터 객체를 서비스에서 제거하고 사용하는 자원을 반환하기 위한 메소드이다.
    - 관리 되는 컨테이너  : 웹 컨테이너
    - 용도 및 예시
        - 공통된 보안 및 인증/인가 관련 작업
        - 모든 요청에 대한 로깅 또는 감사
        - 이미지/데이터 압축 및 문자열 인코딩
        - Spring 과 분리 되어야 하는 기능

- Interceptor
    - Spring이 제공하는 기술로써, 디스패처 서블릿(Dispatcher Servlet)이 컨트롤러를 호출하기 전과 후에 요청과 응답을 참조하거나 가공할 수 있는 기능을 제공한다.
    - 관리 되는 컨테이너  : 스프링 컨테이너
    - 용도 및 예시
        - 세부적인 보안 및 인증/인가 공통 작업
        - API 호출에 대한 로깅 또는 감사
        - Controller 로 넘겨주는 정보(데이터)의 가공

### **스프링에서 HTTP 요청이 들어왔을 때의 흐름**

Request

- Server → WAS → Servlet Filter → Dispatcher Servlet → Spring Interceptor

Response

- Spring Interceptor -> Dispatcher Servlet -> Servlet Filter -> WAS -> Web Server

### **REST (Representational State Transfer)**

- 웹에서 데이터를 전송 및 처리하는 방법을 정의한 인터페이스를 말한다.
- 모든 데이터 구조와 처리방식은 REST 에서 URL 을 통해 정의되기 때문에 직관적이다.
- 기계적이고 반복적인 코드를 깔끔하게 정리해준다.

### HTTP 메소드와 CRUD

- API 설계 할 때, URL 로는 자원을 명시하고, HTTP 메소드로 행위를 명시한다.
- REST 구성
    - 자원(Resource) : URL
    - 행위(Verb) : HTTP Method
        - Create : 데이터 생성(POST)
        - Read : 데이터 조회(GET)
        - Update : 데이터 수정(PUT)
        - Delete : 데이터 삭제(DELETE)

### 응답코드

- 1xx(정보) : 요청을 받고 프로세스 계속 진행
- 2xx(성공) : 요청을 성공적으로 받고 인식하고 수용
- 3xx(리다이렉션) : 요청 완료를 위해 추가 작업 조치
- 4xx(클라이언트 오류) : 요청의 문법이 잘못되 었거나 요청 처리 할 수 없음
- 5xx(서버 오류) : 서버가 명백히 유효한 요청에 대한 충족 실패

### (?)웹 서비스 플로우

### Spring vs Spring Boot

- 장점
    - 경량 컨테이너
    - IoC(Invertion of Control: 제어 역행)
    - Di(Dependency Injection: 의존성 주입)
    - AOP(Aspect-Oriented Programming: 관점지향 프로그래밍)

- Spring → SpringBoot 에서 개선된 점
    1. ****Dependency (의존, 종속)****
        1. dependency를 설정해줄 때 설정 파일이 매우 길고, 모든 dependency에 대해 버전 관리도 하나하나 해줘야 하는 부분 개선
    2. ****Configuration (환경설정)****
        1. configuration설정을 할 때도 매우 길고, 모든 어노테이션 및 빈 등록 등을 설정해 줘야 하는 부분을 개선
        2. ****강력한 AutoConfiguration****
            1. 해당 어노테이션 덕분에 많은 외부 라이브러리, 내장 톰캣 서버 등이 실행될 수 있습니다.
    3. ****편리한 배포****
        1. Spring Boot Framework의 경우, Tomcat 이나 Jetty 같은 내장 WAS를 가지고 있기 때문에 jar 파일로 간편하게 배포할 수 있습니다.
        2. Spring 에서 WAS를 정하고, 모든 설정을 마쳐 배포를 하는 것보다 훨씬 간단한 배포 방법입니다.

- 요약
    - Spring Framework 보다 SpringBoot Framework가 개발자가 환경설정보다 더욱 개발에 집중할 수 있도록 해주는 프레임워크입니다.

### Spring 언제 써야하나?

### JPA (Java persistence API)

1. Java 진영에서 ORM(Object-Relational Mapping) 기술 표준으로 사용하는 인터페이스 모음
    - ORM ?
      : 객체와 관계형 데이터베이스를 매핑한다는 뜻
      2. 자바 어플리케이션에서 관계형 데이터베이스를 사용하는 방식을 정의한 인터페이스
      3. 사용 이유 : 생산성, 유지보수, 패러다임의 불일치 해결, 성능

### JDBC (Java Database Connectivity)

- 데이터베이스와 통신하기 위한 API
- **DB에 접근할 수 있도록 Java에서 제공하는 API**

JDBC 와 JPA 차이점

- JPA 는 JAVA 와 데이터베이스 중 자바 쪽에서 매핑을 하기위한 인터페이스 모음이고
- JDBC 는 자바와 DB 를 연결시켜주는 역할을 한다.

### H2 Hibernate

- H2 데이터베이스는 주로 개발용이나 소규모 프로젝트에서 사용되는 파일 기반의 경량 데이터베이스이다. 개발시에는 H2를 사용하여 빠르게 개발하고 실제 운영시스템은 좀 더 규모있는 DB를 사용하는 것이 일반적인 개발 패턴이다.

### Spring Boot 에서 repository 와 service 의 차이

repository 패키지

- DB에 접근하는 모든 코드가 모여 있는 곳

service 패키지

- 비즈니스 로직과 관련된 모든 코드가 모여있는 곳

⇒ 로직과 관련된 부분에서 트러블 발생시 service 패키지 확인

, DB 접근과 관련된 문제가 발생하면 repository 패키지 확인

### JAVA Spring 3대 주요 개념

- IoC
    - 기존에는 자바 코드를 작성할 때 객체의 생성, 의존관계 설정 등을 개발자가 해줘야 했지만, 프레임워크가 대신해준다는 의미입니다.
- AOP (Aspect Oriented Programming)
    - ***관점 지향 프로그래밍*** 인데 어떤 프로그램에서 핵심 기능이 있다면 부가적인 기능들을 분리해 분리된 기능의 관점에서 기능을 모듈화 하여 설계 및 개발하는 것이다.
    - 핵심 기능과 부가적인 기능들이 분리되어 있기 때문에 핵심 기능의 수정 없이 쉽게 부가 기능을 붙이거나 수정할 수 있고 코드의 재사용성을 높일 수 있다.
    - 핵심기능을 제외한 부수적인 기능을 프레임워크가 제공하는 특징입니다.
- PSA (Portable Service Abstraction)

### lombok

- Java의 라이브러리로 반복되는 메소드를 `Annotation`을 사용해서 자동으로 작성해주는 라이브러리다.
- Getter나 Setter, 생성자 등을 매번 작성해줘야 하는 경우가 많은데 이러한 부분을 자동으로 만들어주는 라이브러리라고 할 수 있다.

### 어노테이션(@)

- **@Data**
    - 모든 필드에 대해 `@ToString`, `@EqualsAndHashCode`, `@Getter`를, 모든 `non-final` 필드에 대해 `@Setter`를 설정하고 `@RequiredArgsConstructor`를 설정해주는 단축 `Annotation`이다.
- ****@RequiredArgsConstructor****
    - 초기화되지 않은 모든 `final` 필드, `@NonUll` 필드에 대한 생성자를 생성해준다.
- ****@NonNull****
    - 메소드나 생성자의 매개변수에 `@NonNull`을 사용하면 lombok이 null check를 해준다.
- ****@ToString****
    - lombok이 `toString()` 메소드를 생성해준다.
    - 기본적으로는 클래스 이름과 각 필드에 대한 값을 `,`으로 구분해서 출력해준다.
- ****@AllArgsConstructor****
    - 모든 필드에 대한 생성자를 만들어준다.
    - `@NonNull` 필드에 대한 null check 구문을 생성해준다.
    - 모든 필드 값을 파라미터로 받는 생성자를 만들어줍니다.
- ****@NoArgsConstructor****
    - 매개변수가 없는 생성자를 생성한다. 불가능 하다면(`final` 필드 떄문에) 컴파일 에러가 난다.
    - 파라미터가 없는 기본 생성자를 생성해준다.
- ****@RequiredArgsConstructor****
    - 초기화되지 않은 모든 `final` 필드, `@NonNull` 필드에 대한 생성자를 생성해준다.
    - `@NonNull` 필드의 경우 null check 구문 또한 생성해준다.
    - `final`이나 `@NonNull`인 필드 값만 파라미터로 받는 생성자를 만들어줍니다.

```
User user1 = new User();   // @NoArgsConstructor
User user2 = new User("dale", "1234");   // @RequiredArgsConstructor
User user3 = new User(1L, "dale", "1234", null);   // @AllArgsConstructor
```

- @RequestMapping
    - @RequestMapping(value=””) 의 형태로 사용하며, URI의 요청과 어노테이션 값이 일치하면 해당 메소드나 클래스가 실행된다.



## 스프링 시큐리티 (Spring Security)

- 스프링 기반의 어플레케이션의 보안(인증과 권한, 인가 등)을 담당하는 스프링 하위 프레임워크 입니다.
- ‘인증’과 ‘권한’에 대한 부분을 Filter 흐름에 따라 처리합니다.
- 접근주체(Principal): 보호된 리소스에 접근하는 대상입니다.

### 용어

- 인증(Authentication) : 해당 사용자가 본인이 맞는지를 확인하는 절차입니다.
- 인가(Authorization) : 인증 된 사용자가 요청한 자원에 접근 가능한지 결정하는 절차입니다.
- 접근 주체(Principal) : 보호받는 자원에 접근하는 대상입니다.
- 비밀번호(Credential) : 자원에 접근하는 대상의 비밀번호
- 권한 : 인증된 주체가 동작을 수행할 수 있도록 허락되어 있는지 결정
- 순서
    - 인증 절차 → 인가 절차 → 인가 과정에서 해당 자원에 대한 접근 권한 확인
    - 인증, 인가를 위해 Pricipal(아이디), Credential(비밀번호) 를 통한 인증 방식 사용

### Form Login 절차

1. 요청 수신
    - 사용자가 form을 통해 로그인 정보가 담긴 Request 를 보낸다.
2. 토큰 생성
    - AuthenticationFilter가 요청을 받아서 UsernamePasswordAuthenticationToken토큰(인증용 객체)을 생성한다.
    - UsernamePasswordAuthenticationToken은 해당 요청을 처리할 수 있는 Provider 를 찾는데 사용한다.
3. AuthenticationFilter로 부터 인증용 객체를 전달 받는다.
    - Authentication Manager 에게 처리를 위임한다.
    - Authentication Manager는 List 형태로 Provider 들을 갖고 있다.
4. Token을 처리할 수 잇는 Authentication Provider 선택
    - 실제 인증을 할 AuthenticationProvider 에게 인증용 객체를 다시 전달한다.
5. 인증 절차
    - 인증 절차가 시작되면 AuthenticationProvider 인터페이스가 실행되고 DB에 있는 사용자의 정보와 화면에서 입력한 로그인 정보를 비교한다.
6. UserDetailsService 의 loadUserByUsername 메소드 수행
    - AuthenticationProvider 인터페이스에서는 authenticate() 메소드를 오버라이딩 하게 되는데 이 메소드의 파라미터인 인증용 객체를 화면에서 입력한 로그인 정보를 가져올 수 있다.
7. AuthenticationProvider 인터페이스에서 DB에 있는 사용자의 정보를 가져오려면, UserDetailsService 인터페이스를 사용한다.
8. UserDetaisService 인터페이스는 화면에서 입력한 사용자의 userName 으로 loadUserByUsername() 메소드를 호출하여 DB에 있는 사용자의 정보를 UserDetails 형으로 가져온다. 사용자가 존재하지 않으면 예외를 던진다. 이렇게 DB에서 가져온 이용자의 정보와 화면에서 입력한 로그인 정보를 비교하고, 일치하면 Authentication 참조를 리턴하고, 아니면 예외를 던진다.
9. 인증이 완료되면 사용자 정보를 가진 Authentication 객체를 SecurityContextHolder에 담은 이후 AuthenticationSuccessHandle를 실행한다. (실패하면 AuthenticationFailureHandler를 실행한다.)

### Filter

1. (UsernamePassword)AuthenticationFilter
    - 아이디와 비밀번호를 사용하는 form 기반 인증
    - 로그인 url로 오는 요청을 감시하며, 유저 인증 처리인 AuthenticationManager 를 통한 인증을 실행합니다.
    - 인증 성공이 되면 인증용 객체를 SecurityContext에 저장 후 AuthenticationSuccessHandler 을 실행합니다. (실패하면 AuthenticationFailureHandler를 실행)
2. AuthenticationProvider
    - 화면에서 입력한 로그인 정보와 DB 정보를 비교합니다.
    - security-context에 provider로 등록한 후 인증절차를 구현합니다.
    - login view 에서 login -processing-url로의 form  action 진행 시 해당 클래스의 supprots() → authenticate() 순으로 인증 절차 진행
3. UserDetailsService
    - DB에서 유저 정보를 가져오는 역할
4. UserDetails
    - 사용자의 정보를 담는 인터페이스로 직접 상속받아 사용합니다.

- **@EnableWebSecurity**
    - Spring Security를 웹 보안 구성을 위해 사용할 때, 이 어노테이션을 사용하여 Spring Security 구성을 활성화할 수 있습니다.
    - configure(WebSecurity)
        - 스프링 시큐리티의 필터 연결을 설정하기 위한 오버라이딩 입니다.
    - configure(HttpSecurity)
        - Http 요청을 보호하는데 사용됩니다.
        - 인터셉터로 요청을 안전하게 보호하는 방법을 설정하기 위한 오버라이딩 입니다.
        - 가장 많이 사용하는 객체
    - configure(AuthenticationManagerBuilder)
        - 사용자 세부 서비스를 설정하기 위한 오버라이딩 입니다.
        - 다양한 인증관리자를 생성해주는 빌더이고 메모리 기반 인증, 데이터베이스 인증 등 다양한 인증 관리자를 생성해줍니다.
- @Secured
    - 메서드나 클래스에 사용되며, 지정된 역할(권한)을 가진 사용자만 해당 메서드나 클래스에 접근할 수 있도록 보호합니다.
- @AuthenticationPrincipal
    - 컨트롤러에서 현재 인증된 사용자의 정보에 쉽게 엑세스할 수 있도록 합니다.




Istio

ex)

- **istio를 도입한 이유**는 service mesh의 장점이 크다고 판단해서인데요,
    - MSA는 여러 서버들의 구성으로 하나의 서비스가 구성되는 구조이자나요
        - 서버들간의 network 처리가 필요하게 되었고, 예전에는 Circuit Breaker, Retry, [fallback](https://velog.io/@sweet_sumin/Fallback) 같은 것들을 애플리케이션단에서 처리를했는데, istio를 도입하게 되면, istio-proxy가 애플리케이션에 Sidecar형태로 붙어서 모든 네트워크를 proxy하게 되는게 큰 장점이라 생각하여 도입을 하게 되었습니다.
        - proxy는 애플리케이션에서 하는 일을 대신할 수 있으니, 애플리케이션의 언어와 상관없이 개별 애플리케이션에서 처리하는 것이 아니라 infra 차원에서, 한번에 해결해 줄 수 있다는 장점이 있습니다
- **트래픽 제어 - istio는 프록시 기반으로 통신하는데, 트래픽 제어도 손쉽게 가능해요**
    - istio는 service에 sidecar로 붙어서 실행되고, iptables을 통해 모든 트래픽을 제어하게 되고, 제어된 트래픽들은 istio-proxy를 통해서 나가게 되고, 받게 되는 구조입니다.
        - 여기서 각 Proxy에 대한 설정 정보를 어떻게 하는지 궁금하실텐대, Proxy에 대한 제어는 중앙 집중화된 Controller가 통제할 수 있도록 설계가 되어져 있습니다.
            - 프록시의 트래픽 설정값에 따라 컨트롤 하는 부분 **Data Plane**이 있고,
            - 프록시들에 설정값을 전달하고 관리하는 컨트롤러 역할을 하는 **Control Plane**이 있습니다.
        - 이렇게 된 구조가 좋은점은 개발 단계에서는 비즈니스 로직에만 집중할 수 있고,
        - 네트워크 통신은 애플리케이션이 아니라, Envoy Proxy간에 이루어지고, 애플리케이션 간 인증/권한도 인프라 레이어에서 지원이 되고,
        - 음.. 그리고 Timeout이나 Retry같은 로직들도 자연스럽게 분리해서 처리가 가능하기 때문에 애플리케이션에 대한 설정값들을 인프라 레이어에서 관리가 가능합니다.
    - istio-proxy는 envoy proxy를 istio에서 wrapping한 것인데, envoy는 탄생 배경중 하나가 ‘**proxy가 어떻게 동작하는지 명확히 보여주자**’ 이다 보니까 많은 통계를 갖고 있는게 장점입니다.
        - Proxy 통신끼리는 Connection pool 동작 방식이다 보니까, 어디에서 Connection이 끊어졌는지 통계로도 확인이 가능하다는 점이 있고요,
        - 이런 통계를 보내는 쪽과 받는 쪽을 합쳐서 보면 어디에 문제가 있었는지 파악하기가 용이합니다.
            - 기존에 네트워크 보내는쪽과 받는쪽을 dump떠서 확인하는 작업을 envoy가 대신해준다고 생각을 하면될 것 같아요, `통계를 통해서 서비스 전체적인 observability가 높아질 수 있어요`
        - Control Plane에 대한 메트릭은 기본적으로 Prometheus라는 오픈 소스 모니터링 시스템을 사용하여 메트릭을 기록하게 되고, 메트릭에 대한 시각화는 Kiali, Grafana를 통해 기본적인 대시보드를 제공한다.

---

# Java

### JVM 메모리 구조

- 자바의 메모리 구조는 `메서드, 힙, 스택, native, pc register` 영역으로 이루어져있습니다.
- 제가 아까 말씀 드린 영역중에 메서드 영역은 생성자 코드나 필드, static 변수 등 `클래스 수준의 정보에` 저장됩니다.
- 힙은 `동적으로 생성된 객체`가 저장되며, `GC` 의 대상입니다.
    - GC를 잠깐 설명 드리자면,

      프로그램을 개발하다보면 유효하지 않은 메모리인 가비지가 발생하는데 이런 메모리들을 JVM의 가비지 컬렉터가 불필요한 메모리를 알아서 정리해줍니다.

- 스택은 `스레드별로 생성`되며, 각 스레드가 공유하지 않습니다. 대표적으로 `매개변수, 지역변수`가 저장됩니다.
    - 프로세스와 스레드의 차이, 멀티 스레드는 어떻게 동작하나
- 자바 8 이전에는 perm gen 영역이 존재했는데, 자바 8 부터 메타스페이스로 변경되었으며, perm gen 영역에 존재하던 static object ,상수들은 heap 영역으로 옮겨져 gc 의 대상이 되었습니다.

### GC ( Garbage Collention) - 가비지 컬랙션

: JVM의 Heap 영역에서 동적으로 할당했던 메모리 영역 중 필요 없게 된 메모리 영역을 주기적으로 삭제하는 프로세스입니다.

- 단점
    - 메모리가 언제 해제되는지 정확하게 알 수 없다.
    - 가비지컬랙션이 동작하는 동안에는 다른동작을 멈추어서 오버헤드가 발생한다.

- ****Mark And Sweep 알고리즘****
    - Mark
        - Root 로 부터 그래프 순회를 통해 연결된 객체들을 찾아내어 각각 어떤 객체를 참조하고 있는지 찾아서 마킹합니다.
    - Sweep
        - 참조하고 있지 않은 객체들을 Heap 에서 제거합니다.
    - Compact
        - Sweep 후에 분산된 객체들을 Heap의 시작 주소로 모아 메모리가 할당 된 부분과 그렇지 않은 부분으로 압축합니다.

### G1GC

- 목적
    - 대용량의 메모리가 있는 멀티 프로세서 시스템을 위해 제작되었다.
    - 빠른 처리 속도를 달성하면서 일시 중지 시간(STW : Stop The World)의 최소화를 충족시키기는 것

### HashCode 값이 모두 같은 경우


### Process
- 단순히 실행 중인 프로그램 입니다.
- 운영체제에 의해 메모리 공간을 할당받아 실행 중인 것 입니다.

### Thread
- 프로세스 내에서 실제로 작업을 수행하는 주체를 의미합니다.
- 모든 프로세스에는 한 개 이상의 스레드가 존재하고 작업을 합니다.
- 쓰레드가 두개 이상이면 멀티쓰레드 라고 합니다.

### 동시성과 병렬성
- 동시성
    - 동시에 같이 실행되는 것 같이 보이는 것
    - 싱글 코어에서 멀티 쓰레드를 동작 시키는 방식
    - 한번에 많은 것을 처리
    - 논리적인 개념
- 병렬성
    - 실제로 동시에 여러 작업이 처리되는 것
    - 멀티 코어에서 멀티 쓰레드를 동작시키는 방식
    - 한번에 많은 일을 처리
    - 물리적인 개념

### JSON**(JavaScript Object Notation)**

- 데이터를 쉽게 **교환, 저장, 전송**하기 위한 텍스트 기반의 데이터 교환 표준 입니다. (텍스트 기반)
- 특징
    - JSON의 형태는 **키(Key)**와 **값(value)**의 쌍으로 이루어져 있는 구조
    - Key와 Value사이에는 **콜론(:)**
    - 여러 데이터를 나열할 경우 **쉼표( , )**를 사용
    - **객체(Object)**는 **중괄호( { } )**로 묶어서 표현하고, **배열(Array)**은 **대괄호( [ ] )**로 묶어서 표현
- JSON.**stringify**(*arg*)는 **객체**를 **문자열**로 변환합니다.
- JSON.**parse**(*arg*)는 **문자열**을 **객체**로 변환합니다.

---

## 형상관리 경험

---

### Database

- Server → DB
- JPA
    - Proxy 거쳐서 DB
    -

---

# 서버 과제

### 1. Request Vacation

**요구 사항**

- 완전히 동작하는 웹 어플리케이션 또는 API 서버를 작성해주세요.
    - 웹 어플리케이션을 작성하는 경우 웹 UI는 평가대상이 아닙니다. CSS를 적용하지 않아도 됩니다.
    - API 서버를 작성하는 경우 일반적인 사용 시나리오에 대한 호출 순서를 스크립트로 작성해주세요.
        - 예) 휴가 취소: 로그인 API 호출 -> 목록 API 호출 -> 휴가 보기 API 호출 -> 휴가 취소 API 호출
- 데이터를 영구히 저장하기 위해 DBMS를 사용해주세요.
    - DBMS : 데이터베이스 관리 시스템
      (DBMS: Database Management System)
    - 데이터베이스에 적재된 데이터 작업을 수행할 뿐만 아니라 데이터베이스를 보호하고 보안을 제공한다.
- 사용가능한 언어: JavaScript / TypeScript / Java / Kotlin

**기능 명세**

- 사용자 모델과 로그인 시스템이 필요합니다.
    - 가입 기능은 없어도 괜찮습니다.
- 사용자에게는 매년 15일의 연차가 부여됩니다.
- 사용자는 연차/반차(0.5일)/반반차(0.25일)에 해당하는 휴가를 신청할 수 있습니다.
- 휴가 신청시 시작일, 종료일(반차/반반차의 경우는 필요없음), 사용 일수, 코멘트(선택 항목)를 입력합니다.
    - 휴가 신청시 남은 연차를 표시합니다.
    - 연차를 모두 사용한 경우 휴가를 신청할 수 없습니다.
    - 추가 기능: 사용 일수를 입력하는 대신 시작일, 종료일을 가지고 공휴일을 제외하고 계산해도 됩니다.
- 아직 시작하지 않은 휴가는 취소할 수 있습니다.



**풀이 과정**

- 사용자 모델이 무엇인지
    - 아이디, 패스워드, 이름, 남은 연차 일수
- 휴가 신청에 대한 정보
    - 휴가를 신청자 아이디, 시작일, 종료일, 사용일수, 코멘트
    - 휴가 기간 얼마나 되는지, 남은 연차 일수 계산
- 휴가 남은 일수를 현재 휴가 일수에 저장
- 휴가 아직 시작안했으면 취소 가능하도록

- domain - User 변수 생성
- 로그인 성공, 실패?
- 휴가 신청
- repository 와 service 의 역할 차이? (위쪽에 정리 완)
    - repository (DB)
        - 휴가신청 시작일, 종료일
        - 사용 일수
        - 코멘트(선택항목)
        - 휴가 신청시 잔여 연차 확인
    - service (서비스 로직)
        - 휴가신청(연차, 반차, 반반차)
        - 시작, 종료일 활용해서 공휴일 제외하고 계산
        - 시작하지 않은 휴가 캔슬 기능
- Test 코드 작성

- ※ 설계를 하는 순서가 어떻게 되는지 ※
    - domain 생성
    - repository 에 인터페이스 생성 → repository 설계
    - service 설계
    - test 코드 설계 ?
