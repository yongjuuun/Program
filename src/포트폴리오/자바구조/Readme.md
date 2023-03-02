### 자바 프로그램 실행 과정
1. 프로그램 실행시 OS는 필요한 메모리 할당 및 JVM이 메모리를 용도에 따라 나누어 관리
2. 자바컴파일러(javac)에 의해 자바 소스코드(*.java) -> 자바 바이트코드(*.class) 변환
3. Class Loader를 통해 자바 바이트코드(.class)를 JVM 으로 로딩
4. 로딩된 자바 바이트코드(.class)를 Execution engine(Interpreter, JIT Compiler, Garbage Collector)을 통해 해석
5. 해석된 바이트코드는 Runtime Data Areas에 배치 및 작업


### JVM(Java Virtual Machine)
- OS에 종속 받지 않고 CPU가 Java를 인식하고 실행할 수 있도록 하는 가상 기계(컴퓨터) 자바를 실행시킬 수 있는 용도로 사용
- Java Sourcecode(*.java)를 compiler를 통하여 JVM이 인식 할 수 있는 Java Bytecode(*.class)로 변환   
  이후, JIT Compiler에 의해 Binarycode로 변환

> Bytecode : JVM이  이해할 수 있는 언어로 변형된 자바 소스코드  
> Binarycode : 컴퓨터(CPU)가 인식할 수 있는 0과 1로 구성된 이진코드  
> ※ .java -> .class 컴파일 하는 이유 : cpu가 인식 할 수 있도록 변환 하기 위해서


### Execution Engine
- 클래스를 실행시키는 역할
- 바이트코드를 실제로 기계가 실행할 수 있도록 변환

JIT Compiler  
- 바이트코드를 CPU(컴퓨터 프로세서)로 직접 보낼 수 있는 명령어로 바꾸는 프로그램 
  - 특성
    - 프로그램이 시작되고 코드를 컴파일 한 후에 JIT 컴파일러를 실행
    - 실행기만 있으면 번역 가능(실행되는 CPU가 무엇인지 상관없음)
    - 각 행마다 한 단계씩 실행하는 도중 기계어로 변환 되는 Interpreter 보다 빠름
    - 적절한 시점에 바이트코드 전체 컴파일 후 캐시에 보관된 네이티브 코드 실행으로 빠름
  
Interpreter
  - 바이트 코드를 명령어 단위로 실행(느림)

Garbage Collector
  - 동적으로 할당한 메모리 영역 중 사용하지 않는 영역을 탐지하여 해제하는 기능
  - 참조되지 않는 객체를 Heap 영역에서 제거
  - 더 이상 사용되지 않는 인스턴스를 찾아 메모리에서 삭제


### Class Loader
Loading
- *.class 파일들을 JVM 으로 가져옴

Linking
- 링크를 통해 배치하는 작업을 수행하는 모듈

Initialization
- 초기화 작업


### Data Area
- 프로그램을 수행하기 위해 OS 메모리를 할당 받은 공간

Process
- 실행 중인 프로그램
- 하나의 프로세스에는 한 개 이상의 쓰레드가 존재
- 멀티 쓰레드 프로세스 : 두 개 이상의 쓰레드를 갖는 프로세스

Thread
- 프로세스 내에서 실제로 작업을 수행하는 부분
  - PC
    - 각각의 쓰레드 마다 하나씩 존재
    - 현재 수행중인 JVM 주소 보유
  - JVM Stack
    - 메소드 안에 사용 되는 값들을 저장하고, 사용 안할 시에 삭제
    - 연산이 일어나는 값들을 임시로 저장하는 공간
  - Native Method Stack
    - 실제 수행할 수 있는 기계어로 작성된 프로그램을 실행시키는 영역
  - JNI (Java Native Interface)
    - 다른 언어들로 작성된 라이브러리들을 호출하거나 반대로 호출되는 것을 가능하게 하는 프로그래밍 프레임워크
    - 인터페이스 할 수 있는 공간을 통해서 저장할 수 있는 공간
    - 실제로 기계어로 수행하는 공간

Method Area
- 클래스 정보를 처음 공간에 올릴 때, 초기화 된 대상을 저장하기 위한 메모리
  - Runtime Constant Pool
    - Static 영역만 관리하는 별도의 공간
    - 상수 자료형을 저장하고 참고해서 중복을 막는 역할

Static, Instance
- static 존재 = class 소속
  - class 들의 static 이 있는 변수, 메소드들은 인스턴스 내에서 존재하기 보단 class 의 존재하는 것들을 가리킴(연결상태)
- static 미존재 = instance 소속
  - class 의 static 이 없는 변수, 메소드들은 인스턴스 내에서 각각 독립적으로 새로 존재














