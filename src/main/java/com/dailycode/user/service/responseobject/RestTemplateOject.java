package com.dailycode.user.service.responseobject;

import com.dailycode.user.service.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestTemplateOject {

    private User user;
    private Department department;

}
