package beans;

import modelo.Moradia;
import controllers.MoradiaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "moradiaController")
@ViewScoped
public class MoradiaController extends AbstractController<Moradia> implements Serializable {

    @Inject
    private MoradiaFacade ejbFacade;

    public MoradiaController() {
        super(Moradia.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
