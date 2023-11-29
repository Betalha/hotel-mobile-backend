package hotel.api.hotel.Mapper;

import hotel.api.hotel.DTO.ReservaDtoResponse;
import hotel.api.hotel.domain.ReservaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ReservaMapper {
    List<ReservaDtoResponse> ListReservaEntityToListReservaDtoResponse(List<ReservaEntity> list);
}
