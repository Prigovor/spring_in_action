package ua.prigovor.spring_in_action.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Prigovor on 24.08.2017.
 */

@Configuration
@ComponentScan(basePackages = {"ua.prigovor.spring_in_action"},
        excludeFilters = {
                @Filter(type = FilterType.ANNOTATION,
                        value = EnableWebMvc.class)
        })
public class RootConfig {
}
