package it.unicam.cs.ids.papcteam.c3Rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiamataRepository extends JpaRepository<Chiamata,Long> {
}