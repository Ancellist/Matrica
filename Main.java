import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int[][] Arr = {{0,0,0},
                       {0,0,0},
                        {0,0,0}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элемент массива");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                Arr[0][0] = sc.nextInt();
                Arr[0][1] = sc.nextInt();
                Arr[0][2] = sc.nextInt();
                Arr[1][0] = sc.nextInt();
                Arr[1][1] = sc.nextInt();
                Arr[1][2] = sc.nextInt();
                Arr[2][0] = sc.nextInt();
                Arr[2][1] = sc.nextInt();
                Arr[2][2] = sc.nextInt();
                int m = (Arr[0][0]*Arr[1][1]*Arr[2][2]) + (Arr[0][1]*Arr[1][2]*Arr[2][0])+(Arr[1][0]*Arr[2][1]*Arr[0][2]) - (Arr[2][0]*Arr[1][1]*Arr[0][2]) - (Arr[1][0]*Arr[0][1]*Arr[2][2])-(Arr[2][1]*Arr[1][2]*Arr[0][0]);
                int m1 = (Arr[0][0]*Arr[1][1]*Arr[2][2]);
                int m2 = (Arr[0][1]*Arr[1][2]*Arr[2][0]);
                int m3 = (Arr[1][0]*Arr[2][1]*Arr[0][2]);
                int m4 = (Arr[2][0]*Arr[1][1]*Arr[0][2]);
                int m5 = (Arr[1][0]*Arr[0][1]*Arr[2][2]);
                int m6 = (Arr[2][1]*Arr[1][2]*Arr[0][0]);
                System.out.println(m);
                System.out.println(m1);
                System.out.println(m2);
                System.out.println(m3);
                System.out.println(m4);
                System.out.println(m5);
                System.out.println(m6);
            }

        }

    }
}