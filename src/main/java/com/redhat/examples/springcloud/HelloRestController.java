package com.redhat.examples.springcloud;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@ConfigurationProperties(prefix="helloapp")
@RequestMapping("/api")
public class HelloRestController {
    private String saying;
    @RequestMapping(method = RequestMethod.GET, value="/hello", produces = "text/plain")
    public String hello(){
        String hostname = null;
        try {
            hostname = InetAddress.getLocalHost().getHostAddress();
        }catch (UnknownHostException e){
            hostname="unknown";
        }
        return "hello spring boot from "+hostname;
    }
    public void setSaying(String saying){
        this.saying=saying;
    }
}
