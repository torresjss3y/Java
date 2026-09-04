package com.project.app.repositorios;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.app.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    // Aquí puedes definir métodos de consulta personalizados si es necesario

}
