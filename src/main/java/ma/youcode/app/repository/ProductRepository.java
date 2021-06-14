package ma.youcode.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.youcode.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	public List<Product> findByCategory_CategoryId(long CategoryId);

}
