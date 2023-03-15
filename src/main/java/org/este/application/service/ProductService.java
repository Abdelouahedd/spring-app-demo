package org.este.application.service;

import lombok.AllArgsConstructor;
import org.este.application.mapper.ProductMapper;
import org.este.application.model.Product;
import org.este.application.repo.ProductRepository;
import org.este.application.request.ProductRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public void save(ProductRequest request) {
        Product product = productMapper.toProduct(request);
        productRepository.saveAndFlush(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public void update(Long id, ProductRequest request) {
        Product product = productMapper.toProduct(request);
        product.setId(id);
        productRepository.saveAndFlush(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
