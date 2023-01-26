package 알고리즘.프로그래머스.Lv2;

public class T32_타겟넘버_2 {
    static int[] numbers = {1, 1, 1, 1, 1};
    static int target = 3;
    static int answer = 0;

    public static void main(String[] args) {
        dfs(0, 0);

        System.out.println(answer);
    }

     public static int dfs(int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return answer;
        }

        // O(2^N)
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);

        return answer;
    }

}
