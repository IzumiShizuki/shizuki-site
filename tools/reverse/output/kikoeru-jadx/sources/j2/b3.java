package j2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends View implements i2.o1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a3 f9732r = new a3(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static Method f9733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Field f9734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f9735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f9736v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f9737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f9738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ic.n f9739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ic.a f9740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2 f9741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f9743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p4.p f9745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q1.p f9747k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2.d f9748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f9749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f9750n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9751o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f9752p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9753q;

    public b3(v vVar, r1 r1Var, ic.n nVar, ic.a aVar) {
        super(vVar.getContext());
        this.f9737a = vVar;
        this.f9738b = r1Var;
        this.f9739c = nVar;
        this.f9740d = aVar;
        this.f9741e = new e2();
        this.f9747k = new q1.p();
        this.f9748l = new c2.d(i1.f9829e);
        this.f9750n = q1.p0.f17566b;
        this.f9751o = true;
        setWillNotDraw(false);
        r1Var.addView(this);
        this.f9752p = View.generateViewId();
    }

    private final q1.e0 getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        e2 e2Var = this.f9741e;
        if (!e2Var.f9804g) {
            return null;
        }
        e2Var.e();
        return e2Var.f9802e;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f9744h) {
            this.f9744h = z10;
            this.f9737a.A(this, z10);
        }
    }

    @Override // i2.o1
    public final void a(float[] fArr) {
        q1.a0.e(fArr, this.f9748l.c(this));
    }

    @Override // i2.o1
    public final void b(q1.o oVar, t1.b bVar) {
        boolean z10 = getElevation() > 0.0f;
        this.f9746j = z10;
        if (z10) {
            oVar.u();
        }
        this.f9738b.a(oVar, this, getDrawingTime());
        if (this.f9746j) {
            oVar.h();
        }
    }

    @Override // i2.o1
    public final boolean c(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j10));
        if (this.f9742f) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f9741e.c(j10);
        }
        return true;
    }

    @Override // i2.o1
    public final long d(long j10, boolean z10) {
        c2.d dVar = this.f9748l;
        if (!z10) {
            return !dVar.f3253d ? q1.a0.b(j10, dVar.c(this)) : j10;
        }
        float[] fArrB = dVar.b(this);
        if (fArrB == null) {
            return 9187343241974906880L;
        }
        return !dVar.f3253d ? q1.a0.b(j10, fArrB) : j10;
    }

    @Override // i2.o1
    public final void destroy() {
        setInvalidated(false);
        v vVar = this.f9737a;
        vVar.G = true;
        this.f9739c = null;
        this.f9740d = null;
        boolean zI = vVar.I(this);
        if (Build.VERSION.SDK_INT >= 23 || f9736v || !zI) {
            this.f9738b.removeViewInLayout(this);
        } else {
            setVisibility(8);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        q1.p pVar = this.f9747k;
        q1.b bVar = pVar.f17565a;
        Canvas canvas2 = bVar.f17490a;
        bVar.f17490a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            bVar.f();
            this.f9741e.a(bVar);
            z10 = true;
        }
        ic.n nVar = this.f9739c;
        if (nVar != null) {
            nVar.q(bVar, null);
        }
        if (z10) {
            bVar.r();
        }
        pVar.f17565a.f17490a = canvas2;
        setInvalidated(false);
    }

    @Override // i2.o1
    public final void e(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (i10 == getWidth() && i11 == getHeight()) {
            return;
        }
        setPivotX(q1.p0.b(this.f9750n) * i10);
        setPivotY(q1.p0.c(this.f9750n) * i11);
        setOutlineProvider(this.f9741e.b() != null ? f9732r : null);
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
        l();
        this.f9748l.e();
    }

    @Override // i2.o1
    public final void f(ic.n nVar, ic.a aVar) {
        if (Build.VERSION.SDK_INT >= 23 || f9736v) {
            this.f9738b.addView(this);
        } else {
            setVisibility(0);
        }
        c2.d dVar = this.f9748l;
        dVar.f3250a = false;
        dVar.f3251b = false;
        dVar.f3253d = true;
        dVar.f3252c = true;
        q1.a0.d((float[]) dVar.f3256g);
        q1.a0.d((float[]) dVar.f3257h);
        this.f9742f = false;
        this.f9746j = false;
        this.f9750n = q1.p0.f17566b;
        this.f9739c = nVar;
        this.f9740d = aVar;
        setInvalidated(false);
    }

    @Override // i2.o1
    public final void g(float[] fArr) {
        float[] fArrB = this.f9748l.b(this);
        if (fArrB != null) {
            q1.a0.e(fArr, fArrB);
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final r1 getContainer() {
        return this.f9738b;
    }

    public float getFrameRate() {
        return this.f9749m;
    }

    public long getLayerId() {
        return this.f9752p;
    }

    public final v getOwnerView() {
        return this.f9737a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f9737a.getUniqueDrawingId();
        }
        return -1L;
    }

    @Override // i2.o1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return this.f9748l.c(this);
    }

    @Override // i2.o1
    public final void h(q1.i0 i0Var) {
        ic.a aVar;
        int i10 = i0Var.f17520a | this.f9753q;
        if ((i10 & 4096) != 0) {
            long j10 = i0Var.f17531l;
            this.f9750n = j10;
            setPivotX(q1.p0.b(j10) * getWidth());
            setPivotY(q1.p0.c(this.f9750n) * getHeight());
        }
        if ((i10 & 1) != 0) {
            setScaleX(i0Var.f17521b);
        }
        if ((i10 & 2) != 0) {
            setScaleY(i0Var.f17522c);
        }
        if ((i10 & 4) != 0) {
            setAlpha(i0Var.f17523d);
        }
        if ((i10 & 8) != 0) {
            setTranslationX(i0Var.f17524e);
        }
        if ((i10 & 16) != 0) {
            setTranslationY(i0Var.f17525f);
        }
        if ((i10 & 32) != 0) {
            setElevation(i0Var.f17526g);
        }
        if ((i10 & 1024) != 0) {
            setRotation(i0Var.f17529j);
        }
        if ((i10 & 256) != 0) {
            setRotationX(0.0f);
        }
        if ((i10 & 512) != 0) {
            setRotationY(0.0f);
        }
        if ((i10 & 2048) != 0) {
            setCameraDistancePx(i0Var.f17530k);
        }
        boolean z10 = getManualClipPath() != null;
        boolean z11 = i0Var.f17533n;
        q1.g0 g0Var = q1.h0.f17515a;
        boolean z12 = z11 && i0Var.f17532m != g0Var;
        if ((i10 & 24576) != 0) {
            this.f9742f = z11 && i0Var.f17532m == g0Var;
            l();
            setClipToOutline(z12);
        }
        boolean zD = this.f9741e.d(i0Var.f17538s, i0Var.f17523d, z12, i0Var.f17526g, i0Var.f17534o);
        e2 e2Var = this.f9741e;
        Paint paint = null;
        if (e2Var.f9803f) {
            setOutlineProvider(e2Var.b() != null ? f9732r : null);
        }
        boolean z13 = getManualClipPath() != null;
        if (z10 != z13 || (z13 && zD)) {
            invalidate();
        }
        if (!this.f9746j && getElevation() > 0.0f && (aVar = this.f9740d) != null) {
            aVar.b();
        }
        if ((i10 & 7963) != 0) {
            this.f9748l.e();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            if ((i10 & 64) != 0) {
                setOutlineAmbientShadowColor(q1.h0.B(i0Var.f17527h));
            }
            if ((i10 & 128) != 0) {
                setOutlineSpotShadowColor(q1.h0.B(i0Var.f17528i));
            }
        }
        if (i11 >= 31 && (131072 & i10) != 0) {
            setRenderEffect(null);
        }
        boolean z14 = ((262144 & i10) == 0 && (524288 & i10) == 0) ? false : true;
        if ((i10 & 32768) != 0 || z14) {
            if (z14) {
                if (z14) {
                    p4.p pVarH = this.f9745i;
                    if (pVarH == null) {
                        pVarH = q1.h0.h();
                        this.f9745i = pVarH;
                    }
                    pVarH.j(null);
                    pVarH.h(i0Var.f17537r);
                    paint = (Paint) pVarH.f16600b;
                }
                setLayerType(2, paint);
            } else {
                setLayerType(0, null);
            }
            this.f9751o = true;
        }
        this.f9753q = i0Var.f17520a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f9751o;
    }

    @Override // i2.o1
    public final void i(long j10) {
        int i10 = (int) (j10 >> 32);
        int left = getLeft();
        c2.d dVar = this.f9748l;
        if (i10 != left) {
            offsetLeftAndRight(i10 - getLeft());
            dVar.e();
        }
        int i11 = (int) (j10 & 4294967295L);
        if (i11 != getTop()) {
            offsetTopAndBottom(i11 - getTop());
            dVar.e();
        }
    }

    @Override // android.view.View, i2.o1
    public final void invalidate() {
        if (this.f9744h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f9737a.invalidate();
    }

    @Override // i2.o1
    public final void j() {
        if (!this.f9744h || f9736v) {
            return;
        }
        l0.I(this);
        setInvalidated(false);
    }

    @Override // i2.o1
    public final void k(p1.a aVar, boolean z10) {
        c2.d dVar = this.f9748l;
        if (!z10) {
            float[] fArrC = dVar.c(this);
            if (dVar.f3253d) {
                return;
            }
            q1.a0.c(fArrC, aVar);
            return;
        }
        float[] fArrB = dVar.b(this);
        if (fArrB != null) {
            if (dVar.f3253d) {
                return;
            }
            q1.a0.c(fArrB, aVar);
        } else {
            aVar.f16477a = 0.0f;
            aVar.f16478b = 0.0f;
            aVar.f16479c = 0.0f;
            aVar.f16480d = 0.0f;
        }
    }

    public final void l() {
        Rect rect;
        if (this.f9742f) {
            Rect rect2 = this.f9743g;
            if (rect2 == null) {
                this.f9743g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                jc.l.b(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f9743g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f10) {
        this.f9749m = f10;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public void setFrameRateFromParent(boolean z10) {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
