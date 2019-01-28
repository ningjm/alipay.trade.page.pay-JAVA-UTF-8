package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092300576554";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCpZXCq3CqKhWZl\n" +
            "8bajkojhU4afehsrU+3DLp2z+GdrrvAF/4XMBIdhQ15g8OZZcbWxiQQXtbrgbZ3C\n" +
            "KTsaglhgWSx4ZtGuaKrcoUrV9WbH5FaMK4seQ7zi9dxhR1TUlEKjGdOWDxsBhpzD\n" +
            "orRk2cgI8XcjOnaE/C5Hmtsd7HTM1NmbpWRL+WZia+jYQcyQVFFKbieIzxJBK83d\n" +
            "cCqOmlKpe7c3HdxTV7H2RiT3Jp3W2vOxzaAmQcCpA+h6G88AO0EJOpBhE97dgqZW\n" +
            "EZkNycRNHTN1gUZ2tX3opisStFtNrgoYTw1G4WGy7vjVmB1TBpUc0Mld4Yqr3/Uv\n" +
            "nrBKt0LnAgMBAAECggEBAI0KqCerD0Ss09iXzDEfphauvA121r5ZsELuQmKBtmKj\n" +
            "krf7zERVlP7339IpYjIhCl5areyr5IBO5KawO8TTuI/oT62kNnvYLENtjGjfXgeb\n" +
            "aDBnZPr6/X+fpDHe+ZPSKjWxIEn2I88+bLI7e6Xo6rP/kOnlGJ+bdVErb7vXkFym\n" +
            "lQ5EVScpdGmcKGCMwEJesksjbDh5W68q6sS6TNYy74uDuhYO8hT9mSpCWdtkSLI4\n" +
            "R3jwEpb+NTzNlbp95FggluNp0zIhJQ9IeqHHjt83/DQbx+5K+gQA7vGyHFJmpFEM\n" +
            "/bZQ3m9/uLILszIQLqVbRI+fJOgWJMRbslAjGgXwmrECgYEA4KenShQQsoIRK0Uk\n" +
            "xN41ocGLpxbbNQQrnCwZeaNHHFWM7Rmwk+Hpn/PaHYC7PRN1RkYr5iT10TAxvt/Z\n" +
            "tUMFbIwoYgg1248M8waCGqCRa57ql9pHAohETsm3VDHl2nGPqrkoxuxCSJvno7NT\n" +
            "0B4shNZSdYN1RIWduWHOiX/zoRkCgYEAwQgHMBZ3HB23YhxmSwlmfrwVj+dvFc90\n" +
            "4YMmk8rM0j9BkpLSV2xcJyGUk7rK28uDeEKgKqIUTE/Fdc5RD/xEzh9I9LZnhPGz\n" +
            "tUetjcYFZ4KBiYBoJrofe3BadQe9zZJZLm3AWVCywSA0DPTf/V53NIDk9xxnWA3x\n" +
            "/ywLUdmqg/8CgYBr9kX/5KqtjrI/kCf+cCdoCAJcFzDbRpjKoarQePYomLh0DV99\n" +
            "ghjrJJ5ShVX2IQ6/6eMY4/Q6RqXxa9RNNts5chXKHtX7IMEBXcRSlY2tIZ7twRlV\n" +
            "DzV8g5YV4TDsDJ0VV4xQJKQqDrqAQiLqJkYQxIq2LKnDd074ExfVnmbvqQKBgHmJ\n" +
            "xHzSqExbqYtstjuov5AsfKcO4TKqXL1hBnknx67ZhT/0kdvZrmw1CIe7pN6fVTfz\n" +
            "O0Wcp4sk7v8t2HxoKipeKGFsN+HNDYmmh/AsLlruIQGih/FaX1gpdcsaBLfa3awO\n" +
            "Dn4uAV74F83QoPe28vdr8L5mc+tNXIF+CeKPWn2hAoGBAKZDb50TCy9l+5aqZ0XQ\n" +
            "upxpSW0ma4Ez3BBGEGkkVutJqArrqhkleutbJVwN4bdjMtn97QyMOrg5MRGxfr50\n" +
            "o7qwtBT2BsdIxial3PkXG5IbNrWti6vzEJN2/7GmZ2+DTtJVZoBMPPpaSUokbicK\n" +
            "1B/ILUeGhjH8r1f4mVCHEExa";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvi+pI6t2e1eZm2rr1Qzaz5akvyhhz9WNc+Bf5UYQxDrM3Q3KWebXbz7jAi7YDoIcq3wKucw5mqPZbtrScywsM/t4ooWGkRASaof5nIjnauGfcu3L5ktDR6Y9S8p7h11VTwF0hvr10tiIJjQbqnStJCCs/M0m7PzEAhycT9HkkY2MI2xf4XAZpWIvkhI71NHkg2GRgv2ZLN60VkeNxPmSifH8VIVMOwzHC9IG72L4qZZzCQ6Lc0a7/870JPlwfhhMzw9bYkkxxyxJoBJEAVqoe6MPeXodXL/929fbQsodAM4a+xqE/WnNCT6qr4sxOTd+ymNfoPp3XEUPoePpVb0C1QIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://njm.free.idcfengye.com/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://njm.free.idcfengye.com/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

