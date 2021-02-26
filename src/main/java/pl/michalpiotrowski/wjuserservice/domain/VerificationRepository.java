package pl.michalpiotrowski.wjuserservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VerificationRepository extends JpaRepository<Verification, UUID> {
}
