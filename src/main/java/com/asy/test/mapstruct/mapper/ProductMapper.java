package com.asy.test.mapstruct.mapper;

import com.asy.test.mapstruct.model.Price;

/**
 * Created by asy
 */
public class ProductMapper {

    public String asString(Price price) {
        return String.valueOf(price.getTotal());
    }

}
