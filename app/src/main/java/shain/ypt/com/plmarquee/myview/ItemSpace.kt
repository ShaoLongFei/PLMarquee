package shain.ypt.com.plmarquee.myview

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View


class ItemSpace(var mSpace: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State?) {
        outRect.left = mSpace
        outRect.right = mSpace
        outRect.bottom = mSpace
        outRect.top = mSpace
    }
}
