
import Controladores.NodoController;
import Modelos.Lista;
import Vistas.frmNodos;
import Vistas.frmPrincipal;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmNodos VistaNodos = new frmNodos(VistaPrincipal, true);
        Lista NuevaLista = new Lista();
        
        //LEVANTAR EL CONTROLADOR
        NodoController NuevoControlador = new NodoController(VistaPrincipal, VistaNodos, NuevaLista);
    }
    
}
