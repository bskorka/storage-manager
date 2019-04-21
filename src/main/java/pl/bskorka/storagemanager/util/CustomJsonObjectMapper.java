package pl.bskorka.storagemanager.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class CustomJsonObjectMapper extends ObjectMapper {

    public CustomJsonObjectMapper() {
        this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        this.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);

        this.registerModule(new JavaTimeModule());
    }

}
