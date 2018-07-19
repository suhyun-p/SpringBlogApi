package com.springblog.api.dto.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class MemberJoinRequest {
    @NotNull
    private String memberId;

    @NotNull
    private String password;

    @NotNull
    private String name;

    private String eMail;
    private String hpNo;
}
