package com.example.webclient;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import com.example.webclient.Customer;

@Controller
@RequestMapping("/web/customers")
public class CustomerWebController {
    @Autowired RestTemplate restTemplate;
    private final String url = "http://localhost:8080/customers";
    @GetMapping("")
    public String getAllCustomers(Model model) {
        Customer[] customers = restTemplate.getForObject(url, Customer[].class);
        System.out.println(customers.getClass());
        model.addAttribute("customers", customers);
        return  "customers";
    }
    
    @GetMapping("/create")
    public String createCustomerForm(Model model) {
        model.addAttribute("customer", new Customer(null, null));
        return "customer-form";
    }


    public String getCustomer(Long id) {
        return restTemplate.getForObject("http://localhost:8080/customers/" + id, String.class);
    }

    @PostMapping("")
    public String createCustomer(@ModelAttribute Customer customer) {
        System.out.println("here");
        restTemplate.postForObject("http://localhost:8080/customers", customer, Customer.class);
        return "redirect:/web/customers";
    }

    @GetMapping("/edit/{id}")
    public String editCustomerForm(@PathVariable Long id, Model model) {
        Customer customer = restTemplate.getForObject(url + "/" + id, Customer.class);
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @PostMapping("/update/{id}")
    public String updateCustomer(@PathVariable Long id, @ModelAttribute Customer customer) {
        restTemplate.put(url + "/" + id, customer); 
        return "redirect:/web/customers";

    }

    @GetMapping("/delete/{id}") 
    public String deleteCustomer(@PathVariable Long id) {

        restTemplate.delete(url + "/" + id);
        return "redirect:/web/customers";
    }

}
