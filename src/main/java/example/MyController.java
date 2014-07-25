package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService service;

    @RequestMapping("/")
    @ResponseBody
    public HttpEntity<MyEntity> home() {

        MyEntity entity = service.getResponse();

        return new HttpEntity<MyEntity>(entity);
    }

}
