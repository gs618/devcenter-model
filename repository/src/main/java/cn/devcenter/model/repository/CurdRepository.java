package cn.devcenter.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

public interface CurdRepository<T, ID extends Serializable> extends Repository<T, ID> {

    T save(T object);

    T findById(ID id);

    Serializable deleteById(ID id);

    Serializable update(T object);

    Boolean existsById(ID id);

    Long count();

}
