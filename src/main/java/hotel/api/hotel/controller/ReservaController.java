package hotel.api.hotel.controller;

import hotel.api.hotel.DTO.ReservaDtoRequest;
import hotel.api.hotel.DTO.ReservaDtoResponse;
import hotel.api.hotel.Mapper.ReservaMapper;
import hotel.api.hotel.Repostories.QuartoRepostory;
import hotel.api.hotel.Repostories.ReservaRepostory;
import hotel.api.hotel.Repostories.TipoQuartoRepostory;
import hotel.api.hotel.Repostories.UserRepostory;
import hotel.api.hotel.domain.QuartoEntity;
import hotel.api.hotel.domain.ReservaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class ReservaController {
    @Autowired
    private QuartoRepostory quartoRepostory;
    @Autowired
    private UserRepostory userRepostory;
    @Autowired
    private TipoQuartoRepostory tipoQuartoRepostory;
    @Autowired
    private ReservaRepostory reservaRepostory;

    @PostMapping(path = "/reservar")
    public String reservar(@RequestBody ReservaDtoRequest dto){
        Long userId = userRepostory.findByEmail(dto.email()).getId();
        Long quartoId = quartoRepostory.findByTipoQuarto(tipoQuartoRepostory.findByTipo(dto.tipo()).getId()).getId();
        reservaRepostory.save(new ReservaEntity(null, dto.dataEntrada(),dto.dataSaida(),userId,quartoId));

        return "sucesso";
    }
    @GetMapping(path = "/reservas/{email}")
    public List<ReservaDtoResponse> getReservas(@PathVariable String email){
        List<ReservaEntity> listaEntity = reservaRepostory.findByUserId(userRepostory.findByEmail(email).getId());
        List<ReservaDtoResponse> listaReturn = new ArrayList<>();
        for(ReservaEntity entity : listaEntity){
            listaReturn.add(new ReservaDtoResponse(entity));
        }
        return listaReturn;
    }

}
