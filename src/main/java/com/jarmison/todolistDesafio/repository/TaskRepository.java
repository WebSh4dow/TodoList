package com.jarmison.todolistDesafio.repository;

import com.jarmison.todolistDesafio.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository <Task,Long> {

}
