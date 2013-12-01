package beans;

import modelo.Graduacao;
import controllers.GraduacaoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "graduacaoController")
@ViewScoped
public class GraduacaoController extends AbstractController<Graduacao> implements Serializable {

    @Inject
    private GraduacaoFacade ejbFacade;

    public GraduacaoController() {
        super(Graduacao.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
