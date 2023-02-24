package 알고리즘.etc.GunTest;

public class K1 extends Gun{

    public void fire() {
        System.out.println(model + " => => => => =>");
        bulletCount -= 5;
    }

    public K1(String model) {
        super(model);
        bulletCount = 50;
    }
}
