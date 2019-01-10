package cn.edu.cqut.chat.web.rest;

import cn.edu.cqut.chat.dto.DtoUserLoginMessage;
import cn.edu.cqut.chat.dto.ResultMessage;
import cn.edu.cqut.chat.service.UserMessageService;
import cn.edu.cqut.chat.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private final UserMessageService usermsgService;

  @Autowired
  public TestController(@Qualifier("default") UserMessageService usermsgService) {
    this.usermsgService = usermsgService;
  }

  /**
   * 验证Account是否存在
   * @param msg
   * @return
   */
  @GetMapping("/validaccount")
  public ResultMessage<String> validateAccount(DtoUserLoginMessage msg) {
    String validResult;
    switch (msg.getType()) {
      case "phone":
        validResult = usermsgService.validPhone(msg.getAccount());
        break;
      case "email":
        validResult = usermsgService.validEmail(msg.getAccount());
        break;
      default:
        validResult = usermsgService.validUsername(msg.getAccount());
    }
    ResultMessage<String> result = new ResultMessage<>();
    if (!StringUtil.isNotBlank(validResult)) {
      result.setSuccess(false);
    }
    return result;
  }
}
