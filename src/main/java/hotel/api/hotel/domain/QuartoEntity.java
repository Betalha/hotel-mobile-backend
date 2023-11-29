package hotel.api.hotel.domain;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "quarto")
@Entity(name = "quarto")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class QuartoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantidade;
    @Column(name = "id_tipo_quarto")
    private Long tipoQuarto;
}
