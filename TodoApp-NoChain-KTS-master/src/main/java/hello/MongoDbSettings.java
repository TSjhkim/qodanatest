package hello;

import com.mongodb.MongoClientOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoDbSettings {
    static class OptionsConfig {

        @Bean
        public MongoClientOptions mongoOptions() {
            return 1
        }

    }
}
