package ntub107202.hostel.Common;

public class Common {
    //--------------------------
    //(1) 若連結自己的主機
    //--------------------------
    // 確認並修改主機的ip位址
    // 若為192.168開頭的虛擬IP, 執行時模擬器與主機應使用同一分享器內之網路
    //public static String url="http://192.168.56.1:3000";

    //--------------------------
    //(2) 若連結現有測試主機
    //--------------------------
    public static String getUrl="http://140.131.114.153/getMysqlJSON";
    public static String postUrl="http://140.131.114.153/getAndroid";
    public static String postJob="http://140.131.114.153/postJob";
    public static String postCalendar="http://140.131.114.153/postCalendar";
    public static String getjob="http://140.131.114.153/getjob";
    public static String getCalendar="http://140.131.114.153/getcalendar";


}