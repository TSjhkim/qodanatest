package hello;

import com.mongodb.MongoClientOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoDbSettings {
    static class OptionsConfig {

        @Bean
        public Mongoptions() {
            return MongoClientOptions.builder()
                    .socketTimeout(2000)
                    .connectTimeout(2000)
                    .heartbeatSocketTimeout(2000)
                    .heartbeatConnectTimeout(2000)
                    .build();
        }

    }
}
