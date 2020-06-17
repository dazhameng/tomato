package com.dzm.tomato.admin.controller;

import com.dzm.tomato.common.utils.IoUtil;
import com.dzm.tomato.core.http.HttpResult;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.apache.xmlbeans.impl.common.IOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.http.HttpResponse;

@RestController
public class SysLoginController {

    @Autowired
    private Producer producer;

    @GetMapping("kaptcha.jpg")
    public void kaptcha(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletResponse.setHeader("Cache-Control", "no-store, no-cache");
        httpServletResponse.setContentType("image/jpeg");
        String text = producer.createText();
        BufferedImage bufferedImage = producer.createImage(text);
        httpServletRequest.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        ServletOutputStream servletOutputStream = httpServletResponse.getOutputStream();
        ImageIO.write(bufferedImage, "jpg", servletOutputStream);
        IoUtil.closeQuietly(servletOutputStream);
    }
}
