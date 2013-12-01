package beans;

import modelo.Sangue;
import controllers.SangueFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "sangueController")
@ViewScoped
public class SangueController extends AbstractController<Sangue> implements Serializable {

    @Inject
    private SangueFacade ejbFacade;

    public SangueController() {
        super(Sangue.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
