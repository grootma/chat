package controller.chat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;

/**
 * Created by Administrator on 2017/12/10.
 */
@RestController
public class TestBootController {
    @RequestMapping("/getuser")
    public User getUser() {
        User user = new User();
        user.setName("controller");
        return user;
    }

    @RequestMapping("/test")
    public String test() {
        return "testsucees";
    }
}
