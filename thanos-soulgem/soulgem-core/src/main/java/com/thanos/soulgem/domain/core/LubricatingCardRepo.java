package com.thanos.soulgem.domain.core;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Create by zhangzheng on 8/19/18
 * Email:zhangzheng@youzan.com
 */
@Repository
public interface LubricatingCardRepo extends MongoRepository<LubricatingCard,ObjectId> {

  void deleteAllByEquipmentId(ObjectId equipmentId);

}
