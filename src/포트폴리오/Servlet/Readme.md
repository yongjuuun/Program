### Servlet 컨테이너
:자바 서블릿을 호스팅 하는 환경

동작 과정
1. HTTP Request 수신
2. Servlet 컨테이너로 전달
3. 서블릿이 컨테이너에 없다면 Servlet 컨테이너가 동적으로 검색
4. 최초 실행시 초기화 작업
5. Request 에 데이터를 읽고 생성
6. 리턴된 값들을 Response

Servlet(Servlet)
- Dynamic Web Page 를 만들 때 사용되는 자바 기반의 웹 어플리케이션 프로그래밍 기술
- 웹 요청과 응답의 흐름을 간단한 메서드 호출만으로 체계적으로 다룰 수 있게 해주는 기술

WAS(Web Application Server)
- 웹 서버와 웹 컨테이너의 결합  
  (웹 컨테이너 : 클라이언트의 요청이 들어왔을 때, 내부의 프로그램을 통해 결과를 만들고 다시 클라이언트에게 전달)

Apache = Web Server
- 정적인 데이터 처리

Tomcat = WAS
- 동적인 데이터 처리
- 클라이언트에서 요청이 들어왔을 때, 동적인 파일이 들어오면 톰캣이 컴파일 후 전달  
  (정적인 파일은 Apache 처리)

=> 차이점 : 컨테이너 기능의 유무 (정적처리 / 동적처리)


### 소켓
- 클라이언트와 서버가 통신하기 위해 필요
- 네트워크 상에서 수행되는 두 프로그램 간의 양방향 통신 링크의 한쪽 끝 단을 의미
- 소켓은 특정 포트 번호와 연결되어 있음

클라이언트 - 서버 연결
1. 서버는 서버 소켓으로 들어오는 연결 요청을 대기
2. 클라이언트가 서버에게 연결 요청
3. 서버가 연결 요청 수락 후 새로운 소캣을 만들고 클라이언트와 연결 생성


### FrontController
- Servlet 컨테이너의 제일 앞에서 서버로 들어오는 클라이언트의 모든 요청을 받아서 처리해주는 컨트롤러
  - 한 곳에서 모든 사용자의 요청을 컨트롤 가능
  - ex) 인코딩 처리, 에러페이지 처리, 공지 등


### RequestDispatcher
- a.html 에 들어온 b.html 을 덮어서 페이지간의 데이터 요청을 가능하게 해주는 기능


### Dispatcher Servlet
- 모든 요청을 한 곳에서 받아서 필요한 처리 후,  
  요청에 맞는 handler 로 요청을 Dispatch 하고,  
  해당 handler 의 실행 결과를 http Response 형태로 만드는 역할

처리 과정
1. 클라이언트 요청을 디스패쳐 서블릿이 수신
2. 요청 정보를 통해 위임할 컨트롤러를 찾음
3. 요청을 컨트롤러로 위임할 핸들러 어댑터를 찾아서 전달
4. 핸들러 어댑터가 컨트롤러로 요청 위임
5. 비즈니스 로직 처리
6. 컨트롤러가 반환
7. 핸들러 어댑터가 반환값 처리
8. 서버의 응답을 클라이언트로 변환


#### ApplicationContext(스프링 컨테이너)
- Dispatcher Servlet 에 의해 생성되어지는 수 많은 객체 관리가 필요한 곳에서 ApplicationContext  접근하여 필요한 객체를 가져올 수 있음

 - IOC(Inversion of Control)
   - 객체를 직접 생성시 레퍼런스 변수 관리 어려움으로 인해 스프링이 해당 객체 관리
   - 장점
     1. 객체간의 결합도를 줄임
     2. 가독성 및 코드 중복, 유지 보수 수월

 - DI(Dependency Injection)
   - 의존관계 주입기능
   - 객체를 직접 생성하는 것이 아니라 외부에서 생성한 후 주입 시켜주는 방식

 - ApplicationContext : root-context
   - 모든 context 에서 사용 가능(공유 가능)
   - root context 는 servlet context 참조 불가
   - Service, Repository 등 스캔(로딩) 하고 DB 관련 객체 생성
   
 - WebApplicationContext : servlet-context
   - 해당 context 에서만 사용 가능
   - 웹과 관련된 객체 생성
   - Dispatcher Servlet 이 직접 사용하는 컨트롤러 등 웹관련 빈을 등록할 때 사용
   - servlet-context 는 root-context 참조 가능

> 우선순위는 servlet-context 우선