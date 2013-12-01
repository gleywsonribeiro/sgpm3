package beans;

import modelo.Endereco;
import controllers.EnderecoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "enderecoController")
@ViewScoped
public class EnderecoController extends AbstractController<Endereco> implements Serializable {

    @Inject
    private EnderecoFacade ejbFacade;

    public EnderecoController() {
        super(Endereco.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
