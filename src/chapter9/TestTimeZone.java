package chapter9;

import sun.misc.Regexp;

import java.util.Arrays;
import java.util.TimeZone;

public class TestTimeZone {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        //sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null]
        System.out.println(timeZone);
        String[] availableIDs = TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(availableIDs));
        System.out.println(timeZone.getID());//Asia/Shanghai
        System.out.println(timeZone.getDisplayName());//中国标准时间
    }
}
