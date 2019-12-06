public class Sevens {
    //arrays
    public static String sevenBoom(int[] arr) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 7)
                count++;
        }

        if(count != 0)
            return "Boom you have a 7!";

        return "Error... there is no 7 in the array";
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3};
        int[] arr2 = {2,3,7,4};

        //test the arrays
        System.out.println("arr1: " + sevenBoom(arr1));
        System.out.println("arr2: " + sevenBoom(arr2));

    }
}
