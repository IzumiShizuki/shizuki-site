package h7;

import jc.l;
import jc.u;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f8152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f8153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f8154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb.j f8156e;

    public /* synthetic */ e(u uVar, u uVar2, g gVar, boolean z10, vb.j jVar) {
        this.f8152a = uVar;
        this.f8153b = uVar2;
        this.f8154c = gVar;
        this.f8155d = z10;
        this.f8156e = jVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        e7.j jVar = (e7.j) obj;
        l.e(jVar, "entry");
        this.f8152a.f10834a = true;
        this.f8153b.f10834a = true;
        this.f8154c.m(jVar, this.f8155d, this.f8156e);
        return a0.f21526a;
    }
}
