package week5;

//https://www.youtube.com/watch?v=P3YID7liBug
public class BinarySearchIterative {

    public static boolean binarySearchIterative(int[] array, int x) {
        int left = 0; int right = array.length-1;
        while(left<=right){
            int mid = left + ((right-left)/2);
            if (array[mid] == x)
                return true;
            else if (x<array[mid])
                right = mid-1;
            else
                left = mid+1;
        }
        return false;
    }

    public static void main (String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int x = 52;
        System.out.println(binarySearchIterative(arr, x));
    }
}