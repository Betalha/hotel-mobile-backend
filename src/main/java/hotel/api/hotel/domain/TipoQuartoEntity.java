package hotel.api.hotel.domain;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "tipo_quarto")
@Entity(name = "tipoQuarto")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class TipoQuartoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
}
