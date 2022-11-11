package dockerStarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {
    @GetMapping("/starter")
    public String returnHelloWorldMessage() {
        return "Hello Docker";
    }
}
