package com.b2w.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackContoller {

    @GetMapping("/message")
    public String test() {
        return "Hello JavaInUse Called in Fallback Service";
    }

}
