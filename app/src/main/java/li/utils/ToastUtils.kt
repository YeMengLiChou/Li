package li.utils

import android.content.Context
import android.widget.Toast
import java.time.Duration

/**
 * <pre>
 *     author : 叶梦璃愁
 *     time   : 2022/12/28
 *     desc   : 用来改进Toast的显示效果
 *     version: 1.0
 * </pre>
 */
class ToastUtils {
    companion object {
        private var toast: Toast? = null


        fun setText(context: Context, text: String, longTime: Boolean = false) {
            toast?.cancel()
            toast = Toast.makeText(context, text,  if (longTime) Toast.LENGTH_LONG else Toast.LENGTH_SHORT )
            toast?.show()
        }

    }

}