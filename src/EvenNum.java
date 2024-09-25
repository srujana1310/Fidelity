public class EvenNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6,};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("sum of even numbers are "+sum);
    }
}
