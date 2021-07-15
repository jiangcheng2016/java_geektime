public class HelloWorld {
//    public static void main(String[] args){
//        System.out.println("Hello World");
//    }

    public static int sub(int[] arrays) {
        int max = 0;
        if (arrays.length == 0 || arrays.length == 1) {
            return 0;
        }
        if (arrays.length == 2) {
            return arrays[arrays.length - 1] - arrays[0];
        }
        int n = arrays.length;
        // 代表当时max 下标。
        int index  = 0;
        for (int i = 0; i < n; i++) {
            for (int j = index; j < i; j++) {
                int sub = arrays[i] - arrays[j];
                if (max < sub) {
                    max = sub;
                    index  = j;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arrays = {8, 14, 7, 11, 5, 7, 27, 6, 18};
        int sub = sub(arrays);
        System.out.println("the max sub is : " + sub);

    }
}
