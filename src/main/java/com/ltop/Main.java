package com.ltop;

import java.util.List;
import com.ltop.models.Usuario;
import com.ltop.DAO.UsuarioDao;

public class Main {
    public static void main(String[] args) {
        UsuarioDao usuarioDao = new UsuarioDao();

        //Inserir um novo usuario
        Usuario usuario = new Usuario("João", "jaojao@example.com");
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
