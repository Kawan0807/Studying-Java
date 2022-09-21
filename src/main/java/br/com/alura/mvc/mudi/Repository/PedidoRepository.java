package br.com.alura.mvc.mudi.Repository;

import br.com.alura.mvc.mudi.Model.Pedido;
import br.com.alura.mvc.mudi.Model.StatusPedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {

    List<Pedido> findByStatus(StatusPedido status);

    /* public List<Pedido> findAll ();
*/
   /* public List<Pedido> recuperaTodosOsPedidos(){
        Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
        return query.getResultList();
    }*/
}
