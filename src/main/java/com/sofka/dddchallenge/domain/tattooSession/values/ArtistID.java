package com.sofka.dddchallenge.domain.tattooSession.values;

import co.com.sofka.domain.generic.Identity;

public class ArtistID extends Identity {

    public ArtistID() {}

    private ArtistID(String id){
        super(id);
    }

    public ArtistID of(String id){
        return new ArtistID(id);
    }
}
