package com.satyen.userservice.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document
@DiscriminatorValue("Resident")
public class Resident extends User {
    @Column(name = "isowner")
    private Boolean isOwner;
//
//    @OneToMany(mappedBy = "user")
//    private List<Apartment> apartments;

}
