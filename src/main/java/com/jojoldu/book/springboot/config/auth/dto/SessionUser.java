package com.jojoldu.book.springboot.config.auth.dto;

import com.jojoldu.book.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    // 세션에 사용자 정보를 저장하기 위한 클래스
    // 객체에 세션 정보를 담으려면 Serializable 인터페이스를 구현해야함.
    // 도메인 엔티티에 직접 세션 정보를 담으면, 연관관계를 설정하게 됬을때,
    // 성능이슈와 사이드이펙트가 발생할 수 있기 때문에 세션 정보를 담을 dto를 생성하자.
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
