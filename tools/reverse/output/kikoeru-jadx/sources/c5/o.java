package c5;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;
import m4.o0;
import q.t0;
import r5.g0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m4.q f3519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m4.q f3520g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f3521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.q f3522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m4.q f3523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f3524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3525e;

    static {
        m4.p pVar = new m4.p();
        pVar.f14488m = o0.p("application/id3");
        f3519f = new m4.q(pVar);
        m4.p pVar2 = new m4.p();
        pVar2.f14488m = o0.p("application/x-emsg");
        f3520g = new m4.q(pVar2);
    }

    public o(h0 h0Var, int i10) {
        this.f3521a = h0Var;
        if (i10 == 1) {
            this.f3522b = f3519f;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(t0.B(i10, "Unknown metadataType: "));
            }
            this.f3522b = f3520g;
        }
        this.f3524d = new byte[0];
        this.f3525e = 0;
    }

    @Override // r5.h0
    public final void a(long j10, int i10, int i11, int i12, g0 g0Var) {
        this.f3523c.getClass();
        int i13 = this.f3525e - i12;
        p4.s sVar = new p4.s(Arrays.copyOfRange(this.f3524d, i13 - i11, i13));
        byte[] bArr = this.f3524d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.f3525e = i12;
        String str = this.f3523c.f14544n;
        m4.q qVar = this.f3522b;
        String str2 = qVar.f14544n;
        String str3 = qVar.f14544n;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.f3523c.f14544n)) {
                p4.c.B("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f3523c.f14544n);
                return;
            }
            c6.a aVarV = b6.b.V(sVar);
            m4.q qVarA = aVarV.a();
            if (qVarA == null || !Objects.equals(str3, qVarA.f14544n)) {
                p4.c.B("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + aVarV.a());
                return;
            }
            byte[] bArrC = aVarV.c();
            bArrC.getClass();
            sVar = new p4.s(bArrC);
        }
        int iA = sVar.a();
        h0 h0Var = this.f3521a;
        h0Var.e(iA, sVar);
        h0Var.a(j10, i10, iA, 0, g0Var);
    }

    @Override // r5.h0
    public final void b(m4.q qVar) {
        this.f3523c = qVar;
        this.f3521a.b(this.f3522b);
    }

    @Override // r5.h0
    public final int c(m4.i iVar, int i10, boolean z10) throws EOFException {
        int i11 = this.f3525e + i10;
        byte[] bArr = this.f3524d;
        if (bArr.length < i11) {
            this.f3524d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int i12 = iVar.read(this.f3524d, this.f3525e, i10);
        if (i12 != -1) {
            this.f3525e += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // r5.h0
    public final int d(m4.i iVar, int i10, boolean z10) {
        return c(iVar, i10, z10);
    }

    @Override // r5.h0
    public final /* synthetic */ void e(int i10, p4.s sVar) {
        t0.c(this, sVar, i10);
    }

    @Override // r5.h0
    public final void f(p4.s sVar, int i10, int i11) {
        int i12 = this.f3525e + i10;
        byte[] bArr = this.f3524d;
        if (bArr.length < i12) {
            this.f3524d = Arrays.copyOf(bArr, (i12 / 2) + i12);
        }
        sVar.e(this.f3524d, this.f3525e, i10);
        this.f3525e += i10;
    }
}
