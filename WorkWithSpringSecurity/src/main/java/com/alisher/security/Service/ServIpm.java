package com.alisher.security.Service;

import com.alisher.security.DAO.IceDAO;
import com.alisher.security.DAO.IceImplements;
import com.alisher.security.model.IceCream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
@Service
public class ServIpm implements ServiceImpl{
    @Autowired
    IceDAO iceDAO;
    @Override
    @Transactional
    public void save(IceCream cream) {
        iceDAO.addIce(cream);
    }

    @Override
    @Transactional
    public IceCream getPerson(int id) {
        return iceDAO.getPerson(id);
    }
}
