package hotel.api.hotel.Repostories;

import hotel.api.hotel.domain.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepostory extends JpaRepository<ReservaEntity, Long> {
    public List<ReservaEntity> findByUserId(Long userId);
}
