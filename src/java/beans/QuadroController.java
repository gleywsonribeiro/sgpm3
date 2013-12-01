package beans;

import modelo.Quadro;
import controllers.QuadroFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "quadroController")
@ViewScoped
public class QuadroController extends AbstractController<Quadro> implements Serializable {

    @Inject
    private QuadroFacade ejbFacade;

    public QuadroController() {
        super(Quadro.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
