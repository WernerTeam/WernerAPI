package br.org.serratec.backend.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.org.serratec.backend.model.Representante;
import br.org.serratec.backend.model.RepresentanteSecurity;
import br.org.serratec.backend.repository.RepresentanteRepository;

@Service
public class RepresentanteSecurityService implements UserDetailsService {

	@Autowired
	private RepresentanteRepository representanteRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			
		Representante representante;
			try {
				Optional<Representante> opRepresentante = representanteRepository.findByCodigo(username);
				if (!opRepresentante.isPresent())
					throw new UsernameNotFoundException("Usuário não encontrado");
				else{
					representante = opRepresentante.get();
				}
			} catch (Exception e) {
				throw new UsernameNotFoundException("database error");
			}
			RepresentanteSecurity springUser = buildUserFromUserEntity(representante);
			return springUser;
		
	}
	
	@SuppressWarnings("unchecked")
	private RepresentanteSecurity buildUserFromUserEntity(Representante userEntity){
		String username = userEntity.getCodigo().toString();
		String password = userEntity.getSenha();
		
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		boolean enable = true;
		
		String[] userRoles = {"admin"};
		AuthorityUtils.createAuthorityList(userRoles);
		
		Collection<? extends GrantedAuthority> authorities = (Collection<? extends GrantedAuthority>) AuthorityUtils.createAuthorityList(userRoles);
	
		RepresentanteSecurity springUser = new RepresentanteSecurity(username, password, enable, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		
		return springUser;

	}

}
