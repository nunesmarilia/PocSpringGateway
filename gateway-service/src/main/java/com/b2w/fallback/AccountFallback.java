package com.b2w.fallback;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

/**
 * This Connector shows how to use the CircuitBreaker annotation.
 */
//@CircuitBreaker(name = "Account")
@Component(value = "backendAConnector")
public class AccountFallback  {

    public String failure() {
        throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "This is a remote exception");
    }

    public String ignoreException() {
//        throw new BusinessException("This exception is ignored by the CircuitBreaker of backend A");
        return "";
    }

    public String success() {
        return "Hello World from backend A";
    }

}