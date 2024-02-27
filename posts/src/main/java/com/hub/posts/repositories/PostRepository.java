package com.hub.posts.repositories;

import com.hub.posts.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    public Post findPostById(String id);
}
