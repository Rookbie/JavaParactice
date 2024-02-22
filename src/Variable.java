import java.util.Arrays;
public class Variable
{
    /**
     * 测试Java变量
     */
    public void TestJavaVariable()
    {
        // TODO: 添加核心代码逻辑
        // 基本数据类型
        boolean boolVar = true;
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        float floatVar = 123.45f;
        double doubleVar = 1234567890.12345;
        char charVar = 'A';
        charVar = 24;

        // 引用类型 - String
        String strVar = "Hello, World!";

        // 引用类型 - 自定义类
        class CustomClass {
            String name;
        }
        CustomClass customObj = new CustomClass();
        customObj.name = "Custom Object";

        // 数组类型
        int[] arrayVar = {1, 2, 3, 4, 5};

        // 枚举类型
        enum Color {RED, GREEN, BLUE}
        Color colorVar = Color.RED;

        // 打印所有变量
        System.out.println("Boolean: " + boolVar);
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("String: " + strVar);
        System.out.println("Custom Class: " + customObj.name);
        System.out.println("Array: " + Arrays.toString(arrayVar));
        System.out.println("Enum: " + colorVar);
    }
    public static void quickSort(int[] array, int low, int high) {
        if (array == null || array.length == 0)
            return;

        if (low >= high)
            return;

        // 选择第一个元素作为基准值
        int pivot = array[low];
        int i = low;
        int j = high;

        while (i < j) {
            // 从右向左找到第一个小于或等于基准值的元素
            while (i < j && array[j] > pivot) {
                j--;
            }
            // 将该元素放到左边的位置
            if (i < j) {
                array[i++] = array[j];
            }

            // 从左向右找到第一个大于基准值的元素
            while (i < j && array[i] <= pivot) {
                i++;
            }
            // 将该元素放到右边的位置
            if (i < j) {
                array[j--] = array[i];
            }
        }

        // 将基准值放到正确的位置（即i和j相遇的位置）
        array[i] = pivot;

        // 对基准值左右两边的子数组进行递归排序
        quickSort(array, low, i - 1);
        quickSort(array, i + 1, high);
    }

    // 调用快速排序的入口函数，处理整个数组
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }


}
