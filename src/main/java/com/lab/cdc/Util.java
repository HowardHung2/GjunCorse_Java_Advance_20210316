package com.lab.cdc;

// 工具程式
import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Util {

    public static String getJson() throws Exception { // 拋出例外 不處理網路問題
        // 資料來源
        String path = "https://www.cdc.gov.tw/TravelEpidemic/ExportJSON";
        // 建立 URL 物件
        URL url = new URL(path); // URL物件可以幫你到網路上抓資料 如果無拋出例外 則此處會出現問題
        // 取得json文字資料
        String json = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"))
                // openStream()將是以byte資料為主，將串流資料抓下來，並輸入是使用UTF-8碼
                // InputStreamReader是char資料，強迫轉成文字型態
                .useDelimiter("\\A") // useDelimiter是告知是以什麼為分隔符號(pattern)，("\\A")表示全部選擇，\表示關鍵字，\\為跳脫字元
                .next(); // 抓取單筆(第一個)資料
        // return json.substring(1); 從第一個取到最後，因為本次資料預設第0筆為問號
        return (json.charAt(0) == '?') ? json.substring(1) : json;// 三元運算元 輸入判斷式 ? true執行處 : false執行處
    }

    public static CDC[] getCdcs() throws Exception {
        String json = getJson();
        CDC[] cdcs = new Gson().fromJson(json, CDC[].class);
        return cdcs;
    }

    /**
     * 计算地球上任意两点(经纬度)距离
     *
     * @param long1 第一点经度
     * @param lat1 第一点纬度
     * @param long2 第二点经度
     * @param lat2 第二点纬度
     * @return 返回距离 单位：米
     */
    public static double distance(String p1, String p2) {
        // p1 = "22.39,114.12"
        // p1.split(",")[0] 會得到 "22.39" 的字串
        // p1.split(",")[1] 會得到 "114.12" 的字串
        double lat1 = Double.parseDouble(p1.split(",")[0]);
        double long1 = Double.parseDouble(p1.split(",")[1]);
        double lat2 = Double.parseDouble(p2.split(",")[0]);
        double long2 = Double.parseDouble(p2.split(",")[1]);
        double a, b, R;
        R = 6378137; // 地球半径
        lat1 = lat1 * Math.PI / 180.0;
        lat2 = lat2 * Math.PI / 180.0;
        a = lat1 - lat2;
        b = (long1 - long2) * Math.PI / 180.0;
        double d;
        double sa2, sb2;
        sa2 = Math.sin(a / 2.0);
        sb2 = Math.sin(b / 2.0);
        d = 2 * R * Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1)
                        * Math.cos(lat2) * sb2 * sb2));
        return d;
    }

}
