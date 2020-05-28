
import java.util.ArrayList;
import java.util.List;
import modelo.Mascota;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtil;


/*EJEMPLO #4*/
public class TestPastorAleman {

    public static void main(String[] args) {
        // TODO code application logic here
        List<Mascota> listaPerroAleman = new ArrayList<>();

        listaPerroAleman = actualizaPastoAleman();

        for (int i = 0; i < listaPerroAleman.size(); i++) {

            System.out.println("Raza:" + listaPerroAleman.get(i).getRaza());

        }

    }

    public static List<Mascota> actualizaPastoAleman() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota where raza ='pastor aleman'";
        Query query = session.createQuery(hql);
        List<Mascota> miLista = query.list();
        return miLista;

    }

}
