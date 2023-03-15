package org.este.application.mapper;

import org.este.application.model.Product;
import org.este.application.request.ProductRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toProduct(ProductRequest request);

}
