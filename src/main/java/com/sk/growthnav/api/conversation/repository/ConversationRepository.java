package com.sk.growthnav.api.conversation.repository;

import com.sk.growthnav.api.conversation.document.ConversationDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ConversationRepository extends MongoRepository<ConversationDocument, String> {
    List<ConversationDocument> findByMemberId(Long memberId);

    List<ConversationDocument> findByMemberIdOrderByCreatedAtDesc(Long memberId);
}
