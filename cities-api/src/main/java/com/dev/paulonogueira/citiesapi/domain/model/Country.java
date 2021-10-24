package com.dev.paulonogueira.citiesapi.domain.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "countries")
public class Country {

    @Id @EqualsAndHashCode.Include
    private Long id;

    private String name;

    @Column(name = "name_pt")
    private String portugueseName;

    private String sigle;

    private Integer bacen;
}
