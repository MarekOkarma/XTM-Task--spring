package xtm.xtmtask.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String brand;

    @Column
    private String model;

    @Column
    private String registrationNumber;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate releaseDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "car", orphanRemoval = true)
    private Set<CarRental> carRentals = new HashSet<>();

}
