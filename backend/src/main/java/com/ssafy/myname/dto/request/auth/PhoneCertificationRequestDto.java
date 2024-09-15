package com.ssafy.myname.dto.request.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class PhoneCertificationRequestDto {

    @NotBlank
    private String phoneId;

//    @NotBlank
//    private String certificationNumber;
}
