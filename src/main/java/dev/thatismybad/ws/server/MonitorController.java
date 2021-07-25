package dev.thatismybad.ws.server;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MonitorController {
    @MessageMapping("/log")
    public void processMessageFromClient(Message message) {
        System.out.println(String.format("host: %s | content: %s", message.getHost(), message.getContent()));
    }
}
