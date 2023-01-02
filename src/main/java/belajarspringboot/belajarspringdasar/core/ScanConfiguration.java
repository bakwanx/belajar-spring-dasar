package belajarspringboot.belajarspringdasar.core;

import belajarspringboot.belajarspringdasar.core.configuration.BarConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "belajarspringboot.belajarspringdasar.core.configuration"
})
public class ScanConfiguration {

}
