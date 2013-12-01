package beans;

import modelo.DispensaLicenca;
import controllers.DispensaLicencaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "dispensaLicencaController")
@ViewScoped
public class DispensaLicencaController extends AbstractController<DispensaLicenca> implements Serializable {

    @Inject
    private DispensaLicencaFacade ejbFacade;

    public DispensaLicencaController() {
        super(DispensaLicenca.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
