package com.asy.test.mapstruct.mapper;

import com.asy.test.mapstruct.dto.CarDTO;
import com.asy.test.mapstruct.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Created by asy
 */

@Mapper(uses = ProductMapper.class)
//@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

    @Mappings({
            @Mapping(source = "numberOfSeats", target = "seatCount"),
            @Mapping(source = "carName", target = "name")
    })
    CarDTO carToCarDto(Car car);

}
