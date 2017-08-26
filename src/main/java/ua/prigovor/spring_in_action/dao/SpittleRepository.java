package ua.prigovor.spring_in_action.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ua.prigovor.spring_in_action.entity.Spittle;

import java.util.List;

/**
 * Created by Prigovor on 25.08.2017.
 */

public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);

}