package li.utils.widgets

import android.view.Gravity
import android.view.View

import android.widget.TextView
import androidx.appcompat.widget.Toolbar


/**
 * <pre>
 *     author : 叶梦璃愁
 *     time   : 2022/11/06
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class ToolbarUtil {

    companion object {
        fun setTitleCenter(toolbar: Toolbar) {
            val title = "title"
            val originalTitle: CharSequence = toolbar.title
            toolbar.title = title
            for (i in 0 until toolbar.childCount) {
                val view: View = toolbar.getChildAt(i)
                if (view is TextView) {
                    if (title == view.text) {
                        view.gravity = Gravity.CENTER
                        val params: Toolbar.LayoutParams = Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.MATCH_PARENT)
                        params.gravity = Gravity.CENTER
                        view.layoutParams = params
                    }
                }
                toolbar.title = originalTitle
            }
        }
    }



}