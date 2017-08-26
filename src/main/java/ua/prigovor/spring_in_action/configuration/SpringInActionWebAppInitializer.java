package ua.prigovor.spring_in_action.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Prigovor on 24.08.2017.
 * <p>
 * Этот класс конфигурирует DispatcherServlet.
 * Устанавливает другие класы конфигураций и настройки отображеня.
 */

public class SpringInActionWebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Мтод показывает из каких клаасов конфигураций загружать
     * бины в контекст созданый ContextLoaderListener.
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class, DataConfig.class};
    }

    /**
     * Мтод показывает из каких клаасов конфигураций DispatcherServlet будет
     * загружать бины в DispatcherServlet’s application context.
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * Этот метод определяет URL который будет обрабатывать сервлет.
     * Если указан "/" то сервлет будет обрабатывать все поступающие от клиента
     * запросы.
     */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}