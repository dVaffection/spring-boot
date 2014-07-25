package example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MyEntity {

    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("content")
    private String content;

    @JsonCreator
    public MyEntity(String uuid, String content) {
        this.uuid = uuid;
        this.content = content;
    }

}
