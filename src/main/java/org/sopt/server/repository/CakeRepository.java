package org.sopt.server.repository;

import org.sopt.server.domain.Cake;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CakeRepository extends JpaRepository<Cake, Long> {
    Optional<Cake> findCakeByTitle(String title);
    boolean existsCakeByTitle(String title);
}
