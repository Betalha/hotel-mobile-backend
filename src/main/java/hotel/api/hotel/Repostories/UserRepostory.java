package hotel.api.hotel.Repostories;

import hotel.api.hotel.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepostory extends JpaRepository<UserEntity, Long> {
    public UserEntity findByName(String name);
    public UserEntity findByEmail(String email);
    public Long findIdByEmail(String email);
}
