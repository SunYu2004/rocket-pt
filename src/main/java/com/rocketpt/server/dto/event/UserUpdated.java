package com.rocketpt.server.dto.event;

import com.rocketpt.server.common.DomainEvent;
import com.rocketpt.server.dto.entity.UserEntity;

/**
 * @author plexpt
 */
public record UserUpdated(UserEntity userEntity) implements DomainEvent {
}
