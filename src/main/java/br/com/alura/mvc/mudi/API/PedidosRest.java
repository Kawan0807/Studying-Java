package br.com.alura.mvc.mudi.API;

import java.util.List;

import br.com.alura.mvc.mudi.Model.Pedido;
import br.com.alura.mvc.mudi.Model.StatusPedido;
import br.com.alura.mvc.mudi.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/pedidos")
public class PedidosRest {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("aguardando")
    public List<Pedido> getPedidosAguardandoOfertas() {
        Sort sort = Sort.by("id").descending();
        PageRequest paginacao = PageRequest.of(0, 10, sort);

        return pedidoRepository.findByStatus(StatusPedido.AGUARDANDO, paginacao);
    }
}

