package com.cg.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.cg.model.Movie;
@Repository
public interface MovieDao  extends JpaRepository<Movie, Integer>{
@Query(value = "select m from Movie m where m.genre= :g")
List<Movie> searchByGenre(@Param("g") String genre);
//Spring JPA query methods findBy<FieldName>
List<Movie> findByLanguage(String lang);
}
