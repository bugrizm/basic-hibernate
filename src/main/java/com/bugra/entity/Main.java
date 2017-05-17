package com.bugra.entity;

import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main
{
    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");

        EntityManager em = emf.createEntityManager();
        if(em == null) {
            throw new RuntimeException("Entity manager is null");
        }

        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<String> query = builder.createQuery(String.class);
        Root<Person> root = query.from(Person.class);
        query.select(root.get("name"));

        ParameterExpression<List> nameParameter = builder.parameter(List.class, "name");
        query.where(root.get("name").in(nameParameter));

        //select p.name from Person p where p.name in ('bugra' , 'gulsabah')
        List<String> personList =
            em.createQuery(query)
                .setParameter(nameParameter, Arrays.asList("bugra", "gulsabah"))
                .getResultList();

        for(String p : personList) {
            logger.info(p);
        }

        em.close();
        emf.close();
    }


    static class A {


        public <T> boolean test(final T id) {
            System.out.println(id);
            return true;
        }

    }

    static class B extends A {

        @Override
        public <T> boolean test(final T id) {
            return false;
        }
    }

}
