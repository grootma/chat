package controller.chat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tools.UUIDTool;

/**
 * Created by Administrator on 2017/12/11.
 */
@Controller
public class ChatRoom {
    @RequestMapping("/chat")
    public String chat(Model model) {
        model.addAttribute("userId", UUIDTool.getUUID());//临时替代userid
        return "chatRoom";
    }

    @RequestMapping("/createChat")
    public String createChat() {
        return "index";
    }
}
