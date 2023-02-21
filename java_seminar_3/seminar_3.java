package java_seminar_3;

import java.util.ArrayList;

public class seminar_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        fillArrayList(numbers);
        averageMinAndMax(numbers);
        deleteEven(numbers);
    }
    static public void fillArrayList(ArrayList<Integer> array){
        for (int i = 0; i < 10; i++){
            int num = (int) (Math.random()*11);
            array.add(num);
        }
        System.out.println(array);
    }
    static public void averageMinAndMax(ArrayList<Integer> arr){
        int min = arr.get(0);
        int max = arr.get(0);
        int sum = 0;
        for (Integer num: arr){
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
            sum += num;
        }
        double aver = (double) sum/(double) arr.size();
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("average = " + aver);
    }
    static public void deleteEven(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i)%2 == 0){
                nums.remove(nums.get(i));
                i--;
            }
        }
        System.out.println(nums);
    }
}
