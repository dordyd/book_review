package myproject.bookreview.domain.repository;

import myproject.bookreview.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}

