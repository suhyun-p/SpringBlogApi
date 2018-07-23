package com.springblog.api.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@EntityListeners(value = { AuditingEntityListener.class })
@Table(name="post")
@Getter
@Setter
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postNo;

    public String title;
    public String contents;

    @CreatedBy
    private String regMemberId;

    @CreatedDate
    private LocalDateTime regDt;

    @LastModifiedBy
    private String chgMemberId;

    @LastModifiedDate
    private LocalDateTime chdDt;
}
