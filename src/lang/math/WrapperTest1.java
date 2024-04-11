package lang.math;

import java.util.Arrays;
import java.util.Random;

public class WrapperTest1 {
    public static void main(String[] args) {
//        String str1 = "10";
//        String str2 = "20";
//
//        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
//        System.out.println("sum = " + sum);
        
//        String[] array = {"1.5", "2.5", "3.0"};
//
//        double sum = Arrays.stream(array).mapToDouble(Double::parseDouble).sum();
//        System.out.println("sum = " + sum);
//
//        String str = "100";
//        Integer i1 = Integer.valueOf(str);
//        int i2 = i1.intValue();
//        Integer i3 = Integer.valueOf(i2);
        
        Random random = new Random();
        int[] lottiNumbers = new int[6];
        boolean ok = true;
        while (ok) {
            for (int i = 0; i <lottiNumbers.length ; i++) {
                lottiNumbers[i] = random.nextInt(45) + 1;
            }
            long count = Arrays.stream(lottiNumbers).distinct().count();
            if (count == 6) {
                ok = false;
            }
        }
        System.out.println(Arrays.toString(lottiNumbers));
        
        
        
    }
}
