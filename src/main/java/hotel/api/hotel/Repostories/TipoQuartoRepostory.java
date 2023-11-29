package hotel.api.hotel.Repostories;

import hotel.api.hotel.domain.QuartoEntity;
import hotel.api.hotel.domain.TipoQuartoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoQuartoRepostory extends JpaRepository<TipoQuartoEntity, Long> {
    public TipoQuartoEntity findByTipo(String tipo);
}
