package io.github.MurilloNS.domain.repository;

import io.github.MurilloNS.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository <Produto, Integer> {
}
