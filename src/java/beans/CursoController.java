package beans;

import modelo.Curso;
import controllers.CursoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "cursoController")
@ViewScoped
public class CursoController extends AbstractController<Curso> implements Serializable {

    @Inject
    private CursoFacade ejbFacade;

    public CursoController() {
        super(Curso.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
