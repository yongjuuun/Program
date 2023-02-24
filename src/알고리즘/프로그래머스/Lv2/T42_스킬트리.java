package 알고리즘.프로그래머스.Lv2;

import java.util.*;

public class T42_스킬트리 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        int answer = 0;

        String[] sp = skill.split("");
        ArrayList<String> skillSeq = new ArrayList<>(List.of(sp));

        for (int i = 0; i < skill_trees.length; i++) {
            String[] sp2 = skill_trees[i].split("");
            ArrayList<String> alSkill = new ArrayList<>(List.of(sp2));

            ArrayList<Integer> removeIdx = new ArrayList<>();
            for (int j = 0; j < alSkill.size(); j++) {
                if (!skillSeq.contains(alSkill.get(j))) {
//                    alSkill.remove(j);        // 여기서 바로 remove 하면 밀림
                    removeIdx.add(j);
                }
            }

            // # alSkill 에서 필요 없는 부분을 지우기 위해 remove 를 반복문써서 하면 앞에께 먼저 사라지고 인덱스 밀리면서 오류 발생

            // 진짜 이상한 부분 -> 4를 바로 넣어서 하면 삭제되고, 식 넣어서 하면 삭제가 안됨
            for (int j = removeIdx.size() - 1; j >= 0; j--) {
                alSkill.remove(removeIdx.get(j));       // 이렇게 하면 alSkill 가 삭제 되어야 하는데 그대로?
//                alSkill.remove(4);
            }

            int count = 0;
            for (int j = 0; j < alSkill.size(); j++) {
                if (!alSkill.get(j).equals(skillSeq.get(j))) {
                    break;
                } else {
                    count++;
                }
            }

            if (count == alSkill.size()) {
                answer++;
            }
        }

        System.out.println(answer);

//        for (String x : skillSeq) {
//            System.out.println(x);
//        }


    }
}
