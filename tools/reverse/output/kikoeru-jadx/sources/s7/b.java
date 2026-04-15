package s7;

import ac.i;
import hf.y;
import ic.n;
import java.util.Arrays;
import lf.f;
import n7.k;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f19545g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, yb.c cVar, int i10) {
        super(2, cVar);
        this.f19543e = i10;
        this.f19545g = dVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f19543e) {
            case 0:
                return new b(this.f19545g, cVar, 0);
            default:
                return new b(this.f19545g, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f19543e) {
        }
        return ((b) o(yVar, cVar)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        switch (this.f19543e) {
            case 0:
                int i10 = this.f19544f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    d dVar = this.f19545g;
                    k kVarF = dVar.f19555d.f();
                    String[] strArr = dVar.f19552a;
                    f fVarA = kVarF.a((String[]) Arrays.copyOf(strArr, strArr.length), false);
                    i7.e eVar = new i7.e(9, dVar);
                    this.f19544f = 1;
                    Object objB = ((i7.n) fVarA).b(eVar, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
            default:
                int i11 = this.f19544f;
                d dVar2 = this.f19545g;
                if (i11 == 0) {
                    ub.a.f(obj);
                    k kVarF2 = dVar2.f19555d.f();
                    String[] strArr2 = dVar2.f19552a;
                    String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    this.f19544f = 1;
                    obj = kVarF2.f15519b.e(strArr3, kVarF2.f15522e, kVarF2.f15523f, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    dVar2.f19553b.b();
                }
                return a0.f21526a;
        }
    }
}
