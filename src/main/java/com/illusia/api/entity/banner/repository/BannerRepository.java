package com.illusia.api.entity.banner.repository;

import com.illusia.api.entity.banner.model.Banner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BannerRepository extends JpaRepository<Banner, UUID> {
}
