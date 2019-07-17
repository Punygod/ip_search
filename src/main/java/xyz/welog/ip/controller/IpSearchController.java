package xyz.welog.ip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.welog.ip.util.IPUtil;

/**
 * @author wenlong
 * @date 2019/07/17 22:00
 */
@RestController
public class IpSearchController {

    @GetMapping("/getIp")
    public String testIp(){
        String ip = "220.248.12.158";
        String result = IPUtil.getCityInfo(ip);


        System.out.println(result);
        return  result;
    }

}
