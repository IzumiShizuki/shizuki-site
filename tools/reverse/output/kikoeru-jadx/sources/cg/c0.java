package cg;

import android.app.Activity;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import m4.y0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f4007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f4008d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(v vVar, Activity activity, int i10) {
        super(1);
        this.f4006b = i10;
        this.f4007c = vVar;
        this.f4008d = activity;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f4006b) {
            case 0:
                this.f4007c.G(((Boolean) obj).booleanValue(), false, this.f4008d);
                return ub.a0.f21526a;
            default:
                jc.l.e((x0.f0) obj, "$this$DisposableEffect");
                v vVar = this.f4007c;
                y0 y0Var = vVar.f4113b;
                dg.a aVar = vVar.f4131t;
                v4.v vVar2 = (v4.v) y0Var;
                v4.s sVar = vVar2.f22698x;
                vVar2.m2();
                SurfaceHolder holder = aVar == null ? null : aVar.getHolder();
                vVar2.m2();
                if (holder == null) {
                    vVar2.m2();
                    vVar2.Y1();
                    vVar2.f2(null);
                    vVar2.S1(0, 0);
                } else {
                    vVar2.Y1();
                    vVar2.Q = true;
                    vVar2.O = holder;
                    holder.addCallback(sVar);
                    Surface surface = holder.getSurface();
                    if (surface == null || !surface.isValid()) {
                        vVar2.f2(null);
                        vVar2.S1(0, 0);
                    } else {
                        vVar2.f2(surface);
                        Rect surfaceFrame = holder.getSurfaceFrame();
                        vVar2.S1(surfaceFrame.width(), surfaceFrame.height());
                    }
                }
                ((androidx.lifecycle.q) y0Var).y1(1.0f);
                vVar.f4126o = 1.0f;
                vVar.f4125n.setValue(Boolean.FALSE);
                Activity activity = this.f4008d;
                return new h0(vVar, activity, activity.getRequestedOrientation());
        }
    }
}
