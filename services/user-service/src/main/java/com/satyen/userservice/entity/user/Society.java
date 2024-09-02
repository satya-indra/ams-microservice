package com.satyen.userservice.entity.user;

import jakarta.persistence.*;

import java.util.UUID;


public class Society {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID societyId;

    @Column(nullable = false)
    private String societyName;

    @Column(nullable = false)
    private String address;
}
