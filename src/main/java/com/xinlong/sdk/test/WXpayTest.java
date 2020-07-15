package com.xinlong.sdk.test;

import com.xinlong.sdk.MyWXPayConfig;
import com.xinlong.sdk.WXPay;

import java.util.HashMap;
import java.util.Map;

public class WXpayTest {
    public static void main(String[] args) throws Exception {
        MyWXPayConfig config = new MyWXPayConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("body", "鑫龙小费");
        data.put("out_trade_no", "2020070910595900000003");
        data.put("device_info", "");
        data.put("fee_type", "CNY");//货币单位,分
        data.put("total_fee", "1");
        data.put("spbill_create_ip", "123.12.12.123");//过滤的IP(对于这样的地址会被记录)
        data.put("notify_url", "http://2cj6yb.natappfree.cc/wxpay/notifi_url");
        data.put("trade_type", "NATIVE");  // 此处指定为扫码支付
        data.put("product_id", "03");


        try {
            Map<String, String> resp = wxpay.unifiedOrder(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
