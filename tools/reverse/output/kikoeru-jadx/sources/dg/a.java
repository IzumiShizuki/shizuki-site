package dg;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import eg.g;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends SurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f6009a;

    public a(Context context) {
        super(context);
        this.f6009a = new g();
        getHolder().setFormat(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int[] iArr;
        int i12;
        g gVar = this.f6009a;
        int i13 = gVar.f6600d;
        if (i13 == 90 || i13 == 270) {
            i11 = i10;
            i10 = i11;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i14 = gVar.f6598b;
        if (i14 == 0 || (i12 = gVar.f6597a) == 0) {
            iArr = new int[]{size, size2};
        } else {
            int i15 = i12 * size2;
            int i16 = size * i14;
            boolean z10 = i15 > i16;
            switch (gVar.f6599c) {
                case 0:
                    if (!z10) {
                        i10 = i15 / i14;
                        i11 = size2;
                    } else {
                        i11 = i16 / i12;
                        i10 = size;
                    }
                    break;
                case 1:
                    i11 = (size / 16) * 9;
                    if (size2 <= i11) {
                        i10 = (size2 / 9) * 16;
                        i11 = size2;
                    }
                    i10 = size;
                    break;
                case 2:
                    i11 = (size / 4) * 3;
                    if (size2 <= i11) {
                        i10 = (size2 / 3) * 4;
                        i11 = size2;
                    }
                    i10 = size;
                    break;
                case 3:
                    break;
                case 4:
                    i11 = i14;
                    i10 = i12;
                    break;
                case 5:
                    if (!z10) {
                        i11 = i16 / i12;
                        i10 = size;
                    } else {
                        i10 = i15 / i14;
                        i11 = size2;
                    }
                    break;
                case 6:
                    float f10 = size / i12;
                    float f11 = size2 / i14;
                    float f12 = 1;
                    if (Math.abs(f10 - f12) >= Math.abs(f11 - f12)) {
                        f10 = f11;
                    }
                    i11 = (int) (f10 * gVar.f6598b);
                    i10 = (int) (gVar.f6597a * f10);
                    break;
                default:
                    if (!z10) {
                        i10 = i15 / i14;
                        i11 = size2;
                    } else {
                        i11 = i16 / i12;
                        i10 = size;
                    }
                    break;
            }
            iArr = new int[]{i10, i11};
        }
        setMeasuredDimension(iArr[0], iArr[1]);
    }

    public final void setScaleType(int i10) {
        this.f6009a.f6599c = i10;
    }

    public final void setVideoRotation(int i10) {
        this.f6009a.f6600d = i10;
        requestLayout();
    }
}
