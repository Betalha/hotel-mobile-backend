package hotel.api.hotel.Repostories;

import hotel.api.hotel.domain.QuartoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuartoRepostory extends JpaRepository<QuartoEntity, Long> {
    public QuartoEntity findByTipoQuarto(Long id);
    public Long findIdByTipoQuarto(Long idTipo);
}
