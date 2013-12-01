package beans;

import modelo.Deslocamento;
import controllers.DeslocamentoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "deslocamentoController")
@ViewScoped
public class DeslocamentoController extends AbstractController<Deslocamento> implements Serializable {

    @Inject
    private DeslocamentoFacade ejbFacade;

    public DeslocamentoController() {
        super(Deslocamento.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
