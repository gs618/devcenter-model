package cn.devcenter.model.token;


import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class RefreshToken implements Serializable {

    private String refreshToken;

    private long createTime;

    private long LastUsedAt;

    private long expiredPeriod;

    public boolean isExpired(){
        return System.currentTimeMillis() > createTime + expiredPeriod;
    }
}
