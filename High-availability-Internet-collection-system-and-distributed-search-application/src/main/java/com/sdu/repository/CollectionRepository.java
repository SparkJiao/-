package com.sdu.repository;

import com.sdu.entity.Collection;
import com.sdu.entity.CollectionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by ASUS on 2018/7/3.
 */
public interface CollectionRepository extends JpaRepository<Collection, CollectionKey>{

    @Query("select school from Collection c where c.username = ?1")
    List<String> findUsersSchool(String username);

}
