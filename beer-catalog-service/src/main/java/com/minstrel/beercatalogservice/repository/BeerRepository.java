package com.minstrel.beercatalogservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.minstrel.beercatalogservice.entity.Beer;

@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long>{ }
