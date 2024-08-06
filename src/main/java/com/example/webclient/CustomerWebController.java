package com.example.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/web/customers")
public class CustomerWebController {
    @Autowired RestTemplate restTemplate;
}
