package dockerStarter.controller;

import dockerStarter.entity.Starter;
import dockerStarter.repository.StarterRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {
    private final StarterRepository starterRepository;

    public StarterController(StarterRepository starterRepository) {
        this.starterRepository = starterRepository;
    }

    @GetMapping("/starter")
    public String returnHelloWorldMessage() {
        return "Hello Docker";
    }

    @GetMapping("/save")
    public void saveMessage() {
        Starter starter = new Starter();
        starter.setMessage("Hello Docker again");

        starterRepository.save(starter);
    }
}
