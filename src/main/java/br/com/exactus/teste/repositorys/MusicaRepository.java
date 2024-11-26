package br.com.exactus.teste.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exactus.teste.models.Musica;

public interface MusicaRepository extends JpaRepository<Musica, Long>{
	List<Musica> findByNomeLike(String nome);
	List<Musica> findAllByGenero(String genero);
	List<Musica> findAllByDiscoId(long discoId);
}