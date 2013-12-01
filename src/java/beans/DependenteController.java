package beans;

import modelo.Dependente;
import controllers.DependenteFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "dependenteController")
@ViewScoped
public class DependenteController extends AbstractController<Dependente> implements Serializable {

    @Inject
    private DependenteFacade ejbFacade;

    public DependenteController() {
        super(Dependente.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
