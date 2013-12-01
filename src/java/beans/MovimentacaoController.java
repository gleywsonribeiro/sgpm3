package beans;

import modelo.Movimentacao;
import controllers.MovimentacaoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "movimentacaoController")
@ViewScoped
public class MovimentacaoController extends AbstractController<Movimentacao> implements Serializable {

    @Inject
    private MovimentacaoFacade ejbFacade;

    public MovimentacaoController() {
        super(Movimentacao.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
