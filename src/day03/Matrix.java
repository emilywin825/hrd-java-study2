package day03;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int korScore = 10;
        int mathScore = 30;
        int engScore = 30;

        int[] kimScores ={korScore,mathScore,engScore};
        int[] parkScore={100,34,99};
        int[] hongScore={10,100,11};

        //2차원 배열
        int[][] classScores={kimScores, parkScore, hongScore};

        System.out.println(classScores[0][0]);
        System.out.println(kimScores[0]);

        System.out.println(classScores[1]); //[I@48140564
        System.out.println(parkScore); //[I@48140564

        System.out.println(Arrays.deepToString(classScores));

        //2차원배열의 값 초기화
        int[][] arr2d={
                {10,20,30},
                {40,50,60},
                {70,80,90},
                {100,200,300},
        };
        System.out.println("=====================");
        System.out.println(arr2d[1][2]);

        //2차원 배열 순회
        for(int[] arr : arr2d){
            for(int n : arr){
                System.out.printf("%3d ",n); //3d : 출력할 때 3칸 차지해라!
            }
            System.out.println();
        }

        //배열의 기본값
        //정수배열은 0이 기본값, 실수는 0.0이 기본값, 
        // 논리는 거짓이 기본, char 배열은 기본값이 공백
        // 그 나머지는 전부 null
        double[] numbers = new double[5];
        System.out.println("====================");
        boolean[] falsee = new boolean[5];

        //5행 4열의 정수 2차원배열을 생성만 하고 싶다.
        int[][] arr = new int[5][4];
        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                System.out.printf("%3d ",anInt);
            }
            System.out.println();
        }

        //2차원 배열의 수정
        //array2d 2행 4열 값 수정
        int[][] array2d = new int[2][4];

        array2d[1][3] = 99;

        for (int[] ints : array2d) {
            for (int anInt : ints) {
                System.out.printf("%3d ",anInt);
            }
            System.out.println();
        }

        //3차원 배열
        int[][][] arr3d = {
                {
                        {10,20},
                        {30,40}
                },
                {
                        {50,60},
                        {70,80}
                },
                {
                        {90,100},
                        {300,400}
                },
        };

        System.out.println(arr3d[1][0][1]);
    }
}
