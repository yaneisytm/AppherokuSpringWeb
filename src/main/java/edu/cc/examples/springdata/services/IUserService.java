
package edu.cc.examples.springdata.services;

import java.util.List;
import edu.cc.examples.springdata.models.User;

public interface IUserService {

	public List<User> listadoUsuarios();
	
	public void guardarUsuario(User user);
	
	public void eliminarUsuario(User user);
	
	public User findUsuario(User user);
	
}
