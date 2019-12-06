public class Sevens {
    public static String sevenBoom(int[] arr) {
        //String number = "";
        int count = 0;
//        for(int i = 0; i < arr.length; i++) {
//            number += arr[i];
//        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 7)
                count++;
        }

        if(count != 0)
            return "Boom!";

        return "there is no 7 in the array";
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3};
        int[] arr2 = {2,3,7,4};
        System.out.println("arr1: " + sevenBoom(arr1));
        System.out.println("arr2: " + sevenBoom(arr2));

    }
}
