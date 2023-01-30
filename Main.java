import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int[][] Arr = {{2,1,1},
                       {1,-1,0},
                        {3,-1,2}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элемент массива");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                int m = Arr[0][0]*Arr[1][1]*Arr[2][2] + Arr[0][1]*Arr[2][1]*Arr[0][2]+Arr[0][1]*Arr[1][2]*Arr[0][2]- Arr[2][0]*Arr[1][1]*Arr[0][2]-Arr[1][0]*Arr[0][1]*Arr[2][2]-Arr[2][1]*Arr[1][2]*Arr[0][0];
                System.out.println(m);
            }

        }
    }
}