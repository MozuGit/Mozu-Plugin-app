package com.mozumo.yunzai

import com.tencent.kuikly.core.annotations.Page
import com.tencent.kuikly.core.base.*
import com.tencent.kuikly.core.views.*
import com.mozumo.yunzai.base.BasePager

@Page("HomePage", supportInLocal = true)
internal class HomePage : BasePager() {

    var inputText: String = ""
    lateinit var inputRef: ViewRef<InputView>

    override fun body(): ViewBuilder {
        val ctx = this
        return {

        }
    }
}