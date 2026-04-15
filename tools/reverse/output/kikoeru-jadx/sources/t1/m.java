package t1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import c7.e1;
import j2.a3;
import q1.o;
import q1.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a3 f20243k = new a3(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1.a f20244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f20245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.b f20246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Outline f20248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f3.c f20250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f3.m f20251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ic.k f20252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f20253j;

    public m(u1.a aVar, p pVar, s1.b bVar) {
        super(aVar.getContext());
        this.f20244a = aVar;
        this.f20245b = pVar;
        this.f20246c = bVar;
        setOutlineProvider(f20243k);
        this.f20249f = true;
        this.f20250g = s1.c.f19349a;
        this.f20251h = f3.m.f6667a;
        d.f20170a.getClass();
        this.f20252i = a.f20137d;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        p pVar = this.f20245b;
        q1.b bVar = pVar.f17565a;
        Canvas canvas2 = bVar.f17490a;
        bVar.f17490a = canvas;
        f3.c cVar = this.f20250g;
        f3.m mVar = this.f20251h;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar2 = this.f20253j;
        ic.k kVar = this.f20252i;
        s1.b bVar3 = this.f20246c;
        f3.c cVarB = bVar3.S().B();
        f3.m mVarC = bVar3.S().C();
        o oVarZ = bVar3.S().z();
        long jD = bVar3.S().D();
        b bVar4 = (b) bVar3.S().f3619c;
        e1 e1VarS = bVar3.S();
        e1VarS.b0(cVar);
        e1VarS.c0(mVar);
        e1VarS.a0(bVar);
        e1VarS.e0(jFloatToRawIntBits);
        e1VarS.f3619c = bVar2;
        bVar.f();
        try {
            kVar.a(bVar3);
            bVar.r();
            e1 e1VarS2 = bVar3.S();
            e1VarS2.b0(cVarB);
            e1VarS2.c0(mVarC);
            e1VarS2.a0(oVarZ);
            e1VarS2.e0(jD);
            e1VarS2.f3619c = bVar4;
            pVar.f17565a.f17490a = canvas2;
            this.f20247d = false;
        } catch (Throwable th2) {
            bVar.r();
            e1 e1VarS3 = bVar3.S();
            e1VarS3.b0(cVarB);
            e1VarS3.c0(mVarC);
            e1VarS3.a0(oVarZ);
            e1VarS3.e0(jD);
            e1VarS3.f3619c = bVar4;
            throw th2;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f20249f;
    }

    public final p getCanvasHolder() {
        return this.f20245b;
    }

    public final View getOwnerView() {
        return this.f20244a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f20249f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f20247d) {
            return;
        }
        this.f20247d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f20249f != z10) {
            this.f20249f = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f20247d = z10;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
