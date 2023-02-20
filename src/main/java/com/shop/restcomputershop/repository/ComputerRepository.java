package com.shop.restcomputershop.repository;

import com.shop.restcomputershop.entity.DesktopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ComputerRepository extends JpaRepository<DesktopEntity, Long> {
}
