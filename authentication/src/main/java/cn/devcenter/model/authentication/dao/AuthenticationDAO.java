package cn.devcenter.model.authentication.dao;

import cn.devcenter.model.authentication.Authentication;
import cn.devcenter.model.authentication.BaseConditionRepository;
import cn.devcenter.model.authentication.FindCondition;
import cn.devcenter.model.repository.CurdRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.management.Query;
import java.io.Serializable;

public interface AuthenticationDAO extends CurdRepository<Authentication, Serializable> {

    Page<Authentication> find(FindCondition condition, Pageable pageable);

}
