package beans;

import modelo.TipoAtribuicao;
import controllers.TipoAtribuicaoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "tipoAtribuicaoController")
@ViewScoped
public class TipoAtribuicaoController extends AbstractController<TipoAtribuicao> implements Serializable {

    @Inject
    private TipoAtribuicaoFacade ejbFacade;

    public TipoAtribuicaoController() {
        super(TipoAtribuicao.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
