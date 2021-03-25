package com.ocp.java0316.day06;

/*********************************************
調查五位學生之身高及體重如下，試比較其分散程度。
            身高：172、168、164、170、176(公分)
            體重：62、57、58、64、64(公斤)
            請問身高及體重哪個較集中 ?
**********************************************/

public class ArrayCV3 {
    public static void main(String[] args) {
        double [] height = {172, 168, 164, 170, 176};
        double [] weight = {62, 57, 58, 64, 64};
        double h = MyMath.sd(height);
        double w = MyMath.sd(weight);
        String result = (h > w) ? "體重較集中":"身高較集中";
        System.out.printf("%s\n身高的變異係數為 %.1f%%\n體重的變異係數為 %.1f%%",result,h,w);
    }
}
