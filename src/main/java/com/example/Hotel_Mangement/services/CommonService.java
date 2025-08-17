package com.example.Hotel_Mangement.services;

import com.example.Hotel_Mangement.exceptions.AppException;

import java.io.Serializable;
import java.util.List;

public interface CommonService<E, ID extends Serializable> {
    List<E> getAll();

    E getById(ID id) throws AppException;

    E save(E entity);

    List<E> save(List<E> enities);

    boolean existsById(ID id);

    void deleteById(ID id);

    void deleteByIdIn(List<ID> ids);
}
