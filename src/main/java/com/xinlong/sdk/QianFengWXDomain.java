package com.xinlong.sdk;

public class QianFengWXDomain implements IWXPayDomain {
    public void report(String domain, long elapsedTimeMillis, Exception ex) {

    }

    public DomainInfo getDomain(WXPayConfig config) {
        DomainInfo domainInfo=new DomainInfo("api.mch.weixin.qq.com",true);
        return domainInfo;
    }
}
