package com.example.DockerDemoProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DockerDemoProject.domain.ExcelFileEntity;

/**
 * @author SAMYAK JAIN
 *
 */
@Repository
public interface FileRepository extends JpaRepository<ExcelFileEntity, Long> {

}
