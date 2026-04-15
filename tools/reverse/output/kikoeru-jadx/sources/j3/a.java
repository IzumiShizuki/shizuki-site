package j3;

import b0.h0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f10109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(s sVar, int i10) {
        super(1);
        this.f10108b = i10;
        this.f10109c = sVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f10108b) {
            case 0:
                return new h0(10, this.f10109c);
            default:
                s sVar = this.f10109c;
                if (sVar.f10166e.f10156a) {
                    sVar.f10165d.b();
                }
                return a0.f21526a;
        }
    }
}
