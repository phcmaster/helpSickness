package br.com.helpSickness.model.repositoy;

import br.com.helpSickness.model.entity.DoencasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoencasRepository extends JpaRepository<DoencasEntity, Long> {

}
