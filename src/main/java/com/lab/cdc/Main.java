package com.lab.cdc;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception{
        CDC[] cdcs = Util.getCdcs();
        // System.out.println(cdcs.length);
        Stream.of(cdcs)
                .filter(c -> c.getSent().contains("2021-05-13"))
                .filter(c -> c.getHeadline().contains("新型冠狀病毒"))
                .peek(c -> c.setDistance(Util.distance(c.getCircle(), "24,121")/1000))
                .forEach(c -> {
                    System.out.println(c.getHeadline());
                    System.out.println(c.getDescription().trim()); // trim是將字串中的空格刪除
                    System.out.println(c.getDistance());
                    
                });
    }
}
