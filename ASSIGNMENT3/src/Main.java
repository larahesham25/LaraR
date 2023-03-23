import java.util.ArrayList;
import java.util.Scanner;
/*Write the following method that returns the maximum value in an ArrayList of integers. The method
        returns null if the list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list)*/
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer>arr=new ArrayList<>();
        Scanner objscaner=new Scanner(System.in);
        int num = objscaner.nextInt();
        while(num!=0)
        {
            arr.add(num);
            num=objscaner.nextInt();
        }
        System.out.println("max numb is "+max(arr));
        System.out.println("after sorting");
        sort(arr);
        System.out.println(arr);

    }
    public static Integer max(ArrayList<Integer> list)
    {
        if(list.size()==0)
            return null;
        else {
            Integer max = list.get(0);

            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > max)
                    max = list.get(i);
            }

            return max;
        }
    }
   /* Write the following method that sorts an ArrayList of numbers:
    public static void sort(ArrayList<Integer> list)*/

    public static void sort(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = list.get(i);
            int index = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (min > list.get(j)) {
                    min = list.get(j);
                    index = j;
                }
            }

            if (index != i) {
                list.set(index, list.get(i));
                list.set(i, min);
            }
        }

    }

    }



