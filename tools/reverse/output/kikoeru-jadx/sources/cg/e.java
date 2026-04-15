package cg;

import android.app.Activity;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc.v f4014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jc.y f4015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc.v f4016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f4017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jc.v f4018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f4019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w0 f4020h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jc.v vVar, jc.y yVar, jc.v vVar2, Activity activity, jc.v vVar3, b bVar, w0 w0Var) {
        super(1);
        this.f4014b = vVar;
        this.f4015c = yVar;
        this.f4016d = vVar2;
        this.f4017e = activity;
        this.f4018f = vVar3;
        this.f4019g = bVar;
        this.f4020h = w0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        long j10 = ((p1.b) obj).f16481a;
        this.f4014b.f10835a = 0.0f;
        float fE = p1.b.e(j10);
        float f10 = ((int) (((f3.l) this.f4020h.getValue()).f6666a >> 32)) / 2;
        Activity activity = this.f4017e;
        jc.y yVar = this.f4015c;
        if (fE >= f10) {
            yVar.f10838a = x.f4137b;
            this.f4016d.f10835a = g8.a.M(activity);
        } else {
            yVar.f10838a = x.f4136a;
            this.f4018f.f10835a = g8.a.O(activity);
        }
        this.f4019g.a(yVar.f10838a);
        return ub.a0.f21526a;
    }
}
