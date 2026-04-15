package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import d7.a;
import d7.b;
import d7.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f988d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f991c;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f991c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.f5497a, 0, 0);
            try {
                this.f991c = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f989a = new b(this);
    }

    public int getResizeMode() {
        return this.f991c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f990b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = (this.f990b / (f12 / f13)) - 1.0f;
        float fAbs = Math.abs(f14);
        b bVar = this.f989a;
        if (fAbs <= 0.01f) {
            if (bVar.f5483b) {
                return;
            }
            bVar.f5483b = true;
            ((AspectRatioFrameLayout) bVar.f5484c).post(bVar);
            return;
        }
        int i12 = this.f991c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f990b;
                } else if (i12 == 4) {
                    if (f14 > 0.0f) {
                        f10 = this.f990b;
                    } else {
                        f11 = this.f990b;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f990b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f14 > 0.0f) {
            f11 = this.f990b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f990b;
            measuredWidth = (int) (f13 * f10);
        }
        if (!bVar.f5483b) {
            bVar.f5483b = true;
            ((AspectRatioFrameLayout) bVar.f5484c).post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f990b != f10) {
            this.f990b = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f991c != i10) {
            this.f991c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }
}
