public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        String s = "hello world";

        System.out.println(s + "hello world");
        Solution solution = new Solution();
        System.out.println("最大的可达数字为：" + solution.theMaximumAchievableX(3, 2));
    }
}
