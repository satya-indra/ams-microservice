package com.satyen.user_management.entity.auditlogs;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "AuditLogs")
 class AuditLogs {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private UUID logId;
    private UUID userId;
    private ActivityType activityType;
    private Date timestamp;
    private String description;
}
