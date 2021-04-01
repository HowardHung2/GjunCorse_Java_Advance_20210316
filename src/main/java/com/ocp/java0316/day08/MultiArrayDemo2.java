package com.ocp.java0316.day08;

public class MultiArrayDemo2 {
    public static void main(String[] args) {
        //int [][] m = new int[2][3];
        //int [][] m = new int[][]{ {100, 90, 80},{70, 60, 50} };  //有初始值時new後面[][]無須輸入
        int [][] m ={ {100, 90, 80},{70, 60, 50} };
        System.out.println(m);
        System.out.println(m[0]);
        System.out.println(m[1]);
        // 求總分 = ?
        int sum = 0;  //建立總數 需有初值
        for(int i = 0; i < m.length; i++){
            for(int k =0; k < m[i].length; k++){ //次迴圈要與前迴圈建立關係
                sum+=m[i][k];
            }
        }
        System.out.println(sum);
    }
}
