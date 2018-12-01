package cn.td.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable String name){
        String url = "http://provider-user/hello/"+name;   //直接访问
        return this.restTemplate.getForObject(url, String.class);
    }
}
