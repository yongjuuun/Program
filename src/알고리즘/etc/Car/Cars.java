package 알고리즘.etc.Car;

public class Cars {
        private String color;
        private String model;
        private String maker;
        private String tire;
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
                } else if (power <= 200) {
                        curSpeed += 170;
                }
                System.out.println(maker +" "+ curSpeed+" "+color+" "+power);
        }

        public void init() {

        }

        public void stop() {
                curSpeed = 0;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public String getMaker() {
                return maker;
        }

        public void setMaker(String maker) {
                this.maker = maker;
        }

        public String getTire() {
                return tire;
        }

        public void setTire(String tire) {
                this.tire = tire;
        }

        public int getPower() {
                return power;
        }

        public void setPower(int power) {
                this.power = power;
        }

        public int getCurSpeed() {
                return curSpeed;
        }

        public void setCurSpeed(int curSpeed) {
                this.curSpeed = curSpeed;
        }
}
