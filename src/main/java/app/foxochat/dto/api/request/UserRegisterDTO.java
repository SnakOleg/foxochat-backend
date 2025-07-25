package app.foxochat.dto.api.request;

import app.foxochat.constant.ValidationConstant;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Schema(name = "UserRegister")
public class UserRegisterDTO {

    @NotNull(message = "Username" + ValidationConstant.Messages.MUST_NOT_BE_NULL)
    @Size(min = ValidationConstant.Lengths.MIN, max = ValidationConstant.Lengths.USERNAME,
            message = "Username" + ValidationConstant.Messages.WRONG_LENGTH)
    @Pattern(regexp = ValidationConstant.Regex.NAME_REGEX, message = "Username" + ValidationConstant.Messages.INCORRECT)
    private String username;

    @NotNull(message = "Email" + ValidationConstant.Messages.MUST_NOT_BE_NULL)
    @Size(min = ValidationConstant.Lengths.MIN, max = ValidationConstant.Lengths.EMAIL,
            message = "Email" + ValidationConstant.Messages.WRONG_LENGTH)
    @Pattern(regexp = ValidationConstant.Regex.EMAIL_REGEX, message = "Email" + ValidationConstant.Messages.INCORRECT)
    private String email;

    @NotNull(message = "Password" + ValidationConstant.Messages.MUST_NOT_BE_NULL)
    @Size(min = ValidationConstant.Lengths.MIN, max = ValidationConstant.Lengths.PASSWORD,
            message = "Password" + ValidationConstant.Messages.WRONG_LENGTH)
    private String password;
}
