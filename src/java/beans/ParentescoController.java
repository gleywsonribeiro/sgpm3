package beans;

import modelo.Parentesco;
import controllers.ParentescoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "parentescoController")
@ViewScoped
public class ParentescoController extends AbstractController<Parentesco> implements Serializable {

    @Inject
    private ParentescoFacade ejbFacade;

    public ParentescoController() {
        super(Parentesco.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
