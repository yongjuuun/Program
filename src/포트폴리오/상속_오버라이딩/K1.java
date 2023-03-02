package 포트폴리오.상속_오버라이딩;

public class K1 extends Gun {

    public void fire() {
        System.out.println(model + " => => => => =>");
        bulletCount -= 5;
    }

    public K1(String model) {
        super(model);
        bulletCount = 50;
    }
}

// 총을 쏘면 연발로 5발씩 쏨
// 기본 총알탄이 50개가 장전
