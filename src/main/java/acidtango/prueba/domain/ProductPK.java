package acidtango.prueba.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Embeddable
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductPK implements Serializable {

	private Long productId;
	private Integer priceList;

}
