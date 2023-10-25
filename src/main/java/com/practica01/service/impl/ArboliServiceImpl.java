
package com.practica01.service.impl;


import com.practica01.dao.ArboliDao;
import com.practica01.domain.Arboli;
import com.practica01.service1.ArboliService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArboliServiceImpl implements ArboliService {

    @Autowired
    private ArboliDao arboliDao;

    @Override
    @Transactional(readOnly = true)
    public List<Arboli> getArbolis(boolean activos) {
        var lista = arboliDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Arboli getArboli(Arboli arboli) {
        return arboliDao.findById(arboli.getIdArboli()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Arboli arboli) {
        arboliDao.save(arboli);
    }

    @Override
    @Transactional
    public void delete(Arboli arboli) {
        arboliDao.delete(arboli);
    }
}
