package com.satyen.userservice.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@DiscriminatorValue("Vendor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document
public class Vendor extends User {
    @Column(name = "vendordetails")
    private String vendorType; // e.g., plumber, electrician, carpenter
//    private long vendorId;
}
