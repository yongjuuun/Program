[2023-01-03]  
### 프로그래머스_Lv2_짝지어 제거하기
1. 최초 풀이(테스트 코드 통과, 효율성 테스트 실패)
   - while 문 사용
   - split 사용 문자 비교
   - 문자 비교에 따른 left, right count 비교로 풀이 

2. 개선
   - Stack(push, pop, empty) 사용 풀이
   - charAt() 사용으로 문자 비교


### 프로그래머스_Lv2_짝지어 제거하기
1. 최초 풀이(테스트 코드 통과, 효율성 테스트 실패)
   - StringBuffer 사용
   - 두번째 문자열부터 문자열 두개 비교 후 문자 제거

2. 개선
   - Stack(push, pop, empty) 사용 풀이
   - 문자열 길이 불충족시 초기 리턴 추가


### 프로그래머스_Lv2_튜플
1. 풀이 방법(사용 메소드 참고 풀이, 차후 재풀이 필요)
   - 입력받은 문자열 s를 분리하기 위하여 replaceAll 정규식, 공백제거 trim 사용
   - sort 사용하여 배열의 길이 순으로 정렬
   - ArrayList 에 먼저 나오는 숫자 순서대로 입력
   - ArrayList -> int 배열 변환

2. 개선
   - ArrayList 에서 int 배열로 값 옮기는 과정에서 불필요한 for 문 사용
   - ArrayList 에 값을 넣어 주는 부분에서 바로 answer 에 값 입력 하도록 수정


### 프로그래머스_Lv2_기능 개발
1. 풀이 방법(사용 메소드 참고 풀이, 차후 재풀이 필요)
   1. progresses 의 요소들이 배포 될 수 있는 날짜를 계산 후 Deque 에 저장
      - 남은 날짜 = (100 - progresses) / speeds
      - ex) progresses = 40, speeds = 60 => 남은 날짜 = 1일
      - Math.ceil 을 사용하여 결과값에 대하여 정수형으로 올림 처리
   
   2. while 문 사용해서 Deque 에 값이 비어있을 때 까지 반복문 실행
      - day 에 Deque poll 값을 넣어준다
      - day 값이 다음 Deque peek 값의 이상이면 배포되는 수인 count 를 올려주고 Deque peek 한 값을 poll 한다.
      - ArrayList 에 count 값을 추가

   3. ArrayList 에 저장 된 값을 int[] answer 배열에 저장 후 출력
     
2. 자료 구조 사용 이유
   1. Math.ceil
      - 나눈 결과가 소수점이 나올시 올림을 해주지 않으면 남은 날짜가 -1 값이 된다
   2. Deque
      - 저장된 앞의 값 부터 가져오기, 삭제하며 남은 배포 count 를 세기 위해 사용

3. 개선할 점
   1. ArrayList 에 값을 저장 후 answer 에 값을 넣기 위해 for 문을 한번더 사용함으로 인해 저장공간, 효율성 낭비



### 프로그래머스_Lv2_N^2 배열 자르기
1. 풀이 방법
   - answer 배열을 큰값에서 작은값을 뺀 후 + 1을 한 값으로 크기 지정
   - 행의 값에 행열의 크기인 n 값을 나눈 값을 입력
   - 열의 값에 행열의 크기인 n 값을 나눈 값의 나머지를 입력
   - 행, 열 중 큰 수를 answer 배열에 입력


### 프로그래머스_Lv2_프린터
1. 풀이 방법
   - 