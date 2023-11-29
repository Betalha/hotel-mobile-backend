package hotel.api.hotel.DTO;

import hotel.api.hotel.domain.UserEntity;
import jakarta.validation.constraints.NotBlank;

public record UserDto(Long id,
                      @NotBlank
                      String name,
                      @NotBlank
                      String pass,
                      @NotBlank
                      String email) {
    public UserDto(UserEntity user){
        this(user.getId(), user.getName(), user.getPass(), user.getEmail());
    }
}
