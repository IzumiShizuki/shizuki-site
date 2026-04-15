package o1;

import g2.f1;
import g2.g1;
import jc.y;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, int i11, Object obj) {
        super(1);
        this.f16094b = i11;
        this.f16096d = obj;
        this.f16095c = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f16094b) {
            case 0:
                y yVar = (y) this.f16096d;
                Boolean boolValueOf = Boolean.valueOf(((v) obj).F0(this.f16095c));
                yVar.f10838a = boolValueOf;
                return boolValueOf;
            default:
                ((f1) obj).h((g1) this.f16096d, 0, -this.f16095c, 0.0f);
                return a0.f21526a;
        }
    }
}
