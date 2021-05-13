package test_rice;

import com.lab.rice.Util;
import org.junit.Test;

public class Test_Util {
    @Test
    public void test_getjson() throws Exception{
        String json = Util.getjson();
        System.out.println(json);
    }
}
