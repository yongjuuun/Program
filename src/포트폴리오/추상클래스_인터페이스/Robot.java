package 포트폴리오.추상클래스_인터페이스;

public abstract class Robot {
    private String name;

    void move() {
        System.out.println(name + " : 추상클래스_인터페이스.Robot move");
    }

    abstract void charging();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
