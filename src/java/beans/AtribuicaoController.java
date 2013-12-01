package beans;

import modelo.Atribuicao;
import controllers.AtribuicaoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "atribuicaoController")
@ViewScoped
public class AtribuicaoController extends AbstractController<Atribuicao> implements Serializable {

    @Inject
    private AtribuicaoFacade ejbFacade;

    public AtribuicaoController() {
        super(Atribuicao.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
