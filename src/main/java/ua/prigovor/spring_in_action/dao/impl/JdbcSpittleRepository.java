package ua.prigovor.spring_in_action.dao.impl;

import org.springframework.stereotype.Repository;
import ua.prigovor.spring_in_action.dao.SpittleRepository;
import ua.prigovor.spring_in_action.entity.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Prigovor on 25.08.2017.
 */

@Repository
public class JdbcSpittleRepository implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i = 0; i < count; i++) {
            spittles.add(
                    new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }

    @Override
    public Spittle findOne(long spittleId) {
        return null;
    }
}
