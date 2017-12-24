package tools;

/**
 * Created by Administrator on 2017/12/24.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间处理
 */
public class TimeTool {

    /**
     * 获取 yyyy-MM-dd HH:mm:ss 格式的当前时间
     * @return
     */
    public static String getFomatTime(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());
    }

    /**
     * 获取 yyyy-MM-dd  格式的当前时间
     * @return
     */
    public static String getDate(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        return df.format(new Date());
    }

    /**
     * 获取 HH:mm:ss 格式的当前时间
     * @return
     */
    public static String getTime(){
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
        return df.format(new Date());
    }
}
