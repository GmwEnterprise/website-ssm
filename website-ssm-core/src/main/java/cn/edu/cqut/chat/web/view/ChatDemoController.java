package cn.edu.cqut.chat.web.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class ChatDemoController {

  @GetMapping("/login")
  public String toSignInOrRegistry() {

    return "demo/signIn";
  }

  @PostMapping("/signIn")
  public String signIn(Model model) {

    return "demo/main";
  }
}
