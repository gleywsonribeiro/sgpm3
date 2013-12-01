package beans;

import modelo.Internacao;
import controllers.InternacaoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "internacaoController")
@ViewScoped
public class InternacaoController extends AbstractController<Internacao> implements Serializable {

    @Inject
    private InternacaoFacade ejbFacade;

    public InternacaoController() {
        super(Internacao.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
