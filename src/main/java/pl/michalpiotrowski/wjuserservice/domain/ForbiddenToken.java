package pl.michalpiotrowski.wjuserservice.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "forbidden_tokens")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ForbiddenToken {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, updatable = false, nullable = false)
    @Type(type = "uuid-char")
    private UUID code;

    @Column(length = 36)
    @Type(type = "uuid-char")
    private UUID userId;
}
