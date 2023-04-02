package MODEL;

import DAO.FuncionarioDAO;
import DAOimplementacao.FuncionarioDaoJDBC;

public class DaoFactory {

    public static FuncionarioDAO criarFuncionarioDao(){
        return new FuncionarioDaoJDBC();
    }

    public static FuncionarioDAO criarFuncionarioDao2(){
        return new FuncionarioDaoJDBC2();
    }
}
