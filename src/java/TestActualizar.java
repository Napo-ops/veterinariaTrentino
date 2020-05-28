
import modelo.Mascota;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;


public class TestActualizar {

  /*EJEMPLO #3*/
    
    public static void main(String[] args) {
  
         Mascota mimascota= new Mascota();
        
        mimascota.setIdMascota(6);
        mimascota.setNombre("sam");
        mimascota.setEdad(5);
        mimascota.setNombreDueno("Natalia");
        mimascota.setRaza("Pitbull");
        String mensaje = actualizaMascota(mimascota);
        System.out.println(mensaje);
        
        

    }
    
    
    
    public static String actualizaMascota(Mascota mascota)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.update(mascota);
        transaction.commit();
        session.close();
        return  "Actualizado correctamente";
        
    }
    
   
    
}
