package day28;

public class ExceptionDemo3 {

    public static void main(String[] args) {
        int[] nums = {10, 0};
        try {
            int avg = nums[0] / nums[1];
            System.out.println(avg);
        } catch (ArithmeticException e) { // ArithmeticException -> 分母為 0 時造成的錯誤
            System.out.println("數學錯誤, 錯誤原因: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException -> 缺少任一分子或分母時
            System.out.println("陣列維度(個數)不足, 錯誤原因: " + e.getMessage());
        } catch (NullPointerException e) { // NullPointerException -> 陣列為空值時
            System.out.println("陣列實體沒有建立, 錯誤原因: " + e.getMessage());
        }

    }
}
