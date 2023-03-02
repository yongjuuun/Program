## 웹 애플리케이션 개발

1. 스프링 프로젝트 생성
2. 스프링 부트로 웹 서버 실행
3. 회원 도메인 지식을 익히고 개발
4. 웹 MVC 패턴 개발
5. DB 연동 - JDBC, JPA
6. 테스트 케이스 작성


## Skill

프레임워크 : Spring Boot (Version : )  
빌드 툴킷 : Gradle  
DB 연동 툴 : JPA, Hibernate
웹 서버 : Tomcat
웹 템플릿 엔진 : Thymeleaf
언어 : JAVA 11


## 라이브러리

- spring-boot-starter-tomcat : 웹서버
- spring-webmvc

spring-boot-starter-thymeleaf  
spring-boot-starter
- spring-boot
  - spring-core
- spring-boot-starter-login
  - logback, slf4j


service : 비즈니스 로직을 만들어주는 부분  
repository : 데이터베이스에 접근해서 데이터를 가져오는 부분


## thymeleaf

1. 정적컨텐츠
- 스프링부트 프로젝트를 생성하면 자동으로 resources / static 경로 생성
- 경로의 파일 요청시 우선순위 컨트롤러에서 매핑 검색 후 결과가 없으면 정적 컨텐츠 검색 후 반환


- ※ 동작과정 ※  
웹 브라우저   
-> localhost:8080/hello  
-> **내장 톰캣 서버  
-> 스프링 컨테이너(1 helloController 2 hello(model)  
-> viewResolver)**   
-> viewResolver(templates/hello.html)   
-> html   
-> 웹 브라우저


2. MVC (Model View Control)
: 하나의 서비스에서 관심사들을 나누는 방법

- Model : 도메인
- View : Front 담당
- Controller : 비즈니스 로직
- viewResolver 가 template 안에서 해당 파일을 찾아서 템플릿 엔진이 Model 로 받은 값(name:spring)을 렌더링해서 변환 후 반환


- ※ 동작과정 ※  
@RequestParam  
locathost:8080/hello-mvc   
-> 톰캣  
-> HelloMVCController -model(name)  
-> hello-template  (View Resolver)  
-> html 변환 후 localhost 로 변환


3. API
- @ResponseBody
  - 해당 어노테이션을 컨트롤러에 붙혀주면 http 프로토콜의 response body 영역에 값을 바로 넣어준다는 의미
  - view 가 존재하지 않고, 페이지 이동도 없음
- http body에 문자 내용 직접 반환
- view Resolver 대신 HttpMessageConverter 동작
- 기본 문자처리는 StringHttpMessageConverter 를 사용하지만 객체가 반환되면 MappingJacson2HttpMessageConverter 동작
- byte 처리 등등 여러 HttpMessageConverter 가 기본으로 등록 


- ※ 동작과정 ※  
@RequestParam  
locathost:8080/hello-api   
-> 톰캣  
-> HelloMVCController -model(name)  
-> View Resolver(x)  
-> html 변환 후 localhost 로 변환


저장소
- MySQL, PostgreSQL, Redis, etc


웹 애플리케이션 계층 구조

(컨트롤러 -> 서비스 -> 레포지토리) -> DB
- 맴버 도메인을 모두 참조한다


controller : 웹 MVC의 컨트롤러 역할  
service : 핵심 비즈니스 로직 구현  
repository : 데이터베이스에 접근, 도메인 객체를 DB에 저장  
도메인 : 비즈니스 도메인 객체  

MemberService -> MemberRepository(interface) -> MemoryMemberRespository
                                             -> JDBC
                                             -> Hibernate


[서비스]
요구사항에 맞게 서비스 테스트 코드 작성
