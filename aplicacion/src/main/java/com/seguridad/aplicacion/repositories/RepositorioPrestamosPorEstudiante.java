package com.seguridad.aplicacion.repositories;


import com.seguridad.aplicacion.models.PrestamosPorEstudiante;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.SqlResultSetMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
@SqlResultSetMapping(
        name = "PrestamoPorEstudiante",
        classes = @ConstructorResult(
                targetClass = PrestamosPorEstudiante.class,
                columns = {
                        @ColumnResult(name="id_prestamo",type = int.class),
                        @ColumnResult(name="titulo",type = String.class),
                        @ColumnResult(name = "fecha_inicio",type = Date.class),
                        @ColumnResult(name = "fecha_fin", type = Date.class)
                }
        )
)
public interface RepositorioPrestamosPorEstudiante extends JpaRepository<PrestamosPorEstudiante, Integer> {

    @Query(value = "SELECT prestamos.id_prestamo, libros.titulo, prestamos.fecha_inicio, prestamos.fecha_fin" +
            " FROM prestamos INNER JOIN alumnos ON prestamos.estudiante = alumnos.numero_control " +
            "INNER JOIN libros ON prestamos.libro = libros.codigo WHERE alumnos.nombre like :nombre%", nativeQuery = true)
    public List<PrestamosPorEstudiante> getPrestamosPorEstudiante(@Param("nombre") String nombre);
}
