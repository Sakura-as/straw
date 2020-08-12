package cn.tedu.straw.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Accessors(chain = true)
public class StudentRegisterDTO implements Serializable {
    private String nickname;
    private String password;
    private Integer gender;
    private LocalDate dayOfBirth;
    private String phone;
    private String inviteCode;
    private String selfIntroduction;
}
