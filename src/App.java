public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int num = 10;
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(num);
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
