package example;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MyService {

    public MyEntity getResponse() {
        return new MyEntity(UUID.randomUUID().toString(), "Hello spring boot!");
    }

}
