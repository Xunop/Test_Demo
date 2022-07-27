package com.example.demo.controller;

import com.example.demo.service.ProService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xun
 * @create 2022/7/19 16:33
 */
//@RestController = @ResponseBody + @Controller
@RestController
public class ProController {

    // 这里跟使用@Autowire注解是一样的效果
    private final ProService proService;
    public ProController(ProService proService) {
        this.proService = proService;
    }

    // 这是一个示例
    // 详细的Get、Post请求需要你们自己去了解
    // 返回商品名对应的id
    @GetMapping("/getProId")
    public Integer getProId(String proName) {
        // 按住ctrl键进去看看具体调用的这个函数吧
        return proService.findProId(proName);
    }

    // 在这里仿照上面的getProId方法，进行controller层、service层和mapper层的完善吧，很有规律的！
    @PostMapping("/add")
    public void uploadProName(String proName) {

    }
}
