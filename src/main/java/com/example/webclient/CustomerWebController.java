package com.example.webclient;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import com.example.webclient.Customer;

@Controller
@RequestMapping("/web/customers")
public class CustomerWebController {
    @Autowired RestTemplate restTemplate;

    @GetMapping("")
    public ResponseEntity<Object> getAllCustomers() {
        var customers = restTemplate.getForEntity("http://localhost:8080/customers", Object.class);
        return  customers;
        // return restTemplate.getForObject("http://localhost:8080/customers", String.class);
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
