package wf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f24209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ub.p f24210b;

    public y(String str, Enum[] enumArr) {
        jc.l.e(enumArr, "values");
        this.f24209a = enumArr;
        this.f24210b = ub.a.d(new a9.d(27, this, str));
    }

    @Override // sf.a
    public final uf.g a() {
        return (uf.g) this.f24210b.getValue();
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        int iK = bVar.k(a());
        Enum[] enumArr = this.f24209a;
        if (iK >= 0 && iK < enumArr.length) {
            return enumArr[iK];
        }
        throw new sf.h(iK + " is not among valid " + a().m() + " enum values, values size is " + enumArr.length);
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        Enum r52 = (Enum) obj;
        jc.l.e(r52, "value");
        Enum[] enumArr = this.f24209a;
        int iA0 = vb.l.A0(r52, enumArr);
        if (iA0 != -1) {
            uf.g gVarA = a();
            tVar.getClass();
            jc.l.e(gVarA, "enumDescriptor");
            tVar.u(gVarA.q(iA0));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r52);
        sb.append(" is not a valid enum ");
        sb.append(a().m());
        sb.append(", must be one of ");
        String string = Arrays.toString(enumArr);
        jc.l.d(string, "toString(...)");
        sb.append(string);
        throw new sf.h(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().m() + '>';
    }
}
