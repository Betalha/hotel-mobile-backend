package hotel.api.hotel.DTO;

import java.time.LocalDate;
import java.util.Date;

public record ReservaDtoRequest(LocalDate dataEntrada, LocalDate dataSaida, String email, String tipo) {
}
