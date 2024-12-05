package com.unicauca.enfa2.Appoint.me.usuarios;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioEntityMapper {

    @Mapping(target = "id", ignore = true)
@Mapping(target = "cedula", source = "cedula")
    UsuarioEntity aEntidad(Usuario usuario);
    Usuario aUsuario(UsuarioEntity entity);


}
