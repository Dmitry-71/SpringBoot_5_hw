package ru.netology.springboot_5_hw.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springboot_5_hw.systemProfile.DevProfile;
import ru.netology.springboot_5_hw.systemProfile.ProductionProfile;
import ru.netology.springboot_5_hw.systemProfile.SystemProfile;

@Configuration
public class JavaConfiguration {
    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
