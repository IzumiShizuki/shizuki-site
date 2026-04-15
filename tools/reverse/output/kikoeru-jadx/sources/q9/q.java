package q9;

import i7.f2;
import i7.h2;
import i7.i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bg.p0 f18071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bg.u f18072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bg.d f18073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bg.p f18075f;

    public q(bg.p0 p0Var, bg.u uVar, bg.d dVar, boolean z10, bg.p pVar) {
        jc.l.e(p0Var, "order");
        jc.l.e(uVar, "sort");
        this.f18071b = p0Var;
        this.f18072c = uVar;
        this.f18073d = dVar;
        this.f18074e = z10;
        this.f18075f = pVar;
    }

    @Override // i7.h2
    public final Integer a(i2 i2Var) {
        Integer numValueOf;
        Integer num;
        Integer num2;
        Integer num3 = i2Var.f9167b;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            f2 f2VarA = i2Var.a(iIntValue);
            if (f2VarA == null || (num2 = (Integer) f2VarA.f9098b) == null) {
                f2 f2VarA2 = i2Var.a(iIntValue);
                numValueOf = (f2VarA2 == null || (num = (Integer) f2VarA2.f9099c) == null) ? null : Integer.valueOf(num.intValue() - 1);
            } else {
                numValueOf = Integer.valueOf(num2.intValue() + 1);
            }
            if (numValueOf != null) {
                int iIntValue2 = numValueOf.intValue();
                return Integer.valueOf(iIntValue2 >= 1 ? iIntValue2 : 1);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i7.h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(i7.c2 r7, ac.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof q9.p
            if (r0 == 0) goto L13
            r0 = r8
            q9.p r0 = (q9.p) r0
            int r1 = r0.f18067g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18067g = r1
            goto L18
        L13:
            q9.p r0 = new q9.p
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f18065e
            int r1 = r0.f18067g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            int r7 = r0.f18064d
            ub.a.f(r8)
            goto L57
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            ub.a.f(r8)
            java.lang.Object r7 = r7.a()
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto La5
            int r7 = r7.intValue()
            pf.e r8 = hf.l0.f8566a
            pf.d r8 = pf.d.f17138c
            ba.v0 r1 = new ba.v0
            r4 = 11
            r1.<init>(r6, r7, r2, r4)
            r0.f18064d = r7
            r0.f18067g = r3
            java.lang.Object r8 = hf.a0.H(r8, r1, r0)
            zb.a r0 = zb.a.f26667a
            if (r8 != r0) goto L57
            return r0
        L57:
            ub.n r8 = (ub.n) r8
            java.lang.Object r8 = r8.f21546a
            boolean r0 = r8 instanceof ub.m
            if (r0 != 0) goto L8b
            bg.d2 r8 = (bg.d2) r8
            bg.m r0 = r8.f2861a
            int r1 = r0.f2925b
            int r4 = r0.f2924a
            int r1 = r1 * r4
            int r0 = r0.f2926c
            if (r1 >= r0) goto L6f
            r0 = 1
            goto L70
        L6f:
            r0 = 0
        L70:
            i7.f2 r1 = new i7.f2
            java.util.List r8 = r8.f2862b
            if (r7 > r3) goto L78
            r5 = r2
            goto L7f
        L78:
            int r4 = r7 + (-1)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
        L7f:
            if (r0 == 0) goto L87
            int r7 = r7 + r3
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
        L87:
            r1.<init>(r8, r5, r2)
            return r1
        L8b:
            java.lang.Throwable r7 = ub.n.a(r8)
            if (r7 == 0) goto L9d
            na.q.k(r7)
            r7.printStackTrace()
            i7.d2 r8 = new i7.d2
            r8.<init>(r7)
            return r8
        L9d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "never happen"
            r7.<init>(r8)
            throw r7
        La5:
            i7.d2 r7 = new i7.d2
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r0 = "Key is null"
            r8.<init>(r0)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.q.c(i7.c2, ac.c):java.lang.Object");
    }
}
