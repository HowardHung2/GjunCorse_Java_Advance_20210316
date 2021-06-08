package com.ocp.java0316.day28;

/*
Checked Exception: 受檢例外
Unchecked Exception: 非受檢例外(Error, RuntimeException) 一遇到不是立即停止程式就是程式碼不夠堅固, 立即停止: Error, 程式碼不夠堅固: RuntimeException
 */
public class CheakedAndUncheckException {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        if (y != 0) { // 避免發生 ArithmeticException 錯誤, 此錯誤屬RuntimeException, 因此不需使用try-catch
            int avg = x / y;
            System.out.println(avg);
        }
        int[] nums = {};
        if (nums != null) { // 避免發生 NullPointerException 錯誤, 此錯誤屬RuntimeException, 因此不需使用try-catch
            if (nums.length > 0) // 避免發生 ArrayIndexOutOfBoundsException 錯誤
            {
                System.out.println(nums[0]);
            }
        }

    }
}
