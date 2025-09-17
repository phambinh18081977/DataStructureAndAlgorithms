
public class _1295_Find_Numbers {

    public static int findNumber(int[] nums) {

        int counter = 0;

        for (int a : nums) {

            int result = checkNumber(a);
            if (result % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int checkNumber(int a) {

        int counter = 0;
        int result = a;

        while (result != 0) {
            result = a / 10;
            a = result;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {

        int[] nums = {12222, 2222, 3254, 444444};
        System.out.println(findNumber(nums));

    }

}
