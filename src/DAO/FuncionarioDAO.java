package DAO;

import MODEL.Departamento;
import MODEL.Funcionario;

import java.util.List;

public interface FuncionarioDAO {

    void insert(Funcionario obj);
    void update(Funcionario obj);
    void deleteById(Funcionario id);
    Departamento findByID(Integer id);
    List<Funcionario> findAll();
}
