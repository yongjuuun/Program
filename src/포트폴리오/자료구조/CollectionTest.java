package 포트폴리오.자료구조;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> c1 = new HashSet<>();
        Collection<String> c2 = Arrays.asList("three", "four");

        // 컬렉션 데이터 추가
        c1.add("one");
        c1.addAll(c2);

        System.out.println(c1);

        // 컬렉션 삭제
        c1.remove("one");
        System.out.println(c1);

        c1.remove("c2");

        c1.clear();
        System.out.println(c1);

        // 컬렉션 데이터 확인 및 변환
        c1.isEmpty();
        c1.contains("four");

        c1.containsAll(c2);

        System.out.println(c1.contains("four"));
        System.out.println(c1.contains("one"));

        // Data 크기
        int size = c1.size();

        Object[] convertedObject = c1.toArray();


        // 컬렉션 데이터의 사용
        // 1. 배열로 변환해서 for

        for (String s : c1) {
            System.out.println(s);
        }

        // 특정 위치의 데이터를 직접 다루고자 한다면
        String[] convertedString = c1.toArray(new String[c1.size()]);

        for (int i=0; i < convertedString.length; i++) {
            System.out.println(convertedString[i]);
        }


        // 2. iterator
        // Collenction 인터페이스는 interable 인터페이스를 상속 받고 있다.

        Iterator iter = c1.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        // 3. foreach를 사용
        // lambda 문법 -> java8 이후

        c1.forEach(s -> System.out.println(s));



    }
}
