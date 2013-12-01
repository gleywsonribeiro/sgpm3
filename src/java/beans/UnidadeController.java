package beans;

import modelo.Unidade;
import controllers.UnidadeFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "unidadeController")
@ViewScoped
public class UnidadeController extends AbstractController<Unidade> implements Serializable {

    @Inject
    private UnidadeFacade ejbFacade;

    public UnidadeController() {
        super(Unidade.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
