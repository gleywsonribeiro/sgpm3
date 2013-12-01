package beans;

import modelo.Punicao;
import controllers.PunicaoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "punicaoController")
@ViewScoped
public class PunicaoController extends AbstractController<Punicao> implements Serializable {

    @Inject
    private PunicaoFacade ejbFacade;

    public PunicaoController() {
        super(Punicao.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
