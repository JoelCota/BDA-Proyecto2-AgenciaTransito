/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

//imports
import Dominio.Persona;
import excepciones.PersistenciaException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Predicate;

import Interfaces.IPersonasDAO;

/**
 * Clase DAO para hacer todas las consultas relacionada con el tema de la
 * Persona.
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public class PersonasDAO implements IPersonasDAO {
    //OBJETO CONEXION

    //Se obtiene la conexion.
    ConexionBD conexion = new ConexionBD();

    /**
     *  
     * Metodo para la creacion de la persona y que se refleje en la base de datos.
     * @param persona Objeto de tipo persona.
     * @throws PersistenciaException Excepciones (evita erroes).
     */
    @Override
    public void agregarPersona(Persona persona) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();

        try {
            bd.getTransaction().begin();//entre a la base de datos
            bd.persist(persona);
            bd.getTransaction().commit();//cerre conexion
        } catch (Exception e) {
            bd.getTransaction().rollback();
            throw new PersistenciaException("No se puedo guardar la persona." + e.getMessage());
        } finally {
            bd.close();
        }

    }

    /**
     * 
     * Metodo para buscar a una persona ppor medio del rfc de la persona misma.
     * @param RFC String RFC de la persona.
     * @return retorna la persona.
     * @throws PersistenciaException Excepciones (evita erroes).
     */
    @Override
    public Persona buscarPersonaRFC(String RFC) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();
        
        try{
            bd.getTransaction().begin();//entre a la base de datos
        CriteriaBuilder builder = bd.getCriteriaBuilder();
        CriteriaQuery<Persona> consulta = builder.createQuery(Persona.class);//solo se conecta en el java
        Root<Persona> root = consulta.from(Persona.class);
        consulta.select(root).where(builder.equal(root.get("RFC"), RFC));
        TypedQuery<Persona> resultado = bd.createQuery(consulta); // se conecta a la base de datos
        Persona persona=resultado.getSingleResult();
        bd.getTransaction().commit();
        return persona;
        }catch(Exception e){
            bd.getTransaction().rollback();
            throw new PersistenciaException("No se puedo guardar la persona." + e.getMessage());
        }
    }

    public List<Persona> buscarPersonasPorNombre(String nombre) {
        EntityManager bd = conexion.obtenerConexion();
        bd.getTransaction().begin();
        CriteriaBuilder cb = bd.getCriteriaBuilder();
        CriteriaQuery<Persona> cq = cb.createQuery(Persona.class);
        Root<Persona> root = cq.from(Persona.class);
        Predicate nombreLike = cb.like(root.get("nombreCompleto"), nombre + "%");
        cq.where(nombreLike);
        List<Persona> personas = bd.createQuery(cq).getResultList();
        bd.getTransaction().commit();
            return personas;
    }

    /**
     * 
     * Metodo hardcodeado para la creacion de las 20 personas explicitamente en la
     * base de datos.
     * @throws PersistenciaException  Excepciones (evita erroes).
     */
    @Override
    public void invocarPersonas() throws PersistenciaException {

        Persona persona1 = new Persona("ABC123456", "555-1234", "Juan Perez", new GregorianCalendar(1990, Calendar.AUGUST, 15));
        Persona persona2 = new Persona("DEF123456", "555-5678", "Maria Garcia", new GregorianCalendar(1991, Calendar.JANUARY, 25));
        Persona persona3 = new Persona("GHI123456", "555-9101", "Pedro Hernandez", new GregorianCalendar(1989, Calendar.DECEMBER, 5));
        Persona persona4 = new Persona("JKL123456", "555-1213", "Laura Rodriguez", new GregorianCalendar(1992, Calendar.APRIL, 10));
        Persona persona5 = new Persona("MNO123456", "555-1415", "Francisco Gomez", new GregorianCalendar(1995, Calendar.JULY, 20));
        Persona persona6 = new Persona("PQR123456", "555-1617", "Ana Torres", new GregorianCalendar(1987, Calendar.MARCH, 2));
        Persona persona7 = new Persona("STU123456", "555-1819", "Luisa Vargas", new GregorianCalendar(1993, Calendar.SEPTEMBER, 12));
        Persona persona8 = new Persona("VWX123456", "555-2021", "Roberto Sanchez", new GregorianCalendar(1996, Calendar.MAY, 30));
        Persona persona9 = new Persona("YZA123456", "555-2223", "Isabel Cruz", new GregorianCalendar(1988, Calendar.FEBRUARY, 8));
        Persona persona10 = new Persona("BCD123456", "555-2425", "Javier Mendoza", new GregorianCalendar(1994, Calendar.OCTOBER, 18));
        Persona persona11 = new Persona("EFG123456", "555-2627", "Miguel Castro", new GregorianCalendar(1997, Calendar.AUGUST, 9));
        Persona persona12 = new Persona("HIJ123456", "555-2829", "Carolina Aguilar", new GregorianCalendar(1985, Calendar.NOVEMBER, 27));
        Persona persona13 = new Persona("KLM123456", "555-3031", "Fernando Hernandez", new GregorianCalendar(1998, Calendar.JANUARY, 7));
        Persona persona14 = new Persona("NOP123456", "555-3233", "Martha Ruiz", new GregorianCalendar(1999, Calendar.MAY, 17));
        Persona persona15 = new Persona("QRS123456", "555-3435", "Luis Martinez", new GregorianCalendar(1986, Calendar.JULY, 22));
        Persona persona16 = new Persona("TUV123456", "555-3637", "Sofia Hernandez", new GregorianCalendar(1992, Calendar.MARCH, 14));
        Persona persona17 = new Persona("WXY123456", "555-3839", "Daniel Ramirez", new GregorianCalendar(1993, Calendar.APRIL, 16));
        Persona persona18 = new Persona("ZAB123456", "555-4041", "Lucia Garcia", new GregorianCalendar(1989, Calendar.DECEMBER, 12));
        Persona persona19 = new Persona("CDE123456", "555-4243", "David Gonzalez", new GregorianCalendar(1997, Calendar.JUNE, 28));
        Persona persona20 = new Persona("FGH123456", "555-4445", "Elena Torres", new GregorianCalendar(1988, Calendar.SEPTEMBER, 8));
        Persona[] persona = {persona1, persona2, persona3, persona4, persona5, persona6,
            persona7, persona8, persona9, persona10, persona11, persona12, persona13, persona14,
            persona15, persona16, persona17, persona18, persona19, persona20};
        for (Persona personas : persona) {
            this.agregarPersona(personas);
        }
    }

    /**
     * 
     * Metodo que consulta las personas totales que existen por medio de una lista.
     * @return retorna objeto persona
     * @throws PersistenciaException Excepciones (evita erroes).
     */
    public List<Persona> consultaPersonasTotal() throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();

        bd.getTransaction().begin();
        List<Persona> personas = bd.createQuery("Select p from Persona p", Persona.class).getResultList();
        bd.getTransaction().commit();//cerre conexion
        return personas;
    }
    
    
    public List<Persona> buscarFecha(int anio) {
        EntityManager bd = conexion.obtenerConexion();
        try {
            CriteriaBuilder cb = bd.getCriteriaBuilder();
            CriteriaQuery<Persona> cq = cb.createQuery(Persona.class);
            Root<Persona> root = cq.from(Persona.class);
            Predicate predicate = cb.equal(cb.function("YEAR", Integer.class, root.get("fechaNacimiento")), anio);
            cq.select(root).where(predicate);
            TypedQuery<Persona> query = bd.createQuery(cq);
            return query.getResultList();
        } finally {
            bd.close();
        }
    }

}
