package 포트폴리오.Generic;

class ClassName<E> {
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }

    <T> T genericMethod(T o) { //제너릭 메소드
        return o;
    }
}

public class Test1 {
    public static void main(String[] args) {

        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get());
        //반환된 변수의 타입 출력
        System.out.println("a E type : " + a.get().getClass().getName());

        System.out.println();
        System.out.println("b data : " + b.get());
        //반환된 변수의 타입 출력
        System.out.println("b E type : " + b.get().getClass().getName());

        //제너릭 메소드 Integer
        System.out.println("<T> return Type : " + a.genericMethod(3).getClass().getName());

        //제너릭 메소드 String
        System.out.println("<T> return Type : " + a.genericMethod("ABCD").getClass().getName());

        //제너릭 메소드 ClassName b
        System.out.println("<T> return Type : " + a.genericMethod(b).getClass().getName());

    }
}