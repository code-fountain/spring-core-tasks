package com.codefountain.spring.core.javaconfig.autowire.base.config;

public class Artist {

    private Instrument instrument;

    public Artist(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "instrument=" + instrument +
                '}';
    }
}
