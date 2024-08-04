public class Finally {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 7;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}