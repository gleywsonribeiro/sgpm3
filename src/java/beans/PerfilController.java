package beans;

import modelo.Perfil;
import controllers.PerfilFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "perfilController")
@ViewScoped
public class PerfilController extends AbstractController<Perfil> implements Serializable {

    @Inject
    private PerfilFacade ejbFacade;

    public PerfilController() {
        super(Perfil.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
