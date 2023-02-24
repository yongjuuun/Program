package 알고리즘.etc.GunTest;

public class GunGame {
    public static void main(String[] args) {

        Gun gun = new Gun("ShotGun");
        gun.fire();

        K1 k1 = new K1("K1");
        k1.fire();

        System.out.println(gun.bulletCount);
        System.out.println(k1.bulletCount);
    }
}
