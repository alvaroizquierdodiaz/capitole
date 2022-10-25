package capitole.prueba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductBaseDto implements Serializable {

	protected String actualDate;
	protected Long productId;
	protected Integer brandId;

}