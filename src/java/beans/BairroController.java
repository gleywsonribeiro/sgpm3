package beans;

import modelo.Bairro;
import controllers.BairroFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "bairroController")
@ViewScoped
public class BairroController extends AbstractController<Bairro> implements Serializable {

    @Inject
    private BairroFacade ejbFacade;

    public BairroController() {
        super(Bairro.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
