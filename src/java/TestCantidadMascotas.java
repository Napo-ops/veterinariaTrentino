import java.util.ArrayList;
import java.util.List;
import modelo.Mascota;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.HibernateUtil;


public class TestCantidadMascotas {

    
/*EJEMPLO #7*/
      public static void main(String[] args) {
        // TODO code application logic here
        List<Mascota> lista = new ArrayList<>();
        lista = listarMascota();
        int i;
        for ( i = 1; i < lista.size(); i++) {
           System.out.println("Nombre " +lista.get(i).getNombre()+ "="+i);
           

            
        }
        
          System.out.println("Cantidad:"+i);
 
        
    }
    
    public static  List<Mascota> listarMascota(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota";
        Query query =session.createQuery(hql);
        List<Mascota> miLista= query.list();
        return miLista;
    }
    
}