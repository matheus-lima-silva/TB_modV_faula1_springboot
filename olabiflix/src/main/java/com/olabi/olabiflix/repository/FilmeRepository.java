package com.olabi.olabiflix.repository;

import com.olabi.olabiflix.model.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FilmeRepository extends JpaRepository<Filme, UUID> {


    Optional<Filme> findByTitle(String title);

    List<Filme> findByGenreContainsIgnoreCase (String genre);

    boolean existsByTitleAndReleaseYearAndDirectorAndWriter(String title, String releaseYear, String director, String writer);

}
