package TA_Lab;

public class SelectionSort implements Sorter{
    @Override
    public int[] Sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
