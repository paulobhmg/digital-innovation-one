package com.dev.paulonogueira.citiesapi.domain.model;

import com.dev.paulonogueira.citiesapi.domain.util.PointType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "cities")
@TypeDefs({@TypeDef(name = "point", typeClass = PointType.class)})
public class City {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private State state;

    @Column
    private Integer ibge;

    @Column(name = "lat_lon")
    private String geolocalization;

    @Column
    private Double latitude;

    @Column
    private Double longitude;

    @Column(name = "cod_tom")
    private Short tomCode;

    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;
}
