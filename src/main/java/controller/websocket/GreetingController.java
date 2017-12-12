package controller.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/12/11.
 * index()
 * 指定了一个页面，用来实现WebSocket客户端发送公告功能，使用的是@RequestMapping，所以接收的是http请求，进行页面跳转。
 * greeting(String value)
 * 这个方法是接收客户端发送功公告的WebSocket请求，使用的是@MessageMapping。
 * this.simpMessagingTemplate.convertAndSend("/topic/notice", value)
 * 这个方法官方给出的解释是Convert the given Object to serialized form, possibly using a MessageConverter, wrap it as a message and send it to the given destination. 意思就是“将给定的对象进行序列化，使用‘MessageConverter’进行包装转化成一条消息，发送到指定的目标”，通俗点讲就是我们使用这个方法进行消息的转发发送！
 * 前面我们全局配置中指定了服务端接收的连接以 app大头，所以客户端发送公告的请求连接应该是/app/change-notice。
 */
@Controller
public class GreetingController {
    @Resource
    private SimpMessagingTemplate simpMessagingTemplate;
    @RequestMapping("/helloSocket")
    public String index(){
        return "index";
    }
    @MessageMapping("/change-notice")
    public void greeting(String value){
        this.simpMessagingTemplate.convertAndSend("/topic/notice", value);
    }

    /**
     * 同样上面的geeting(String value)方法我们还可以使用另一个注解@SendTo换成另一种写法。
     * @SendTo定义了消息的目的地。结合例子解释就是“接收/app/change-notice发来的value，然后将value转发到/topic/notice客户端。
     * /topic/notice是客户端发起连接后，订阅服务端消息时指定的一个地址，用于接收服务端的返回，后面我们在写客户端代码的时候会看见。
     * @param value
     * @return
     */
   /* @MessageMapping("/change-notice")
    @SendTo("/topic/notice")
    public String greeting(String value) {
        return value;
    }*/
}
