package com.williamslcr.app.rest.Reposotiry;

import com.williamslcr.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {

    //

}
