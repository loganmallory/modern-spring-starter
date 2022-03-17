package mallory.logan.app.cucumber;

import org.springframework.boot.test.web.reactive.server.WebTestClientBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config {

    @Bean
    public WebTestClientBuilderCustomizer webTestClientBuilderCustomizer() {
        return (builder) -> builder.defaultHeader("trace-id", "cucumber");
    }
}
