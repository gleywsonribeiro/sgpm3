package beans;

import modelo.SituacaoFuncional;
import controllers.SituacaoFuncionalFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "situacaoFuncionalController")
@ViewScoped
public class SituacaoFuncionalController extends AbstractController<SituacaoFuncional> implements Serializable {

    @Inject
    private SituacaoFuncionalFacade ejbFacade;

    public SituacaoFuncionalController() {
        super(SituacaoFuncional.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
