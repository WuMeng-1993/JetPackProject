package com.wumeng.jetpackproject.databinding;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableByte;
import androidx.databinding.ObservableChar;
import androidx.databinding.ObservableDouble;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableFloat;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableLong;
import androidx.databinding.ObservableParcelable;
import androidx.databinding.ObservableShort;

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
