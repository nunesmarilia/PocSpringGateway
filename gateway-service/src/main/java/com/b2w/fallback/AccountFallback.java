package com.b2w.fallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class AccountFallback { // implements FallbackProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountFallback.class);

//    @Override
//    public String getRoute () {
//        return  "*" ;
//    }
//
//    @Override
//    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
//        if (cause instanceof HystrixTimeoutException) {
//            return response(HttpStatus.GATEWAY_TIMEOUT, route);
//        } else {
//            return response(HttpStatus.INTERNAL_SERVER_ERROR, route);
//        }
//    }
//
//    private ClientHttpResponse response(final HttpStatus status, String route) {
//        return new ClientHttpResponse() {
//            @Override
//            public HttpHeaders getHeaders() {
//                HttpHeaders headers = new HttpHeaders();
//                headers.setContentType(MediaType.APPLICATION_JSON);
//                return headers;
//            }
//
//            @Override
//            public InputStream getBody() throws IOException {
//                SimpleDateFormat fmtDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//                Date now		= new Date();
//                String strNow	= fmtDate.format(now);
//
//                String messageErrorTimeout	= "Status Code: "+getStatusCode()+" - "+getStatusText()+" "+route+" service error! "+strNow;
//
//
//                LOGGER.error(messageErrorTimeout);
//
//                throw new HttpTimeoutException(messageErrorTimeout);
//
//                //return new ByteArrayInputStream((messageErrorTimeout).getBytes());
//            }
//
//            @Override
//            public String getStatusText() throws IOException {
//                return status.getReasonPhrase();
//            }
//
//            @Override
//            public HttpStatus getStatusCode() throws IOException {
//                return status;
//            }
//
//            @Override
//            public int getRawStatusCode() throws IOException {
//                return status.value();
//            }
//
//            @Override
//            public void close() {
//            }
//        };
//    }

}
