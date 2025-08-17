package com.example.Hotel_Mangement.services.impls;

import com.example.Hotel_Mangement.exceptions.AppException;
import com.example.Hotel_Mangement.repositories.CommonRepository;
import com.example.Hotel_Mangement.services.CommonService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;


public class CommonServiceImpl<E ,ID extends Serializable , R extends CommonRepository<E, ID>> implements CommonService<E, ID> {
    protected final R repo;

    public CommonServiceImpl(R repo) {
        this.repo = repo;
    }
    @Override
    public List<E> getAll() {
        return repo.findAll();
    }

    @Override
    public E getById(ID id) throws AppException {
        return repo.findById(id).get();
    }

    @Override
    public E save(E entity) {
        return repo.save(entity);
    }

    @Override
    public List<E> save(List<E> entities) {
        return repo.saveAll(entities);
    }

    @Override
    public boolean existsById(ID id) {
        return repo.existsById(id);
    }

    @Override
    public void deleteById(ID id) {
        repo.deleteById(id);
    }

    @Override
    public void deleteByIdIn(List<ID> ids) {
        repo.deleteById((ID) ids);
    }
}
