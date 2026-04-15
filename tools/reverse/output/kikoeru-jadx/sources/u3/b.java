package u3;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.cnl.kikoeru.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f21268c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f21269a = f21268c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f21270b = new a(this);

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f21269a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public y1 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f21269a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new y1(21, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f21269a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, v3.d dVar) {
        this.f21269a.onInitializeAccessibilityNodeInfo(view, dVar.f22380a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f21269a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f21269a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i11 = 0; i11 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((v3.c) list.get(i11)).f22377a).getId() != i10; i11++) {
        }
        boolean zPerformAccessibilityAction = this.f21269a.performAccessibilityAction(view, i10, bundle);
        if (zPerformAccessibilityAction || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public void h(View view, int i10) {
        this.f21269a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f21269a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
