package hotel.api.hotel.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Table(name = "reserva")
@Entity(name = "reserva")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class ReservaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_entrada")
    private LocalDate dataEntrada;
    @Column(name = "data_saida")
    private LocalDate dataSaida;
    @Column(name = "id_user")
    private Long userId;
    @Column(name = "id_quarto")
    private Long quartoId;
}
