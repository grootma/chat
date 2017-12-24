package controller.ExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/16.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 也可以返回modelandview
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(RuntimeException e){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errorCode", "500");
        map.put("errorMsg", "亲，系統繁忙，请反馈给 工程师groot!");
        e.printStackTrace();
        return map;
    }
}
