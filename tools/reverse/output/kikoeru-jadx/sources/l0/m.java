package l0;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.a0 f11549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f11554f;

    public m(o.a0 a0Var, List list, int i10, int i11, boolean z10, r rVar) {
        this.f11549a = a0Var;
        this.f11550b = list;
        this.f11551c = i10;
        this.f11552d = i11;
        this.f11553e = z10;
        this.f11554f = rVar;
        if (list.size() > 1) {
            return;
        }
        x.a.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static void n(o.c0 c0Var, r rVar, p pVar, int i10, int i11) {
        r rVar2;
        if (rVar.f11604c) {
            rVar2 = new r(pVar.a(i11), pVar.a(i10), i11 > i10);
        } else {
            rVar2 = new r(pVar.a(i10), pVar.a(i11), i10 > i11);
        }
        if (i10 > i11) {
            x.a.c("minOffset should be less than or equal to maxOffset: " + rVar2);
        }
        long j10 = pVar.f11585a;
        int iC = c0Var.c(j10);
        Object[] objArr = c0Var.f15931c;
        Object obj = objArr[iC];
        c0Var.f15930b[iC] = j10;
        objArr[iC] = rVar2;
    }

    @Override // l0.l0
    public final boolean a() {
        return this.f11553e;
    }

    @Override // l0.l0
    public final p b() {
        return this.f11553e ? j() : f();
    }

    @Override // l0.l0
    public final r c() {
        return this.f11554f;
    }

    @Override // l0.l0
    public final p d() {
        return g() == i.f11496a ? f() : j();
    }

    @Override // l0.l0
    public final int e() {
        return this.f11552d;
    }

    @Override // l0.l0
    public final p f() {
        return (p) this.f11550b.get(p(this.f11552d, false));
    }

    @Override // l0.l0
    public final i g() {
        int i10 = this.f11551c;
        int i11 = this.f11552d;
        if (i10 < i11) {
            return i.f11497b;
        }
        if (i10 > i11) {
            return i.f11496a;
        }
        return ((p) this.f11550b.get(i10 / 2)).b();
    }

    @Override // l0.l0
    public final o.c0 h(r rVar) {
        q qVar = rVar.f11602a;
        boolean z10 = rVar.f11604c;
        long j10 = qVar.f11598c;
        int i10 = qVar.f11597b;
        q qVar2 = rVar.f11603b;
        long j11 = qVar2.f11598c;
        int i11 = qVar2.f11597b;
        if (j10 != j11) {
            o.c0 c0Var = o.q.f16031a;
            o.c0 c0Var2 = new o.c0();
            n(c0Var2, rVar, d(), (z10 ? qVar2 : qVar).f11597b, d().f11590f.f20344a.f20326a.f20320b.length());
            l(new b0.o1(this, c0Var2, rVar));
            if (!z10) {
                qVar = qVar2;
            }
            n(c0Var2, rVar, g() == i.f11496a ? j() : f(), 0, qVar.f11597b);
            return c0Var2;
        }
        if ((!z10 || i10 < i11) && (z10 || i10 > i11)) {
            x.a.c("unexpectedly miss-crossed selection: " + rVar);
        }
        long j12 = qVar.f11598c;
        o.c0 c0Var3 = o.q.f16031a;
        o.c0 c0Var4 = new o.c0();
        c0Var4.h(j12, rVar);
        return c0Var4;
    }

    @Override // l0.l0
    public final boolean i(l0 l0Var) {
        if (this.f11554f != null && l0Var != null && (l0Var instanceof m) && this.f11553e == l0Var.a() && this.f11551c == l0Var.k() && this.f11552d == l0Var.e()) {
            List list = ((m) l0Var).f11550b;
            List list2 = this.f11550b;
            if (list2.size() == list.size()) {
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    p pVar = (p) list2.get(i10);
                    p pVar2 = (p) list.get(i10);
                    if (pVar.f11585a != pVar2.f11585a || pVar.f11587c != pVar2.f11587c || pVar.f11588d != pVar2.f11588d) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // l0.l0
    public final p j() {
        return (p) this.f11550b.get(p(this.f11551c, true));
    }

    @Override // l0.l0
    public final int k() {
        return this.f11551c;
    }

    @Override // l0.l0
    public final void l(ic.k kVar) {
        int iO = o(d().f11585a);
        int iO2 = o((g() == i.f11496a ? j() : f()).f11585a);
        int i10 = iO + 1;
        if (i10 >= iO2) {
            return;
        }
        while (i10 < iO2) {
            kVar.a(this.f11550b.get(i10));
            i10++;
        }
    }

    @Override // l0.l0
    public final int m() {
        return this.f11550b.size();
    }

    public final int o(long j10) {
        try {
            return this.f11549a.c(j10);
        } catch (NoSuchElementException e10) {
            throw new IllegalStateException(j2.h0.i(j10, "Invalid selectableId: "), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i10, boolean z10) {
        int iOrdinal = g().ordinal();
        boolean z11 = z10;
        if (iOrdinal == 0) {
            z11 = !z10 ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new ce.j0();
            }
        }
        return (i10 - (!z11)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.f11553e);
        sb.append(", startPosition=");
        boolean z10 = true;
        float f10 = 2;
        sb.append((this.f11551c + 1) / f10);
        sb.append(", endPosition=");
        sb.append((this.f11552d + 1) / f10);
        sb.append(", crossed=");
        sb.append(g());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.f11550b;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = (p) list.get(i10);
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i10++;
            sb3.append(i10);
            sb3.append(" -> ");
            sb3.append(pVar);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        String string = sb2.toString();
        jc.l.d(string, "toString(...)");
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }
}
