package ma.youcode.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ma.youcode.app.model.User;
import ma.youcode.app.repository.UserRepository;

@Service
public class UserPrincipalDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByEmail(username);
		UserPrincipal userPrincipal = new UserPrincipal(user);
		
		return userPrincipal;
	}
}
