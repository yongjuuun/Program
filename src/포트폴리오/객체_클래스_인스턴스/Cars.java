package 포트폴리오.객체_클래스_인스턴스;

public class Cars {
    private String color;
    private String model;
    private String maker;
    private int power;
    private int curSpeed;

    public Cars() {
        curSpeed = 0;
    }

    public Cars(String color, String model, String maker, int power) {
        curSpeed = 0;
        this.color = color;
        this.model = model;
        this.maker = maker;
        this.power = power;
    }

    public void go() {
        if (power > 200) {
            curSpeed += 230;
        } else {
            curSpeed += 170;
        }
        System.out.println(maker + " " + curSpeed + " " + color + " " + power);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setPower(int power) {
        this.power = power;
    }
}