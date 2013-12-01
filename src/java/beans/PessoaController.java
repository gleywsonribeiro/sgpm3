package beans;

import modelo.Pessoa;
import controllers.PessoaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "pessoaController")
@ViewScoped
public class PessoaController extends AbstractController<Pessoa> implements Serializable {

    @Inject
    private PessoaFacade ejbFacade;

    public PessoaController() {
        super(Pessoa.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
