package bbro.groupchangeiut;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("time")
public class TimeController {

    @GetMapping("start")
    public void start(){
        final String uri = "https://reqforbbro.herokuapp.com/connect";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }
    @GetMapping("res")
    public void res(){
        final String uri = "https://reqforbbro.herokuapp.com/res";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }

}
