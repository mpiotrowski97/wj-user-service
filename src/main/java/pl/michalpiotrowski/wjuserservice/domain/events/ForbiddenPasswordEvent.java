package pl.michalpiotrowski.wjuserservice.domain.events;

import lombok.Builder;
import lombok.Getter;
import tu.kielce.booksstore.user.domain.User;

@Builder(builderMethodName = "of")
@Getter
public class ForbiddenPasswordEvent {
    private final User user;
}
