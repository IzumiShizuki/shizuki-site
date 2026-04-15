package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends j1.p implements i2.y1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ic.a f1303o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i1 f1304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u.e1 f1305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q2.i f1307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f1308t = new k1(this, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k1 f1309u;

    public m1(ic.a aVar, i1 i1Var, u.e1 e1Var, boolean z10) {
        this.f1303o = aVar;
        this.f1304p = i1Var;
        this.f1305q = e1Var;
        this.f1306r = z10;
        B0();
    }

    @Override // i2.y1
    public final /* synthetic */ boolean A() {
        return false;
    }

    public final void B0() {
        this.f1307s = new q2.i(new j1(this, 1), new j1(this, 2));
        this.f1309u = this.f1306r ? new k1(this, 1) : null;
    }

    @Override // i2.y1
    public final void L(q2.k kVar) {
        pc.u[] uVarArr = q2.v.f17698a;
        q2.w wVar = q2.t.f17682m;
        pc.u[] uVarArr2 = q2.v.f17698a;
        pc.u uVar = uVarArr2[6];
        wVar.a(kVar, Boolean.TRUE);
        kVar.l(q2.t.L, this.f1308t);
        if (this.f1305q == u.e1.f20882a) {
            q2.i iVar = this.f1307s;
            if (iVar == null) {
                jc.l.k("scrollAxisRange");
                throw null;
            }
            q2.w wVar2 = q2.t.f17690u;
            pc.u uVar2 = uVarArr2[12];
            wVar2.a(kVar, iVar);
        } else {
            q2.i iVar2 = this.f1307s;
            if (iVar2 == null) {
                jc.l.k("scrollAxisRange");
                throw null;
            }
            q2.w wVar3 = q2.t.f17689t;
            pc.u uVar3 = uVarArr2[11];
            wVar3.a(kVar, iVar2);
        }
        k1 k1Var = this.f1309u;
        if (k1Var != null) {
            kVar.l(q2.j.f17609f, new q2.a(null, k1Var));
        }
        kVar.l(q2.j.B, new q2.a(null, new q.a0(5, new j1(this, 0))));
        q2.b bVarE = this.f1304p.e();
        q2.w wVar4 = q2.t.f17675f;
        pc.u uVar4 = uVarArr2[22];
        wVar4.a(kVar, bVarE);
    }

    @Override // i2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean k0() {
        return false;
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }
}
