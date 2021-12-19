package repository;

import java.util.List;

import models.User;

public interface UserRepository {

	List<User> findAll();

}
