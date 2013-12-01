package beans;

import modelo.EstadoCivil;
import controllers.EstadoCivilFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "estadoCivilController")
@ViewScoped
public class EstadoCivilController extends AbstractController<EstadoCivil> implements Serializable {

    @Inject
    private EstadoCivilFacade ejbFacade;

    public EstadoCivilController() {
        super(EstadoCivil.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
