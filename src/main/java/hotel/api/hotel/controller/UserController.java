package hotel.api.hotel.controller;


import hotel.api.hotel.DTO.UserDto;
import hotel.api.hotel.Repostories.UserRepostory;
import hotel.api.hotel.domain.UserEntity;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/v1")
public class UserController {
    @Autowired
    private UserRepostory repostory;

    @PostMapping(path = "/signUp")
    @Transactional
    public Boolean signUpUser(@RequestBody @Valid UserDto dto){
        UserEntity userCheck = repostory.findByEmail(dto.email());
        if(userCheck != null) return false;
        repostory.save(new UserEntity(dto));
        return true;
    }

    @PostMapping(path = "/login")
    public Boolean login(@RequestBody UserDto user){
        UserEntity userInfo = repostory.findByEmail(user.email());
        if(userInfo == null) return false;
        return Objects.equals(user.email(), userInfo.getEmail()) && Objects.equals(user.pass(), userInfo.getPass());
    }

    @GetMapping(path = "/user/{email}")
    public UserDto getUserInfos(@PathVariable String email){
        UserEntity user = repostory.findByEmail(email);
        return new UserDto(user);
    }
}
