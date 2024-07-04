import java.util.Arrays;
// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class MainFunc {
    public static void main(String[] args) {
//        // 当文本光标位于高亮显示的文本处时按 Alt+Enter，
//        // 可查看 IntelliJ IDEA 对于如何修正该问题的建议。
//        System.out.printf("Hello and welcome!");
//
//        // 按 Shift+F10 或点击间距中的绿色箭头按钮以运行脚本。
//        for (int i = 1; i <= 5; i++) {
//
//            // 按 Shift+F9 开始调试代码。我们已为您设置了一个断点，
//            // 但您始终可以通过按 Ctrl+F8 添加更多断点。
//            System.out.println("i = " + i);
//        }
//        Variable variable =new Variable();
//        variable.TestJavaVariable();

//        //boolean bIsValidParentheses = ValidParentheses.isValid("()");
//        CountBeautifulPairs countBeautifulPairs = new CountBeautifulPairs();
//        int res = countBeautifulPairs.countBeautifulPairs(new int[]{2, 11, 20, 13, 7, 12, 10});
//        System.out.println(res);

//        var maxSlidingWindow = MaxSlidingWindow.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);

//        System.out.println(Arrays.toString(maxSlidingWindow));
        int len= LongestConsecutive.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
        System.out.println(len);
        System.out.println("test create branch ");
    }
}