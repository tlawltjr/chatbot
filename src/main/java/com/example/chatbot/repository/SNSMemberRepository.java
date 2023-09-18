package com.example.chatbot.repository;

import com.example.chatbot.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SNSMemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByEmail(String email);
}
