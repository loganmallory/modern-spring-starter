package mallory.logan.app.cucumber;

import lombok.RequiredArgsConstructor;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.reactive.server.WebTestClient;

@RequiredArgsConstructor
public class StepDefinitions {

    @Autowired
    private final WebTestClient webTestClient;

    private WebTestClient.ResponseSpec apiResponse;

    @Before
    public void collectOffLimitsResources() {

    }

    @After
    public void deleteTestResources() {

    }

}
