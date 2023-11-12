package ru.zagrebin.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zagrebin.buysell.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
