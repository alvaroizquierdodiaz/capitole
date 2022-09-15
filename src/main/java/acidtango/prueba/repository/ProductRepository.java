package acidtango.prueba.repository;

import java.sql.Timestamp;
import java.util.stream.Stream;

import acidtango.prueba.domain.Product;
import acidtango.prueba.domain.ProductPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, ProductPK> {

	@Query(value = "SELECT pro FROM Product pro WHERE pro.productPk.productId=:productId AND "
	        + "pro.brandId=:brandId AND :actualDate BETWEEN pro.startDate AND pro.endDate")
	Stream<Product> findByProductIdAndBrandIdAndActualDate(Timestamp actualDate, Long productId, Integer brandId);

}
