package day28;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        int[] nums = {10, 0};
        try {
            int avg = nums[0] / nums[1];
            System.out.println(avg);
        } catch (ArithmeticException e) { // catch要從子類別(小範圍)開始, 再寫到主類別
            System.out.println("數學錯誤, 錯誤原因: " + e.getMessage());
        } catch (Exception e) { // Exception -> 泛指其他錯誤
            System.out.println("其他錯誤, 錯誤原因: " + e.getMessage());
        }
    }
}
