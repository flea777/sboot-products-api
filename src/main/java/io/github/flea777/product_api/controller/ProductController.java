package io.github.flea777.product_api.controller;

import io.github.flea777.product_api.model.Product;
import io.github.flea777.product_api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository repository;

    @GetMapping("/{id}")
    public Product getById(@PathVariable("id") String id) {
        return repository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Product> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Product save(@RequestBody Product data) {
        repository.save(data);
        return data;
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable String id,
                          @RequestBody Product data) {
        data.setId(id);
        repository.save(data);
        return data;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }

}
