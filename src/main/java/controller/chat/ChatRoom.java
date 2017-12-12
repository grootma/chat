package controller.chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/12/11.
 */
@Controller
public class ChatRoom {
    @RequestMapping("/chat")
    public String chat() {
        return "chat_room";
    }
}
