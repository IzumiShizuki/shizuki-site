package cg;

import android.app.Activity;
import android.view.SurfaceHolder;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements x0.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f4045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f4046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4047c;

    public h0(v vVar, Activity activity, int i10) {
        this.f4045a = vVar;
        this.f4046b = activity;
        this.f4047c = i10;
    }

    @Override // x0.e0
    public final void a() {
        v vVar = this.f4045a;
        v4.v vVar2 = (v4.v) vVar.f4113b;
        vVar2.g2();
        dg.a aVar = vVar.f4131t;
        vVar2.m2();
        SurfaceHolder holder = aVar == null ? null : aVar.getHolder();
        vVar2.m2();
        if (holder != null && holder == vVar2.O) {
            vVar2.m2();
            vVar2.Y1();
            vVar2.f2(null);
            vVar2.S1(0, 0);
        }
        this.f4046b.setRequestedOrientation(this.f4047c);
    }
}
