package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j3.y f12704a = new j3.y(14);

    public static final void a(final boolean z10, final ic.a aVar, j1.q qVar, long j10, s.o1 o1Var, j3.y yVar, final f1.f fVar, x0.o oVar, final int i10, final int i11) {
        j1.q qVar2;
        int i12;
        long j11;
        final s.o1 o1Var2;
        final j3.y yVar2;
        long jFloatToRawIntBits;
        int i13;
        j3.y yVar3;
        s.o1 o1Var3;
        j3.y yVar4;
        oVar.Y(1275450738);
        int i14 = i10 | (oVar.g(z10) ? 4 : 2) | (oVar.h(aVar) ? 32 : 16);
        int i15 = i11 & 4;
        if (i15 != 0) {
            i12 = i14 | 384;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            i12 = i14 | (oVar.f(qVar2) ? 256 : 128);
        }
        int i16 = i12 | 207872;
        if (oVar.N(i16 & 1, (599187 & i16) != 599186)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                if (i15 != 0) {
                    qVar2 = j1.n.f9689a;
                }
                float f10 = 0;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f10)));
                s.o1 o1VarV = n7.b0.v(oVar);
                i13 = i16 & (-57345);
                yVar3 = f12704a;
                o1Var3 = o1VarV;
            } else {
                oVar.Q();
                i13 = i16 & (-57345);
                jFloatToRawIntBits = j10;
                o1Var3 = o1Var;
                yVar3 = yVar;
            }
            j1.q qVar3 = qVar2;
            oVar.q();
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = new r.i0(Boolean.FALSE);
                oVar.h0(objK);
            }
            r.i0 i0Var = (r.i0) objK;
            i0Var.f18457c.setValue(Boolean.valueOf(z10));
            if (((Boolean) i0Var.f18456b.getValue()).booleanValue() || ((Boolean) i0Var.f18457c.getValue()).booleanValue()) {
                oVar.W(-622275818);
                Object objK2 = oVar.K();
                if (objK2 == r0Var) {
                    objK2 = x0.v.v(new q1.p0(q1.p0.f17566b));
                    oVar.h0(objK2);
                }
                x0.w0 w0Var = (x0.w0) objK2;
                f3.c cVar = (f3.c) oVar.j(j2.l1.f9866h);
                Object objK3 = oVar.K();
                if (objK3 == r0Var) {
                    objK3 = new aa.g(w0Var, 5);
                    oVar.h0(objK3);
                }
                j11 = jFloatToRawIntBits;
                yVar4 = yVar3;
                j3.j.a(new v2(jFloatToRawIntBits, cVar, (ic.n) objK3), aVar, yVar4, f1.g.f(1788768427, new f7.n(i0Var, w0Var, o1Var3, qVar3, fVar, 1), oVar), oVar, (i13 & 112) | 3456, 0);
                oVar.p(false);
            } else {
                oVar.W(-621482032);
                oVar.p(false);
                j11 = jFloatToRawIntBits;
                yVar4 = yVar3;
            }
            yVar2 = yVar4;
            o1Var2 = o1Var3;
            qVar2 = qVar3;
        } else {
            oVar.Q();
            j11 = j10;
            o1Var2 = o1Var;
            yVar2 = yVar;
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            final j1.q qVar4 = qVar2;
            final long j12 = j11;
            p1VarR.f24421d = new ic.n(z10, aVar, qVar4, j12, o1Var2, yVar2, fVar, i10, i11) { // from class: m0.a0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f12637a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ic.a f12638b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ j1.q f12639c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f12640d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ s.o1 f12641e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ j3.y f12642f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ f1.f f12643g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f12644h;

                {
                    this.f12644h = i11;
                }

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(1572865);
                    b0.a(this.f12637a, this.f12638b, this.f12639c, this.f12640d, this.f12641e, this.f12642f, this.f12643g, (x0.o) obj, iD, this.f12644h);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(ic.a r13, j1.q r14, boolean r15, y.d1 r16, ic.o r17, x0.o r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.b0.b(ic.a, j1.q, boolean, y.d1, ic.o, x0.o, int, int):void");
    }
}
