package com.example.demo.cmm.service;

import java.util.List;
import java.util.Optional;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public abstract class AbstractService<T> {
	public abstract Optional<T> findOne(T t);
	public abstract long count();
	public abstract void deleteById(long id);
	public abstract boolean existsById(long id);
	public abstract Iterable<T> findAll(Sort sort);
	public abstract List<T> findAll();
	public abstract Optional<T> findOne();
	public abstract T getOne(long id);
	public abstract T save(T entity);
}
