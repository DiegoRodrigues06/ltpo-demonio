package com.ltop;

import java.util.List;
import com.ltop.enuns.Tipo;
import com.ltop.models.Modelo;
import com.ltop.models.Usuario;
import com.ltop.DAO.UsuarioDao;
import com.ltop.models.Automoveis;
import com.ltop.DAO.AutomoveisDAO;


public class Main {
    public static void main(String[] args) {
        UsuarioDao usuarioDao = new UsuarioDao();
        Modelo modelo = new Modelo("fiesta", "ford");
        //Inserir um novo usuario
        Usuario usuario = new Usuario("mauro jorge", "ameixa@.com", "oiee", Tipo.CLIENTE, "1234-9695");

        Automoveis carro = new Automoveis(modelo, "XYZ1234", 2020, "Preto", usuario);

        // Adiciona o carro na lista do usuário
        usuario.getAutomoveis().add(carro);

        usuarioDao.salvar(usuario);
        System.out.println("Usuário inserido" + usuario);

        //Buscar todos os usuários
        List<Usuario> usuarios = usuarioDao.buscarTodos();
        System.out.println("\nTodos os usuários:");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }

        //Buscar um usuário por ID
        Usuario usuarioBuscado = usuarioDao.buscarPorId(1);
        System.out.println("\nUsuário com ID 1: " + usuarioBuscado);

        //Fechar o EntityManager
        usuarioDao.fechar();
    }
}