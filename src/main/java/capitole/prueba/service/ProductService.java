package capitole.prueba.service;

import capitole.prueba.dto.ProductOutputDto;
import capitole.prueba.exception.EntityNotFoundException;
import capitole.prueba.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Comparator;

@Service
@RequiredArgsConstructor
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Transactional(readOnly = true)
	public ProductOutputDto findProducts(String actualDate, Long productId, Integer brandId) throws EntityNotFoundException {

		var product = productRepository
		        .findByProductIdAndBrandIdAndActualDate(Timestamp.valueOf(actualDate), productId, brandId)
		        .max(Comparator.comparing(e -> e))
		        .orElseThrow(EntityNotFoundException::new);

		return new ProductOutputDto(product, actualDate);
	}

}
