package deep.to.jvm.test.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home() {
        return "deep to jvm test home!";
    }

    @GetMapping("/test")
    public String test1() {
        for (int i = 0; i < 10000; i++) {
            new HomeController();
        }
        return "invoked";
    }
}
