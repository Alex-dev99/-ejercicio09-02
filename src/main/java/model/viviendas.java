package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "viviendas")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Vivienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String titulo;

    @Column(length = 2000)
    private String descripcion;

    @Column(nullable = false, length = 80)
    private String ciudad;

    @Column(nullable = false, length = 80)
    private String provincia;

    @Column(nullable = false)
    private Integer precio;

    @Column(name = "metros_cuadrados", nullable = false)
    private Integer metrosCuadrados;

    @Column(nullable = false)
    private Integer habitaciones;

    @Column(nullable = false)
    private Integer banos;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoVivienda tipo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoVivienda estado;

    @Column(nullable = false)
    private Boolean ascensor;

    @Column(nullable = false)
    private Boolean terraza;

    @Column(nullable = false)
    private Boolean garaje;

    @Column(nullable = false)
    private Boolean disponible;

    @CreatedDate
    @Column(name = "fecha_publicacion", nullable = false)
    private LocalDate fechaPublicacion;
}
