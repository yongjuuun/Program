## Java Persistence API

ORM 기술 표준

관계형 데이터베이스를 사용하면, JPA 사용하면 좋다.

### Persistence Context (영속성 관리)
 - 객체와 관계형 데이터베이스 매핑하기
 - 영속성 컨텍스트

entityManager.persist(entity)
 - DB에 저장하는게 아니라 영속성 컨텍스트 entity라는 것을 영속화 한다는 듯
 - DB 가기전에 JpaRepository -> PC(Persistence Context)(저장) -> DB

Collection -> list


### 영속성 컨텍스트의 이점

1차 캐시

영속성 컨텍스는 내부에서 1차 캐시라는 것을 가지고 있다.

최초  
Member findMember = em.find(Member.class, 1L);  
// sql -> DB -> findmember(persistence)

두번째부터  
Member findMember = em.find(Member.class, 1L);  
// pc