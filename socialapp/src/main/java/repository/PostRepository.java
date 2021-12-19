package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Comment;

public interface PostRepository extends JpaRepository<Comment, Long> {

}
