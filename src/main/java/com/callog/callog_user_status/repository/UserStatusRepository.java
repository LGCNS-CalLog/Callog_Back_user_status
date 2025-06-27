package com.callog.callog_user_status.repository;

import com.callog.callog_user_status.domain.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserStatusRepository extends JpaRepository<UserStatus, Long> {
    Optional<UserStatus> findByUserId(Long userId);

    @Query(value = "SELECT user_id FROM user_stats", nativeQuery = true)
    List<Long> findAllUserIds();

}
