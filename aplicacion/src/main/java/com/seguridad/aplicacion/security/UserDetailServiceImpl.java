package com.seguridad.aplicacion.security;

import com.seguridad.aplicacion.models.Usuario;
import com.seguridad.aplicacion.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = userRepository.findOneByEmail(email)
                .orElseThrow(()-> new UsernameNotFoundException("El usuario con " + email +
                        " no existe"));
        return new UserDetailsImpl(usuario);
    }
}
