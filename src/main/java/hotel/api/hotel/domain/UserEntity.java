package hotel.api.hotel.domain;

import hotel.api.hotel.DTO.UserDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Table(name = "user")
@Entity(name = "user")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String name;
    private String pass;
    private String email;

    public UserEntity(UserDto user){
        this(null, user.name(), user.pass(), user.email());
    }
}

