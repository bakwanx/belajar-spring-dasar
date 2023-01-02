package belajarspringboot.belajarspringdasar.core;

import belajarspringboot.belajarspringdasar.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "belajarspringboot.belajarspringdasar.core.repository",
        "belajarspringboot.belajarspringdasar.core.service",
        "belajarspringboot.belajarspringdasar.core.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {

}
