package com.wumeng.jetpackproject.databinding;

import androidx.databinding.ObservableField;

/**
 * @author WuMeng
 * @date 2020/10/21
 * desc:
 */
public class User {

    public final ObservableField<String> name = new ObservableField<>();

    public final ObservableField<String> password = new ObservableField<>();


    public ObservableField<String> getName() {
        return name;
    }

    public ObservableField<String> getPassword() {
        return password;
    }
}
