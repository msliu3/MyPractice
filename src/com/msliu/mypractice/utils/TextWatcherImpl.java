package com.msliu.mypractice.utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * @author: shisan.lms
 * @create time: 2021/3/3
 * @description:
 *          将这个接口实现，使用时依然动态连接，有助于代码简化，只实现有用到的接口
 **/
public class TextWatcherImpl implements TextWatcher {

    public TextWatcherImpl() {
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    /**
     * 使用方式更便捷
    public static void main(String[] args) {
        editText.addTextChangedListener(new TextWatcherImpl(){
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                super.onTextChanged(s, start, before, count);
            }
        });
    }
     */

}
