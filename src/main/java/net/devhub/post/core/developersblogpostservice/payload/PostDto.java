package net.devhub.post.core.developersblogpostservice.payload;

import lombok.Data;

import javax.persistence.Column;
import java.util.UUID;

@Data
public class PostDto {
    private UUID id;
    private String title;
    private String description;
    private String content;
}
