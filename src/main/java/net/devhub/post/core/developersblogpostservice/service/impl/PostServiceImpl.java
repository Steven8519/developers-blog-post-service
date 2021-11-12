package net.devhub.post.core.developersblogpostservice.service.impl;

import net.devhub.post.core.developersblogpostservice.entity.Post;
import net.devhub.post.core.developersblogpostservice.payload.PostDto;
import net.devhub.post.core.developersblogpostservice.repository.PostRepository;
import net.devhub.post.core.developersblogpostservice.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {

        // convert Dto to entity
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post newPost = this.postRepository.save(post);

        // convert entity to Dto
        PostDto postResponse = new PostDto();
        postResponse.setId(newPost.getId());
        postResponse.setTitle(newPost.getTitle());
        postResponse.setDescription(newPost.getDescription());
        postResponse.setContent(newPost.getContent());

        return postResponse;
    }
}
