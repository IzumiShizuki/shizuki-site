package m7;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f14844x = {R.attr.state_pressed};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f14845y = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateListDrawable f14847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f14848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateListDrawable f14851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f14852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f14855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f14856k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f14859n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ValueAnimator f14866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14867v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c7.r f14868w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14857l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14858m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f14860o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f14861p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14862q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14863r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f14864s = new int[2];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f14865t = new int[2];

    public f(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f14866u = valueAnimatorOfFloat;
        this.f14867v = 0;
        c7.r rVar = new c7.r(5, this);
        this.f14868w = rVar;
        c cVar = new c();
        this.f14847b = stateListDrawable;
        this.f14848c = drawable;
        this.f14851f = stateListDrawable2;
        this.f14852g = drawable2;
        this.f14849d = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f14850e = Math.max(i10, drawable.getIntrinsicWidth());
        this.f14853h = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f14854i = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f14846a = i12;
        stateListDrawable.setAlpha(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        drawable.setAlpha(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        valueAnimatorOfFloat.addListener(new d(this));
        valueAnimatorOfFloat.addUpdateListener(new e(this));
        RecyclerView recyclerView2 = this.f14859n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f1034k;
            s sVar = recyclerView2.f1033j;
            if (sVar != null) {
                sVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.r();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f14859n;
            recyclerView3.f1035l.remove(this);
            if (recyclerView3.f1036m == this) {
                recyclerView3.f1036m = null;
            }
            ArrayList arrayList2 = this.f14859n.W;
            if (arrayList2 != null) {
                arrayList2.remove(cVar);
            }
            this.f14859n.removeCallbacks(rVar);
        }
        this.f14859n = recyclerView;
        ArrayList arrayList3 = recyclerView.f1034k;
        s sVar2 = recyclerView.f1033j;
        if (sVar2 != null) {
            sVar2.a("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.r();
        recyclerView.requestLayout();
        this.f14859n.f1035l.add(this);
        RecyclerView recyclerView4 = this.f14859n;
        if (recyclerView4.W == null) {
            recyclerView4.W = new ArrayList();
        }
        recyclerView4.W.add(cVar);
    }

    public static int c(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 != 0) {
            int i14 = i10 - i12;
            int i15 = (int) (((f11 - f10) / i13) * i14);
            int i16 = i11 + i15;
            if (i16 < i14 && i16 >= 0) {
                return i15;
            }
        }
        return 0;
    }

    public final boolean a(float f10, float f11) {
        return f11 >= ((float) (this.f14858m - this.f14853h)) && f10 >= ((float) (0 - (0 / 2))) && f10 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f10, float f11) {
        Field field = u3.s.f21328a;
        int layoutDirection = this.f14859n.getLayoutDirection();
        int i10 = this.f14849d;
        if (layoutDirection != 1 ? f10 >= this.f14857l - i10 : f10 <= i10) {
            int i11 = 0 / 2;
            if (f11 >= 0 - i11 && f11 <= i11 + 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i10) {
        c7.r rVar = this.f14868w;
        StateListDrawable stateListDrawable = this.f14847b;
        if (i10 == 2 && this.f14862q != 2) {
            stateListDrawable.setState(f14844x);
            this.f14859n.removeCallbacks(rVar);
        }
        if (i10 == 0) {
            this.f14859n.invalidate();
        } else {
            e();
        }
        if (this.f14862q == 2 && i10 != 2) {
            stateListDrawable.setState(f14845y);
            this.f14859n.removeCallbacks(rVar);
            this.f14859n.postDelayed(rVar, 1200);
        } else if (i10 == 1) {
            this.f14859n.removeCallbacks(rVar);
            this.f14859n.postDelayed(rVar, 1500);
        }
        this.f14862q = i10;
    }

    public final void e() {
        int i10 = this.f14867v;
        ValueAnimator valueAnimator = this.f14866u;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f14867v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
