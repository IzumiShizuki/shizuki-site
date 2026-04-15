package o1;

import g2.f1;
import g2.g1;
import g2.x0;
import java.io.Serializable;
import ub.a0;
import y.h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Serializable f16141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(v vVar, v vVar2, Object obj, int i10, cg.b bVar, int i11) {
        super(1);
        this.f16137b = i11;
        this.f16138c = vVar;
        this.f16139d = vVar2;
        this.f16142g = obj;
        this.f16140e = i10;
        this.f16141f = bVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f16137b) {
            case 0:
                g2.j jVar = (g2.j) obj;
                v vVar = (v) this.f16138c;
                v vVar2 = (v) this.f16139d;
                if (vVar != ((k) ((j2.v) i2.f.z(vVar2)).getFocusOwner()).f16104h) {
                    return Boolean.TRUE;
                }
                boolean zB = f.B(vVar2, (v) this.f16142g, this.f16140e, (cg.b) this.f16141f);
                Boolean boolValueOf = Boolean.valueOf(zB);
                if (zB || !jVar.a()) {
                    return boolValueOf;
                }
                return null;
            case 1:
                g2.j jVar2 = (g2.j) obj;
                v vVar3 = (v) this.f16138c;
                v vVar4 = (v) this.f16139d;
                if (vVar3 != ((k) ((j2.v) i2.f.z(vVar4)).getFocusOwner()).f16104h) {
                    return Boolean.TRUE;
                }
                boolean zA = f.A(this.f16140e, (cg.b) this.f16141f, vVar4, (p1.c) this.f16142g);
                Boolean boolValueOf2 = Boolean.valueOf(zA);
                if (zA || !jVar2.a()) {
                    return boolValueOf2;
                }
                return null;
            default:
                f1 f1Var = (f1) obj;
                g1[] g1VarArr = (g1[]) this.f16138c;
                y.v vVar5 = (y.v) this.f16139d;
                x0 x0Var = (x0) this.f16142g;
                int[] iArr = (int[]) this.f16141f;
                int length = g1VarArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    g1 g1Var = g1VarArr[i10];
                    int i12 = i11 + 1;
                    jc.l.b(g1Var);
                    Object objA = g1Var.A();
                    h1 h1Var = objA instanceof h1 ? (h1) objA : null;
                    f3.m layoutDirection = x0Var.getLayoutDirection();
                    y.d dVar = h1Var != null ? h1Var.f25137c : null;
                    int i13 = this.f16140e;
                    f1Var.h(g1Var, dVar != null ? dVar.f(i13 - g1Var.f7180a, layoutDirection) : vVar5.f25269b.a(0, i13 - g1Var.f7180a, layoutDirection), iArr[i11], 0.0f);
                    i10++;
                    i11 = i12;
                }
                return a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(g1[] g1VarArr, y.v vVar, int i10, x0 x0Var, int[] iArr) {
        super(1);
        this.f16137b = 2;
        this.f16138c = g1VarArr;
        this.f16139d = vVar;
        this.f16140e = i10;
        this.f16142g = x0Var;
        this.f16141f = iArr;
    }
}
