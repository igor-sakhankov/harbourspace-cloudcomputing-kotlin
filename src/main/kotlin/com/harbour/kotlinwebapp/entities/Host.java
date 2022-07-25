package com.harbour.kotlinwebapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
public class Host {

    @Id
    public long id;

    public String host;
}
