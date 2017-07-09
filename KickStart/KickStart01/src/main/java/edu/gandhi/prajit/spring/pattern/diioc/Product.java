package edu.gandhi.prajit.spring.pattern.diioc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
	private Integer id;
	private String name;
	private BigDecimal price;
	private boolean inStock;
	@Default
	private List<Comment> comments = new ArrayList<Comment>();
}
