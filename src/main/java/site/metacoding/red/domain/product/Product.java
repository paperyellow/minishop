package site.metacoding.red.domain.product;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
	private boolean isOuter;
	private Integer id;
	private String name;
	private Integer price;
	private Integer stock;

	// 엔티티가 아닌 필드

}