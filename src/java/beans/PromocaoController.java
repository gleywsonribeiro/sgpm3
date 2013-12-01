package beans;

import modelo.Promocao;
import controllers.PromocaoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "promocaoController")
@ViewScoped
public class PromocaoController extends AbstractController<Promocao> implements Serializable {

    @Inject
    private PromocaoFacade ejbFacade;

    public PromocaoController() {
        super(Promocao.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
