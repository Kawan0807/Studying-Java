package br.com.alura.mvc.mudi.Controller;

import br.com.alura.mvc.mudi.DTO.RequisicaoNovoPedido;
import br.com.alura.mvc.mudi.Model.Pedido;
import br.com.alura.mvc.mudi.Model.User;
import br.com.alura.mvc.mudi.Repository.PedidoRepository;
import br.com.alura.mvc.mudi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("formulario")
    public String formulario(RequisicaoNovoPedido requisicao) {
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult resulte) {

        if (resulte.hasErrors()) {
            return "pedido/formulario";
        }

        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByUsername(username);

        Pedido pedido = requisicao.toPedido();
        pedido.setUser(user);

        pedidoRepository.save(pedido);
        return "redirect:/home";
    }
}
