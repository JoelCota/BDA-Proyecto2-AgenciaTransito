/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Principal;

import Frames.frmMenu;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class ProyectoBDA_AgenciaTransito {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        new frmMenu().setVisible(true);
//         EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("persistenciaDatos");
//        EntityManager em = managerFactory.createEntityManager();
//        em.getTransaction().begin();
//        em.getTransaction().commit();
        
            frmMenu menu = new frmMenu();
            menu.setVisible(true);
    }
}
