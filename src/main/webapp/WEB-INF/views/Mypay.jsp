
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>支付页面</title>
</head>
<body>
<h1>请扫码支付</h1>
<img src="/wxpay/dopay"/>
</body>
<script type="text/javascript" src="https://cdn.goeasy.io/goeasy-1.0.17.js"></script>
<script type="text/javascript">
    var goEasy = new GoEasy({
        host:'hangzhou.goeasy.io', //应用所在的区域地址: 【hangzhou.goeasy.io |singapore.goeasy.io】
        appkey: "BC-a455783108a8445296e08b5df1187842", //替换为您的应用appkey
    });
    goEasy.subscribe({
        channel: "java", //替换为您自己的channel
        onMessage: function (message) {
           if(message.content=='success'){
              location.href="/wxpay/success";

           }
        }
    });

</script>



</html>
