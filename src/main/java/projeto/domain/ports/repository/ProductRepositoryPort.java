package projeto.domain.ports.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import projeto.adapters.spring.entities.ProductEntity;

public interface ProductRepositoryPort {

  Optional<ProductEntity> findById(Long id);
  Page<ProductEntity> findAll(Pageable pageable);
  void save(ProductEntity product);
  ProductEntity getReferenceById(Long id);
  void deleteById(Long id);
}
