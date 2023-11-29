package hotel.api.hotel.DTO;

import hotel.api.hotel.domain.ReservaEntity;

import java.time.LocalDate;
import java.util.Date;

public record ReservaDtoResponse(Long id, LocalDate dataEntrada, LocalDate dataSaida, Long idUser, Long idQuarto) {
    public ReservaDtoResponse(ReservaEntity entity){
        this(entity.getId(),entity.getDataEntrada(),entity.getDataSaida(),entity.getUserId(),entity.getQuartoId());
    }
}
