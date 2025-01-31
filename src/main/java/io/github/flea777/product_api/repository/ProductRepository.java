package io.github.flea777.product_api.repository;

import io.github.flea777.product_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
