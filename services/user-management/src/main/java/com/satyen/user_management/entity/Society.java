package com.satyen.user_management.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Data
@Entity
@Table(name = "Societies")
public class Society {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID societyId;

    @Column(nullable = false)
    private String societyName;

    @Column(nullable = false)
    private String address;
}
