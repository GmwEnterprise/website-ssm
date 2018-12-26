package cn.edu.cqut.chat.web.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class TestView {

  @GetMapping("/hello")
  public String helloThymeleaf(ModelMap map) {
    map.put("thText", "设置文本内容");
    map.put("thUText", "设置文本内容");
    map.put("thValue", "设置当前元素的value值");
    map.put("thEach", Arrays.asList("列表", "遍历列表"));
    map.put("thIf", "msg is not null");
    return "hello";
  }
}
