package br.com.exactus.teste.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exactus.teste.models.Artista;

public interface ArtistasRepository extends JpaRepository<Artista, Long>{
	List<Artista> findByNomeLike(String nome);
	List<Artista> findAllByGenero(String genero);
}
