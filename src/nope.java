public class nope {
    public static void main(String[] args) {
        int n = 2;
        String[] words = {"qwe", "eqwe", "eqwe"};

        int[] answer = new int[2];  // [번호, 차례]
        int i = 0;
        StringBuffer dup = new StringBuffer();

        while (i != words.length) {
            String s1 = words[i - 1];
            String s2 = words[i];
            if (i != 0) {
                if (s2.length() <= 1) {
                    break;
                }

                String x = dup.toString();
                String y = s2.toString();

                if (x.contains(y)) {
                    break;
                }

                if (i >= 1) {
                    if (s2.charAt(0) != s1.charAt(s1.length() - 1)) {
                        break;
                    }
                }
            }

            dup.append(s2);
            dup.append(" ");

            i++;
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }

}

