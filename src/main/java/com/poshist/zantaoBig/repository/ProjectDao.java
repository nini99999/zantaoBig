package com.poshist.zantaoBig.repository;

import com.poshist.zantaoBig.entity.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by server on 17-5-12.
 */
public interface ProjectDao extends CrudRepository<Project, Long> {
    List<Project>findAllByDeleted(String deleted);
}
