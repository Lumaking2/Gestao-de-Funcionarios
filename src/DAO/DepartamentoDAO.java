package DAO;

import MODEL.Departamento;

import java.util.List;

public interface DepartamentoDAO {

    void insert(Departamento obj);
    void update(Departamento obj);
    void deleteById(Integer id);
    Departamento findByID(Integer id);
    List<Departamento> findAll();
}
