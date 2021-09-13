package com.parlonsdev.repository;

import com.parlonsdev.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Optional<Profile> findByPhoneNumberContaining(String phoneNumber);

    Boolean existsByPhoneNumber(String phoneNumber);
}
