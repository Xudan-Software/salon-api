package com.xuandjordan.salonapi.slot;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.xuandjordan.salonapi.salonservice.SalonServiceDetail;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    Set<SalonServiceDetail> availableServices;

    @ManyToOne
    private SalonServiceDetail selectedService;

    String stylistName;

    LocalDateTime slotFor;

    LocalDateTime lockedAt;

    LocalDateTime confirmedAt;

    private SlotStatus status;

}

enum SlotStatus {
    AVAILABLE, LOCKED, CONFIRMED, CANCELLED
}
