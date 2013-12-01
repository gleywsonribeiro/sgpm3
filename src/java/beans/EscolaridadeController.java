package beans;

import modelo.Escolaridade;
import controllers.EscolaridadeFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "escolaridadeController")
@ViewScoped
public class EscolaridadeController extends AbstractController<Escolaridade> implements Serializable {

    @Inject
    private EscolaridadeFacade ejbFacade;

    public EscolaridadeController() {
        super(Escolaridade.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
