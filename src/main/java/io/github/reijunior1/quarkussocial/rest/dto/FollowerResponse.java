package io.github.reijunior1.quarkussocial.rest.dto;


import io.github.reijunior1.quarkussocial.domain.model.Follower;
import lombok.Data;

@Data
public class FollowerResponse {
    private Long Id;
    private String name;

    public FollowerResponse() {
    }

    public FollowerResponse (Follower follower){
        this (follower.getId(), follower.getFollower().getName());

    }
    public FollowerResponse(Long id, String name) {
        this.Id = id;
        this.name = name;
    }
}