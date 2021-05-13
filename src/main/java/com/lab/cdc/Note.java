package com.lab.cdc;

public class Note {
    public static void getNote(){
        System.out.println("This is a Note");
    /*********************************
     * 網路爬蟲筆記
     * 1. 網站找到資料data sheet 如: https://www.cdc.gov.tw/TravelEpidemic/Index/RzNQU2F5L2RhZmRBd2pzWU5tM0NDQT09
     * 2. 使用JSON檔案類型
     * 3. 由於JSON檔案類型下載後，檔案內容使人難以閱讀，故須至 https://jsonformatter.org/json-pretty-print 
     * 4. 至該網站後，將JSON檔的連結複製到Load Data上傳連結
     * 
     * 開發步驟
     * 1. 抓取JSON資料
     * 2. 建立JSON物件entity
     * 3. 匯入JSON資料到陣列(利用Gson工具) 下載gson的libraries下載，複製到Project Files>pom.xml中
     * 4. 分析陣列資料
    *********************************/   
    }
    
}
