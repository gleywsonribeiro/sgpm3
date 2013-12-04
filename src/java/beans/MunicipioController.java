package beans;

import modelo.Atribuicao;
import controllers.AtribuicaoFacade;
import controllers.MunicipioFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;
import modelo.Municipio;

@Named(value = "municipioController")
@ViewScoped
public class MunicipioController extends AbstractController<Municipio> implements Serializable {

    @Inject
    private MunicipioFacade ejbFacade;

    public MunicipioController() {
        super(Municipio.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
