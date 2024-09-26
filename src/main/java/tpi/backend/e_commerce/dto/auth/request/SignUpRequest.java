package tpi.backend.e_commerce.dto.auth.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
