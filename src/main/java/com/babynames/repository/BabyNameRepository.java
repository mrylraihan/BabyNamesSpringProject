package com.babynames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.babynames.entity.BabyNameEntity;

@Repository
public interface BabyNameRepository extends CrudRepository<BabyNameEntity, Integer>{
		
		@Query("select b from BabyNameEntity b where b.gender = :gender")
		public List<BabyNameEntity> getBabyNameByGender(@Param("gender")String gender);
}
