package n5;

import android.net.Uri;
import j5.u;
import p4.c0;
import s4.d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15375a = u.f10444b.getAndIncrement();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.m f15376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f15378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f15379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f15380f;

    public r(s4.h hVar, s4.m mVar, int i10, q qVar) {
        this.f15378d = new d0(hVar);
        this.f15376b = mVar;
        this.f15377c = i10;
        this.f15379e = qVar;
    }

    @Override // n5.l
    public final void i() {
        this.f15378d.f19398b = 0L;
        s4.k kVar = new s4.k(this.f15378d, this.f15376b);
        try {
            kVar.b();
            Uri uriW = this.f15378d.f19397a.w();
            uriW.getClass();
            this.f15380f = this.f15379e.F0(uriW, kVar);
        } finally {
            c0.g(kVar);
        }
    }

    @Override // n5.l
    public final void l() {
    }
}
