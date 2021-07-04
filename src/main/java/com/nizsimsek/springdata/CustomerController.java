package com.nizsimsek.springdata;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    List<Customer> customers() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Customer> byId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping
    Customer save(Customer customer) {
        return repository.save(customer);
    }

    @DeleteMapping("/{customer}")
    void delete(@PathVariable Customer customer) {
        repository.delete(customer);
    }

    @GetMapping("/search")
    List<Customer> searchByAge(@RequestParam int age) {
        return repository.findByAge(age);
    }
}
