package beans;

import modelo.Religiao;
import controllers.ReligiaoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "religiaoController")
@ViewScoped
public class ReligiaoController extends AbstractController<Religiao> implements Serializable {

    @Inject
    private ReligiaoFacade ejbFacade;

    public ReligiaoController() {
        super(Religiao.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
