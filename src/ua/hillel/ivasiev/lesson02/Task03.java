/*Создать массив размером n, элементами, которого будут числа от n до 1.*/

package ua.hillel.ivasiev.lesson02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int massive [] = new int [n];
        for (int i = 0; i < massive.length; i++){
            massive [i] = (n+1) - i - 1;
            System.out.print(massive[i] + " ");
        }
    }
}
