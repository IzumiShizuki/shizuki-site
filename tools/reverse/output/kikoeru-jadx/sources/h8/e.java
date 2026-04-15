package h8;

import ac.i;
import hf.y;
import ic.n;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f8214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s8.i f8215h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, s8.i iVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f8212e = i10;
        this.f8214g = hVar;
        this.f8215h = iVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f8212e) {
            case 0:
                return new e(this.f8214g, this.f8215h, cVar, 0);
            default:
                return new e(this.f8214g, this.f8215h, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f8212e) {
        }
        return ((e) o(yVar, cVar)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f8212e) {
            case 0:
                int i10 = this.f8213f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    this.f8213f = 1;
                    obj = h.a(this.f8214g, this.f8215h, 0, this);
                    zb.a aVar = zb.a.f26667a;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return obj;
            default:
                int i11 = this.f8213f;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                this.f8213f = 1;
                Object objA = h.a(this.f8214g, this.f8215h, 1, this);
                zb.a aVar2 = zb.a.f26667a;
                return objA == aVar2 ? aVar2 : objA;
        }
    }
}
