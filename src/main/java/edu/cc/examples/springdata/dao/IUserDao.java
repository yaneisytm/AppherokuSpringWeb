package edu.cc.examples.springdata.dao;

import edu.cc.examples.springdata.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<User, Long>{

	// ya temdriamos los prinicpales métodos CRUD
	// y podemos crear nuestros propios métodos
}
