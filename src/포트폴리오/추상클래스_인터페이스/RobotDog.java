package 포트폴리오.추상클래스_인터페이스;

public class RobotDog extends Robot implements Pet {

    @Override
    void move() {
        System.out.println("child move");
    }

    @Override
    void charging() {
        System.out.println(getName() + " : charging");
    }

    @Override
    public void bark() {
        System.out.println("woof woof");
    }

    public static void main(String[] args) {
        RobotDog rd = new RobotDog();

        rd.setName("dog");
        rd.bark();
        rd.move();
        rd.charging();


    }
}