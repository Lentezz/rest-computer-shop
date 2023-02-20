package com.shop.restcomputershop.repository;

import com.shop.restcomputershop.entity.DesktopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DesktopRepository extends JpaRepository<DesktopEntity, Long> {
}
