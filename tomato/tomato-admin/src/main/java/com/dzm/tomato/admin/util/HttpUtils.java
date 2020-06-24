package com.dzm.tomato.admin.util;

import com.alibaba.fastjson.JSONObject;
import com.dzm.tomato.core.http.HttpResult;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpUtils {

    /**
     * getHttpServletRequest
     * @return
     */
    public static HttpServletRequest getHttpServletRequest(){
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }


    /**
     * print error message to brower
     * @param httpServletResponse
     * @param code
     * @param msg
     * @throws IOException
     */
    public static void print(HttpServletResponse httpServletResponse, int code, String msg) throws IOException{
        httpServletResponse.setContentType("application/json; charset=utf-8");
        HttpResult result = HttpResult.error(code, msg);
        String json = JSONObject.toJSONString(result);
        PrintWriter printWriter = httpServletResponse.getWriter();
        printWriter.print(json);
        printWriter.flush();
        printWriter.close();
    }
}
