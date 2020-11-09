package ru.job4j.anime;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for(int i = 2; i < data.length; i ++) {
            if (data[i -2] + data[i -1] != data[i]) {
                return false;
            }
        }
        return rsl;
    }
}
   /** Scanner in = new Scanner(System.in);
       int n;
        do { n = in.nextInt();
                } while (n < 1 || n > 40);
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
        arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.print(arr[n]);
        }*/