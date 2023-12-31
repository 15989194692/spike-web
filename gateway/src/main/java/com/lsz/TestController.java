package com.lsz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/12/31 下午5:34
 * @Version 1.0.0
 **/
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/test")
    public String createBlog() {
        return "spike-web-test";
    }


}
