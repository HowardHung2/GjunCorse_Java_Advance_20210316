package Test_Order_System;

import com.lab.order_system.ServiceCenter;
import org.junit.Test;

public class TestServiceCenter {
    @Test
    public void test_printCatalog(){
        ServiceCenter sc = new ServiceCenter();
        sc.printCatalog();
    }
}
