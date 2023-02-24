package 알고리즘.etc.GunTest;

public class Gun {
    String model;
    int bulletCount;

    public void fire() {
        System.out.println(model + " =>");
        bulletCount -= 1;
    }

    public Gun(String model) {
        bulletCount = 10;
        this.model = model;
    }
}
