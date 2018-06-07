package br.com.db1.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.management.Query;
import javax.persistence.EntityManager;

import br.com.db1.dao.DAO;
import br.com.db1.start.classes.Cidade;

public class CidadeDao implements DAO<Cidade> {

	@Inject
	private EntityManager entityManager;

	public List<Cidade> findAll() {
		return entityManager.
				createQuery("Select from cidade").
				getResultList();
	}

	public Cidade findById(Long id) {
		entityManager.createQuery("select c from cidade c where id = :pId").setParameter("pId", id);
		return null;
		}

	public List<Cidade> findByName(String name) {
		return null;
	}

	public boolean save(Cidade t) {
		return false;
	}

	public boolean delete(Long id) {
		return false;
	}

}
