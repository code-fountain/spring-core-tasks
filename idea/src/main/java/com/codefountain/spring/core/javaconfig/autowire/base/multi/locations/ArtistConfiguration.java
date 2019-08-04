package com.codefountain.spring.core.javaconfig.autowire.base.multi.locations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(InstrumentConfiguration.class)
public class ArtistConfiguration {

    @Value("#{instrument}")
    private Instrument instrument;

    @Bean
    public Artist artist(){
        return new Artist(instrument);
    }
}
