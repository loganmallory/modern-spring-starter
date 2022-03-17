package mallory.logan.app.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class CucumberSpringConfig {

}
