package com.tiy.ssa.exerciseWebApp.service;

import java.util.List;

import com.tiy.ssa.exerciseWebApp.entity.Exercise_Category;

public interface IExercise_CategoryService {
	
	Integer getExerciseCategoryByDesc(String desc);
	List<Exercise_Category> getAllExerciseCategory();
}
