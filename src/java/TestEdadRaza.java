
import java.util.ArrayList;
import java.util.List;
import modelo.Mascota;
import org.hibernate.Query;
import org.hibernate.Session;
import utils.HibernateUtil;

public class TestEdadRaza {

/*EJEMPLO #6*/
    public static void main(String[] args) {
        // TODO code application logic here
        List<Mascota> lista1 = new ArrayList<>();
   
        lista1 = nombreEdad();
       
        for (int i = 0; i < lista1.size(); i++) {
           System.out.println("Edad: " + lista1.get(i).getEdad() +", "+" Raza: "+ lista1.get(i).getRaza());

        }

    }

    public static List<Mascota> nombreEdad() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota where edad =3 and raza= 'pastor Aleman'";
        Query query = session.createQuery(hql);
        List<Mascota> miLista = query.list();
        return miLista;
    }

 

}
