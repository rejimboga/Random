package rejimboga;

import java.util.*;

public class rejimboga {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random random = new Random();

        for (int s = 1; s < a.length; s++){
            a[s] = random.nextInt();

            System.out.println(a);

            long sum = 0;
            for (s = 1; s < a.length; s++){
                if (1 <= a[s] <= 9) {
                    sum += a[s];
                    System.out.println("Сума = " +sum);
                }
            }
        }
    }
}