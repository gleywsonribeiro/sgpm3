package beans;

import modelo.Contato;
import controllers.ContatoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "contatoController")
@ViewScoped
public class ContatoController extends AbstractController<Contato> implements Serializable {

    @Inject
    private ContatoFacade ejbFacade;

    public ContatoController() {
        super(Contato.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
