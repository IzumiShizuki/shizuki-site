package r5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class s implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18863c;

    public /* synthetic */ s(Object obj, long j10, int i10) {
        this.f18861a = i10;
        this.f18863c = obj;
        this.f18862b = j10;
    }

    @Override // r5.b0
    public final boolean e() {
        switch (this.f18861a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // r5.b0
    public final a0 k(long j10) {
        switch (this.f18861a) {
            case 0:
                t tVar = (t) this.f18863c;
                p4.c.j(tVar.f18874k);
                m0.w wVar = tVar.f18874k;
                long[] jArr = (long[]) wVar.f13782b;
                long[] jArr2 = (long[]) wVar.f13783c;
                int iE = p4.c0.e(jArr, p4.c0.j((((long) tVar.f18868e) * j10) / 1000000, 0L, tVar.f18873j - 1), false);
                long j11 = iE == -1 ? 0L : jArr[iE];
                long j12 = iE != -1 ? jArr2[iE] : 0L;
                int i10 = tVar.f18868e;
                long j13 = (j11 * 1000000) / ((long) i10);
                long j14 = this.f18862b;
                c0 c0Var = new c0(j13, j12 + j14);
                if (j13 == j10 || iE == jArr.length - 1) {
                    return new a0(c0Var, c0Var);
                }
                int i11 = iE + 1;
                return new a0(c0Var, new c0((jArr[i11] * 1000000) / ((long) i10), j14 + jArr2[i11]));
            case 1:
                return (a0) this.f18863c;
            default:
                t5.b bVar = (t5.b) this.f18863c;
                a0 a0VarB = bVar.f20507i[0].b(j10);
                int i12 = 1;
                while (true) {
                    t5.e[] eVarArr = bVar.f20507i;
                    if (i12 >= eVarArr.length) {
                        return a0VarB;
                    }
                    a0 a0VarB2 = eVarArr[i12].b(j10);
                    if (a0VarB2.f18750a.f18785b < a0VarB.f18750a.f18785b) {
                        a0VarB = a0VarB2;
                    }
                    i12++;
                }
                break;
        }
    }

    @Override // r5.b0
    public final long m() {
        switch (this.f18861a) {
        }
        return this.f18862b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(long j10) {
        this(j10, 0L);
        this.f18861a = 1;
    }

    public s(long j10, long j11) {
        this.f18861a = 1;
        this.f18862b = j10;
        c0 c0Var = j11 == 0 ? c0.f18783c : new c0(0L, j11);
        this.f18863c = new a0(c0Var, c0Var);
    }
}
