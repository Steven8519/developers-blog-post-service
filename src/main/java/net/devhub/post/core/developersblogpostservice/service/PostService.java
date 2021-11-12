package net.devhub.post.core.developersblogpostservice.service;

import net.devhub.post.core.developersblogpostservice.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
