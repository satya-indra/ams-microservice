package com.satyen.userservice.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document
@DiscriminatorValue("Visitor")
public class Visitor extends User {
    @Column(name = "visitpurpose")
    private String visitorType; // e.g., guest, vendor, domestic help
}
