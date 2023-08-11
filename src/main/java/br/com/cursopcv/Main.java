package br.com.cursopcv;

import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static  void Main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NomeDaUnidadeDePersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
    }
}
