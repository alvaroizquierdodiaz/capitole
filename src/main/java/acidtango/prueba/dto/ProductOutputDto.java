package acidtango.prueba.dto;

import acidtango.prueba.domain.Product;
import acidtango.prueba.domain.ProductPK;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductOutputDto extends ProductBaseDto implements Serializable {

	private Integer rateApplied;
	private Float finalPrice;

	public ProductOutputDto(Product product, String actualDate) {
		super();
		super.actualDate = actualDate;
		super.brandId = product.getBrandId();

		ProductPK pk = product.getProductPk();
		super.productId = pk.getProductId();
		this.rateApplied = pk.getPriceList();

		this.finalPrice = product.getPrice();
	}

}
