package acidtango.prueba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable, Comparable<Product> {

	@EmbeddedId
	private ProductPK productPk;

	@Column(name = "BRAND_ID")
	private Integer brandId;

	@Column(name = "START_DATE")
	private Timestamp startDate;

	@Column(name = "END_DATE")
	private Timestamp endDate;

	@Column(name = "PRIORITY")
	private Integer priority;

	@Column(name = "PRICE")
	private Float price;

	@Enumerated(EnumType.STRING)
	@Column(name = "CURR", length = 3)
	private Currency curr;

	@Override
	public int compareTo(Product otherProduct) {
		return this.priority.compareTo(otherProduct.getPriority());
	}
}
