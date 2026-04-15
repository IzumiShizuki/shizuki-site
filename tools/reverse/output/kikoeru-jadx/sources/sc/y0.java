package sc;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f19918b;

    public /* synthetic */ y0(a1 a1Var, int i10) {
        this.f19917a = i10;
        this.f19918b = a1Var;
    }

    @Override // ic.a
    public final Object b() {
        List listA0;
        bd.a0 a0VarT0;
        int i10 = this.f19917a;
        a1 a1Var = this.f19918b;
        switch (i10) {
            case 0:
                return f2.d(a1Var.a());
            default:
                yc.i0 i0VarA = a1Var.a();
                int i11 = a1Var.f19756b;
                u uVar = a1Var.f19755a;
                if (i0VarA instanceof bd.a0) {
                    yc.c cVarR = uVar.r();
                    be.c cVar = f2.f19799a;
                    if (cVarR.s0() != null) {
                        yc.k kVarY = cVarR.y();
                        jc.l.c(kVarY, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        a0VarT0 = ((yc.e) kVarY).T0();
                    } else {
                        a0VarT0 = null;
                    }
                    if (jc.l.a(a0VarT0, i0VarA) && uVar.r().j() == 2) {
                        yc.k kVarY2 = uVar.r().y();
                        jc.l.c(kVarY2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        Class clsJ = f2.j((yc.e) kVarY2);
                        if (clsJ != null) {
                            return clsJ;
                        }
                        throw new hc.a("Cannot determine receiver Java type of inherited declaration: " + i0VarA);
                    }
                }
                tc.g gVarI = uVar.i();
                if (!(gVarI instanceof tc.d0)) {
                    if (!(gVarI instanceof tc.c0)) {
                        return (Type) gVarI.a().get(i11);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((tc.c0) gVarI).f20631d.get(i11)).toArray(new Class[0]);
                    Type[] typeArr = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length = typeArr.length;
                    if (length != 0) {
                        return length != 1 ? new z0(typeArr) : (Type) vb.l.I0(typeArr);
                    }
                    throw new hc.a("Expected at least 1 type for compound type");
                }
                if (uVar.t()) {
                    tc.d0 d0Var = (tc.d0) gVarI;
                    oc.d dVarE = d0Var.e(i11 + 1);
                    int i12 = d0Var.e(0).f16308b + 1;
                    listA0 = vb.m.A0(d0Var.f20639b.a(), new oc.d(dVarE.f16307a - i12, dVarE.f16308b - i12, 1));
                } else {
                    tc.d0 d0Var2 = (tc.d0) gVarI;
                    listA0 = vb.m.A0(d0Var2.f20639b.a(), d0Var2.e(i11));
                }
                Type[] typeArr2 = (Type[]) listA0.toArray(new Type[0]);
                Type[] typeArr3 = (Type[]) Arrays.copyOf(typeArr2, typeArr2.length);
                int length2 = typeArr3.length;
                if (length2 != 0) {
                    return length2 != 1 ? new z0(typeArr3) : (Type) vb.l.I0(typeArr3);
                }
                throw new hc.a("Expected at least 1 type for compound type");
        }
    }
}
