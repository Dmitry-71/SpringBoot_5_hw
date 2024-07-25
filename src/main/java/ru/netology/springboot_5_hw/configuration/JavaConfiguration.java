package ru.netology.springboot_5_hw.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springboot_5_hw.systemProfile.DevProfile;
import ru.netology.springboot_5_hw.systemProfile.ProductionProfile;
import ru.netology.springboot_5_hw.systemProfile.SystemProfile;

@Configuration
public class JavaConfiguration {
    @Bean(name = "devProfile")
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "true", matchIfMissing = true)
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean(name = "prodProfile")
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
