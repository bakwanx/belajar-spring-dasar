package belajarspringboot.belajarspringdasar.core.configuration;

import belajarspringboot.belajarspringdasar.core.data.Bar;
import belajarspringboot.belajarspringdasar.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar(){
        return new Bar();
    }

}
