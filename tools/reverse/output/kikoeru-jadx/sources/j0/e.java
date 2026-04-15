package j0;

import h0.r1;
import h0.u0;
import h0.x;
import java.io.IOException;
import java.util.List;
import t2.k0;
import ub.a0;
import x0.e1;
import y2.c0;
import y2.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f9593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(1);
        this.f9592b = i10;
        this.f9593c = fVar;
    }

    @Override // ic.k
    public final Object a(Object obj) throws IOException {
        int i10 = this.f9592b;
        boolean z10 = false;
        f fVar = this.f9593c;
        switch (i10) {
            case 0:
                e1 e1Var = fVar.f9596s.f7876t;
                Boolean bool = Boolean.TRUE;
                e1Var.setValue(bool);
                fVar.f9596s.f7875s.setValue(bool);
                f.E0(fVar, fVar.f9596s, ((t2.g) obj).f20320b, fVar.f9597t, fVar.f9598u);
                return bool;
            case 1:
                List list = (List) obj;
                if (fVar.f9596s.d() != null) {
                    r1 r1VarD = fVar.f9596s.d();
                    jc.l.b(r1VarD);
                    list.add(r1VarD.f7827a);
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                f.E0(fVar, fVar.f9596s, ((t2.g) obj).f20320b, fVar.f9597t, fVar.f9598u);
                return Boolean.TRUE;
            default:
                t2.g gVar = (t2.g) obj;
                if (fVar.f9597t || !fVar.f9598u) {
                    return Boolean.FALSE;
                }
                c0 c0Var = fVar.f9596s.f7861e;
                a0 a0Var = null;
                if (c0Var != null) {
                    List listX = ud.b.x(new y2.h(), new y2.a(gVar, 1));
                    u0 u0Var = fVar.f9596s;
                    v2.e eVar = u0Var.f7860d;
                    x xVar = u0Var.f7878v;
                    y yVarL = eVar.l(listX);
                    c0Var.a(null, yVarL);
                    xVar.a(yVarL);
                    a0Var = a0.f21526a;
                }
                if (a0Var == null) {
                    y yVar = fVar.f9595r;
                    String str = yVar.f25434a.f20320b;
                    long j10 = yVar.f25435b;
                    int i11 = k0.f20357c;
                    String string = ef.n.H0(str, (int) (j10 >> 32), (int) (j10 & 4294967295L), gVar).toString();
                    int length = gVar.f20320b.length() + ((int) (fVar.f9595r.f25435b >> 32));
                    fVar.f9596s.f7878v.a(new y(t2.c0.b(length, length), string, 4));
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, q2.k kVar) {
        super(1);
        this.f9592b = 3;
        this.f9593c = fVar;
    }
}
