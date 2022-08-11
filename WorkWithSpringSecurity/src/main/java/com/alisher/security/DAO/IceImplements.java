package com.alisher.security.DAO;

import com.alisher.security.model.IceCream;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IceImplements implements IceDAO{
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public void addIce(IceCream cream) {
        Session session=sessionFactory.getCurrentSession();
        session.save(cream);
    }

    @Override
    public IceCream getPerson(int id) {
        Session session=sessionFactory.getCurrentSession();
        IceCream person=session.get(IceCream.class,id);
        return person;

    }




}
