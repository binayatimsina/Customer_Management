package com.example.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/web/customers")
public class CustomerWebController {
    @Autowired RestTemplate restTemplate;

    public String getAllCustomers() {
        return restTemplate.getForObject("http://localhost:8080/customers", String.class);
    }

    public void createCustomerForm() {
        restTemplate.getForObject("http://localhost:8080/customers", String.class);
    }

    public String getCustomer(Long id) {
        return restTemplate.getForObject("http://localhost:8080/customers/" + id, String.class);
    }
    public String createCustomer() {
        return restTemplate.postForObject("http://localhost:8080/customers", null, String.class);
    }

    public String editCustomerForm(Long id) {
        return restTemplate.getForObject("http://localhost:8080/customers/" + id , String.class);
    }

    public String updateCustomer() {
        restTemplate.put("http://localhost:8080/customers/1", null);
        return "Customer updated";
    }

    public String deleteCustomer(Long id) {
        restTemplate.delete("http://localhost:8080/customers/" + id);
        return "Customer deleted";
    }

}
