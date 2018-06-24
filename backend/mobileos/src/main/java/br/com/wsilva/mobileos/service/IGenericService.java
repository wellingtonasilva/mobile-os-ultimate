package br.com.wsilva.mobileos.service;

import java.util.Optional;

public interface IGenericService<T>
{
    T save(T entity);
    Optional<T> findById(Integer id);
    boolean existsById(Integer id);
    Iterable<T> findAll();
    void deleteById(Integer id);
    void delete(T entity);
    void deleteAll();
}