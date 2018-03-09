package cn.devcenter.model.authentication;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Authentication {

    private Serializable id;

    private Serializable secret;

}
