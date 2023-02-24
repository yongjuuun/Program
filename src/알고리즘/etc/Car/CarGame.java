package 알고리즘.etc.Car;

public class CarGame {
    public static void main(String[] args) {

        Cars carsTesla = new Cars();
        carsTesla.setColor("red");
        carsTesla.setModel("Model Y");
        carsTesla.setMaker("Tesla");
        carsTesla.setPower(210);
        carsTesla.go();

        Cars Genesis = new Cars("blue", "GV80", "Genesis", 190);
        Genesis.go();

    }

}
