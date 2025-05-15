package com.ltop.DAO;

import com.ltop.models.Automoveis;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class AutomoveisDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public AutomoveisDAO() {
        emf = Persistence.createEntityManagerFactory("automovelPU");
        em = emf.createEntityManager();
    }

    // Método para salvar um novo carro
    public void salvar(Automoveis automovel) {
        em.getTransaction().begin();
        em.persist(automovel);
        em.getTransaction().commit();
    }

    // Método para buscar todos os automóveis
    public List<Automoveis> buscarTodos() {
        return em.createQuery("SELECT a FROM Automoveis a", Automoveis.class).getResultList();
    }

    // Método para buscar automóvel por ID
    public Automoveis buscarPorId(int id) {
        return em.find(Automoveis.class, id);
    }

    // Fechar a conexão com o banco
    public void fechar() {
        em.close();
        emf.close();
    }
}
