package BAEKJOON;

import java.util.Scanner;

public class BAEK_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int king = sc.nextInt();
        int queen = sc.nextInt();
        int look = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();
        System.out.println(1-king);
        System.out.println(1-queen);
        System.out.println(2-look);
        System.out.println(2-bishop);
        System.out.println(2-knight);
        System.out.println(8-pawn);
    }
}
