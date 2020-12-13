package week5;

//https://www.youtube.com/watch?v=P3YID7liBug
public class BinarySearchRecursive {
    public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right)
            return false;

        int mid = left + ((right-left)/2);
        if (array[mid] == x)
            return true;
        else if (x<array[mid])
            return binarySearchRecursive(array, x, left, mid-1);
        else
            return binarySearchRecursive(array, x, mid+1, right);
    }

    public static boolean binarySearchRecursive(int[] array, int x){
        return binarySearchRecursive(array, x, 0, array.length-1);
    }

    public static void main (String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int x = 5;
        System.out.println(binarySearchRecursive(arr, x));

    }
}
