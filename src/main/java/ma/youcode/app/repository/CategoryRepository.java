package ma.youcode.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.youcode.app.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
