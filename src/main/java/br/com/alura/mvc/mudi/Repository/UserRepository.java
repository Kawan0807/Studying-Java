package br.com.alura.mvc.mudi.Repository;

import br.com.alura.mvc.mudi.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {
   User findByUsername(String username);
}
