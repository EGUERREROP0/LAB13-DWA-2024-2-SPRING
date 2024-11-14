package ejemplo.tecsup.SPRING_REACT.repository;

import ejemplo.tecsup.SPRING_REACT.model.Cliente;
import ejemplo.tecsup.SPRING_REACT.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}

