package br.com.exactus.teste.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exactus.teste.models.Disco;

public interface DiscoRepository extends JpaRepository<Disco, Long>{
  List<Disco>findByArtistaId(long artistaId);
  List<Disco> findByTituloLike(String titulo);
  List<Disco>findAllByGenero(String genero);
}
