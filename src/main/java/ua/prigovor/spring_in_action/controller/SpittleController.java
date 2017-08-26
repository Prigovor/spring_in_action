package ua.prigovor.spring_in_action.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.prigovor.spring_in_action.dao.SpittleRepository;
import ua.prigovor.spring_in_action.entity.Spittle;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by Prigovor on 25.08.2017.
 */

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private final SpittleRepository spittleRepository;
    private final String MAX_LONG_AS_STRING = "9223372036854775807";

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = GET)
    public String spittles(Model model) {
        model.addAttribute(
                spittleRepository.findSpittles(
                        Long.MAX_VALUE, 20));
        return "spittles";
    }

/*    @RequestMapping(method = GET)
    public List<Spittle> spittles(
            @RequestParam(value = "max",
                    defaultValue = MAX_LONG_AS_STRING) long max,
            @RequestParam(value = "count",
                    defaultValue = "20") int count) {
        return spittleRepository.findSpittles(max, count);
    }*/
}
