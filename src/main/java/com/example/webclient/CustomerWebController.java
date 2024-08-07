package com.example.webclient;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/web/customers")
public class CustomerWebController {
<<<<<<< HEAD
    @Autowired RestTemplate restTemplate;
    private final String url = "http://localhost:8080/customers";
    @GetMapping("")
    public String getAllCustomers(Model model) {
        Customer[] customers = restTemplate.getForObject(url, Customer[].class);
        System.out.println(customers.getClass());
        model.addAttribute("customers", customers);
=======
    @Autowired 
    private RestTemplate restTemplate;

    @GetMapping
    public String getAllCustomers(Model model) {
        Customer[] customer = restTemplate.getForObject("http://localhost:8080/customers", Customer[].class);
        model.addAttribute("customers", customer);
>>>>>>> de9e2af6753b7101c25c9f60eda378608a73638b
        return  "customers";
    }
    
    // public void createCustomerForm() {
    //     restTemplate.getForObject("http://localhost:8080/customers", String.class);
    // }

    // public String getCustomer(Long id) {
    //     return restTemplate.getForObject("http://localhost:8080/customers/" + id, String.class);
    // }
    // public String createCustomer() {
    //     return restTemplate.postForObject("http://localhost:8080/customers", null, String.class);
    // }

    // public String editCustomerForm(Long id) {
    //     return restTemplate.getForObject("http://localhost:8080/customers/" + id , String.class);
    // }

    // public String updateCustomer() {
    //     restTemplate.put("http://localhost:8080/customers/1", null);
    //     return "Customer updated";
    // }

    // public String deleteCustomer(Long id) {
    //     restTemplate.delete("http://localhost:8080/customers/" + id);
    //     return "Customer deleted";
    // }

}
