package mallory.logan.app;

import io.micrometer.core.instrument.binder.http.HttpServletRequestTagsProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.ZoneId;

import static org.springframework.core.Ordered.LOWEST_PRECEDENCE;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Slf4j
@Order(LOWEST_PRECEDENCE)
@ControllerAdvice
public class DefaultExceptionHandler {

    private static final ZoneId EASTERN = ZoneId.of("America/New_York");

//    @ResponseStatus(INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ApiError> handle(final Exception ex, final HttpServletRequest request) {
//        log.error("An exception without any specific handling was thrown: ", ex);
//
//        return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(apiError);
//    }


}
