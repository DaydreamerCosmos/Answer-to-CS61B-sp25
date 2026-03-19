public class JavaExercises {
    public static void starTriangle() {
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < 5-i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printIndexed(String s) {
        int n = s.length();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            int reverse = n - i - 1;
            System.out.print(c + "" + reverse); // 直接写c+reverse是数值运算，要想变成字符串，中间必须加字符类型的东西.
        }
    }

    public static String stutter(String s) {
        int n = s.length();
        String result = "";
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            result = result + c + "" + c;
        }
        return result; // 注意函数的返回类型是string，要用到return.
    }

    public static int quadrant(int x, int y) {
        if (x > 0 && y > 0){
            return 1;
        }
        else if (x < 0 && y > 0){
            return 2;
        }
        else if (x < 0 && y < 0){
            return 3;
        }
        else if (x > 0 && y < 0){
            return 4;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        starTriangle();
        printIndexed("hello");
        System.out.println();
        System.out.println(stutter("hello"));
        System.out.println(quadrant(3, 4));  // Output: 1
        System.out.println(quadrant(-3, 4)); // Output: 2
        System.out.println(quadrant(-3, -4));// Output: 3
        System.out.println(quadrant(3, -4)); // Output: 4
        System.out.println(quadrant(0, 5));  // Output: 0
    }
}




