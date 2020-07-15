package com.xinlong.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.xinlong.sdk.MyWXPayConfig;
import com.xinlong.sdk.WXPay;
import io.goeasy.GoEasy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/wxpay")
public class WXPaycontroller {

    @RequestMapping("/showpay")
    public String showPay(){
        return "Mypay";
    }
    @RequestMapping("/dopay")
    public void doPay(HttpServletRequest request,HttpServletResponse response) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHssmm");
        String preorder = simpleDateFormat.format(date);
        String sid = "2011";
        String orderid = preorder + sid;



        MyWXPayConfig config = new MyWXPayConfig();
        WXPay wxpay = null;
        try {
            wxpay = new WXPay(config);
            Map<String, String> data = new HashMap<String, String>();
            data.put("body", "鑫龙小费");
            data.put("out_trade_no", orderid);
            data.put("device_info", "");
            data.put("fee_type", "CNY");//货币单位,分
            data.put("total_fee", "1");
            data.put("spbill_create_ip", "123.12.12.123");//过滤的IP(对于这样的地址会被记录)
            data.put("notify_url", " http://5dbvkp.natappfree.cc/wxpay/notifi_url");
            data.put("trade_type", "NATIVE");  // 此处指定为扫码支付
            data.put("product_id", sid);
            Map<String, String> resp = wxpay.unifiedOrder(data);
            String code_url = resp.get("code_url");
            HashMap<EncodeHintType, Object> hints = new HashMap<>();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
            hints.put(EncodeHintType.MARGIN, 2);
            try {
                BitMatrix bitMatrix = new MultiFormatWriter().encode(code_url, BarcodeFormat.QR_CODE, 200, 200, hints);
                MatrixToImageWriter.writeToStream(bitMatrix, "PNG", response.getOutputStream());
                System.out.println("创建二维码完成");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping("/notifi_url")

    public void getNotifydyURL(HttpServletResponse response, HttpServletRequest request) throws IOException {
        ServletInputStream is = request.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        while ((len = is.read(b)) != -1) {
            String str = new String(b, 0, len);
            System.out.println(str);
        }

        response.getWriter().write("<xml>\n" +
                "  <return_code><![CDATA[SUCCESS]]></return_code>\n" +
                "  <return_msg><![CDATA[OK]]></return_msg>\n" +
                "</xml>");

        GoEasy goEasy = new GoEasy("rest-hangzhou.goeasy.io","BC-a455783108a8445296e08b5df1187842");
        goEasy.publish("java", "success");



    }
    @RequestMapping("/success")
    public String Success(){
        return "success";
    }


}
