import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kontroler {
    @GetMapping("/a")
    public String a(){
        return "abc";
    }
    @GetMapping
    public String b(){
        return "b";
    }

}
