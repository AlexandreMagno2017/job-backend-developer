package br.com.intelipost.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.com.intelipost.entities.LoginEntity;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Integer>
{
    LoginEntity findByUserAndPassword(String user, String password);
}
