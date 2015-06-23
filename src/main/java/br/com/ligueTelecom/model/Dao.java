/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ligueTelecom.model;

import br.com.ligueTelecom.Bean.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author popovicz
 */
public class Dao<T> {

    private Class<T> classe;

    public Dao(Class classe) {
        this.classe = classe;
    }

    public void adiciona(T entity) {
//        EntityManager em = new JPAUtil().getEntityManager();
//        em.getTransaction().begin();
//        em.persist(entity);
//        em.flush();
//        em.getTransaction().commit();
//        em.close();
    }

    public void edit(T entity) {
//        EntityManager em = new JPAUtil().getEntityManager();
//        em.getTransaction().begin();
//        em.merge(entity);
//        em.flush();
//        em.getTransaction().commit();
//        em.close();
    }

    public T get(Long id) {
//        EntityManager em = new JPAUtil().getEntityManager();
//        return (T) em.find(classe, id);
        return null;
    }

    public void removePorId(Long id) {
//        EntityManager em = new JPAUtil().getEntityManager();
//        T entity = get(id);
//        if (entity == null) {
//            return;
//        }
//        em.getTransaction().begin();
//        em.remove(em.merge(entity));
//        em.getTransaction().commit();
//        em.close();
    }

    public void remove(T entity) {
//        EntityManager em = new JPAUtil().getEntityManager();
//        if (entity == null) {
//            return;
//        }
//        em.getTransaction().begin();
//        em.remove(entity);
//        em.getTransaction().commit();
//        em.close();
    }

    public List<T> listaTodos() {
//        EntityManager em = new JPAUtil().getEntityManager();
//        return em.createQuery("FROM " + classe.getSimpleName()).getResultList();
        return null;
    }

    private Cliente cliente;
    private ArrayList<Cliente> clientes;

    public List<T> listaNova() {

        cliente = new Cliente();
        clientes = new ArrayList<Cliente>();
        
        clientes.add(new Cliente(1, "willian", "popovicz@gmail.com", "10919902", "24906"));
        clientes.add(new Cliente(2,"robinho", "popovicz@gmail.com", "109199028", "8906"));
        clientes.add(new Cliente(3,"carlos", "popovicz@gmail.com", "109199028", "02406"));
        clientes.add(new Cliente(4,"fernandinho", "popovicz@gmail.com", "109199028", "796"));
        clientes.add(new Cliente(5,"tibé", "popovicz@gmail.com", "109199028", "848"));
        clientes.add(new Cliente(6,"noix", "popovicz@gmail.com", "109199028", "806"));

        return (List<T>) clientes;
    }
    
    public List<T> listaPorNome(String name) {
        System.out.println(name);
        System.out.println("willian");
        cliente = new Cliente();
        clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente(1, "robinho", "robson@gmail.com", "10919902", "24906"));
        clientes.add(new Cliente(2,"robinho", "robinho@gmail.com", "9028", "8906"));       

        return (List<T>) clientes;
    }
    
    public T buscaPorId(Long id) {
//        EntityManager em = new JPAUtil().getEntityManager();
//        T instancia = em.find(classe, id);
//        em.close();
//        return instancia;
        return null;
    }

    public List<T> listaPorId(Long parametro) {
//        EntityManager em = new JPAUtil().getEntityManager();
//        Query q = em.createQuery("FROM " + classe.getSimpleName() + " WHERE Id = :id");
//        q.setParameter("id", parametro);
//        return q.getResultList();
        return null;
    }

    public List<T> listNome(String nome) {
//        EntityManager em = new JPAUtil().getEntityManager();
//        Query q = em.createQuery("FROM " + classe.getSimpleName() + " WHERE nome LIKE '%" + nome + "%'");
//        return q.getResultList();
        return null;
    }

    public List<T> listFila(String condicao) {
//        EntityManager em = new JPAUtil().getEntityManager();
//        Query q = em.createQuery("FROM cliente inner join instalacao \n"
//                + "on instalacao.id = cliente.instalacao_id and instalacao.situação LIKE '%" + condicao + "%'");
//        return q.getResultList();
        return null;
    }

    public void update(T entity) {
//        EntityManager em = new JPAUtil().getEntityManager();
//        em.getTransaction().begin();
//        em.merge(entity);
//        em.flush();
//        em.getTransaction().commit();
//        em.close();

    }

    public void Metodo() {
    }
}
