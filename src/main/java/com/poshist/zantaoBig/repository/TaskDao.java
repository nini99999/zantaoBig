package com.poshist.zantaoBig.repository;

/**
 * Created by server on 17-5-12.
 */

import com.poshist.zantaoBig.entity.Project;
import com.poshist.zantaoBig.entity.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskDao extends CrudRepository<Task, Long> {
    List<Task> findByStatusAndDeletedOrderByLastediteddateDescOpeneddateDesc(String status,String deleted);
    Long countByStatusAndDeletedAndProject(String status,String deleted,Project project);
}
