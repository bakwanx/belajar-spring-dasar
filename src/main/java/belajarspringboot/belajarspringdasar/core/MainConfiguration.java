package belajarspringboot.belajarspringdasar.core;

import belajarspringboot.belajarspringdasar.core.configuration.BarConfiguration;
import belajarspringboot.belajarspringdasar.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {



}
