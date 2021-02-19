package com.codewithmosh.datastructures.arrays;

public class DynamicArray {
    private int[] array;
    private int count = 0;

    public DynamicArray(int size) {
        array = new int[size];
    }

    public void add(int item){
        if(count==array.length){
            int[] newArray = new int[array.length*2];
            for(int i=0; i<array.length; i++)
                newArray[i] = array[i];
            array = newArray;
        }
        array[count++] = item;
    }

    public void removeAt(int index) {
        if(index<0 || index>=count)
            throw new ArrayIndexOutOfBoundsException();
        for(int i=index; i<count; i++){
            array[i] = array[i+1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i=0; i<count; i++) {
            if(array[i]==item)
                return i;
        }
        return -1;
    }

    public void print() {
        for(int i=0; i<count; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
