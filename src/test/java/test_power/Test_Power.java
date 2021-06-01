package test_power;

import day29_assert.Power;
import org.junit.Assert;
import org.junit.Test;

public class Test_Power {

    // 測試要符合 3A
    // Arrange - 安排(目標物件)
    // Act - 目標方法(實際得到的結果)
    // Assert - 驗證是否符合預期
    
    @Test
    public void t1() {
        Power power = new Power();
        int v = 5;
        int a = 4;
        int exp = 20; // 期望值
        int act = power.getW(v, a); // 實際值
        Assert.assertEquals(exp, act); // 結果

    }

    @Test
    public void t2() {
        Power power = new Power();
        int v = 5;
        int w = 20;
        int exp = 4; // 期望值
        int act = power.getA(w, v); // 實際值
        Assert.assertEquals(exp, act); // 結果
    }

    @Test
    public void t3() {
        Power power = new Power();
        int a = 4;
        int w = 20;
        int exp = 5; // 期望值
        int act = power.getV(w, a); // 實際值
        Assert.assertEquals(exp, act); // 結果
    }
}
