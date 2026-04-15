package l6;

import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import java.util.UUID;
import t2.c0;
import t2.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11735a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11740f;

    public d(t2.g gVar, long j10) {
        String str = gVar.f20320b;
        ce.g gVar2 = new ce.g((byte) 0, 6);
        gVar2.f3930d = str;
        gVar2.f3928b = -1;
        gVar2.f3929c = -1;
        this.f11740f = gVar2;
        this.f11736b = k0.e(j10);
        this.f11737c = k0.d(j10);
        this.f11738d = -1;
        this.f11739e = -1;
        int iE = k0.e(j10);
        int iD = k0.d(j10);
        if (iE < 0 || iE > str.length()) {
            StringBuilder sbO = h0.o(iE, "start (", ") offset is outside of text region ");
            sbO.append(str.length());
            throw new IndexOutOfBoundsException(sbO.toString());
        }
        if (iD < 0 || iD > str.length()) {
            StringBuilder sbO2 = h0.o(iD, "end (", ") offset is outside of text region ");
            sbO2.append(str.length());
            throw new IndexOutOfBoundsException(sbO2.toString());
        }
        if (iE > iD) {
            throw new IllegalArgumentException(a0.c.I("Do not set reversed range: ", iE, iD, " > "));
        }
    }

    public void a(int i10, int i11) {
        long jB = c0.b(i10, i11);
        ((ce.g) this.f11740f).C(i10, i11, "");
        long jA0 = ua.l.a0(c0.b(this.f11736b, this.f11737c), jB);
        i(k0.e(jA0));
        g(k0.d(jA0));
        int i12 = this.f11738d;
        if (i12 != -1) {
            long jA02 = ua.l.a0(c0.b(i12, this.f11739e), jB);
            if (k0.b(jA02)) {
                this.f11738d = -1;
                this.f11739e = -1;
            } else {
                this.f11738d = k0.e(jA02);
                this.f11739e = k0.d(jA02);
            }
        }
    }

    public char b(int i10) {
        ce.g gVar = (ce.g) this.f11740f;
        m4.j jVar = (m4.j) gVar.f3931e;
        if (jVar == null) {
            return ((String) gVar.f3930d).charAt(i10);
        }
        if (i10 < gVar.f3928b) {
            return ((String) gVar.f3930d).charAt(i10);
        }
        int iD = jVar.f14296b - jVar.d();
        int i11 = gVar.f3928b;
        if (i10 >= iD + i11) {
            return ((String) gVar.f3930d).charAt(i10 - ((iD - gVar.f3929c) + i11));
        }
        int i12 = i10 - i11;
        int i13 = jVar.f14297c;
        return i12 < i13 ? ((char[]) jVar.f14299e)[i12] : ((char[]) jVar.f14299e)[(i12 - i13) + jVar.f14298d];
    }

    public k0 c() {
        int i10 = this.f11738d;
        if (i10 != -1) {
            return new k0(c0.b(i10, this.f11739e));
        }
        return null;
    }

    public void d(int i10, int i11, String str) {
        ce.g gVar = (ce.g) this.f11740f;
        if (i10 < 0 || i10 > gVar.n()) {
            StringBuilder sbO = h0.o(i10, "start (", ") offset is outside of text region ");
            sbO.append(gVar.n());
            throw new IndexOutOfBoundsException(sbO.toString());
        }
        if (i11 < 0 || i11 > gVar.n()) {
            StringBuilder sbO2 = h0.o(i11, "end (", ") offset is outside of text region ");
            sbO2.append(gVar.n());
            throw new IndexOutOfBoundsException(sbO2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a0.c.I("Do not set reversed range: ", i10, i11, " > "));
        }
        gVar.C(i10, i11, str);
        i(str.length() + i10);
        g(str.length() + i10);
        this.f11738d = -1;
        this.f11739e = -1;
    }

    public void e(int i10, int i11) {
        ce.g gVar = (ce.g) this.f11740f;
        if (i10 < 0 || i10 > gVar.n()) {
            StringBuilder sbO = h0.o(i10, "start (", ") offset is outside of text region ");
            sbO.append(gVar.n());
            throw new IndexOutOfBoundsException(sbO.toString());
        }
        if (i11 < 0 || i11 > gVar.n()) {
            StringBuilder sbO2 = h0.o(i11, "end (", ") offset is outside of text region ");
            sbO2.append(gVar.n());
            throw new IndexOutOfBoundsException(sbO2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(a0.c.I("Do not set reversed or empty range: ", i10, i11, " > "));
        }
        this.f11738d = i10;
        this.f11739e = i11;
    }

    public void f(int i10, int i11) {
        ce.g gVar = (ce.g) this.f11740f;
        if (i10 < 0 || i10 > gVar.n()) {
            StringBuilder sbO = h0.o(i10, "start (", ") offset is outside of text region ");
            sbO.append(gVar.n());
            throw new IndexOutOfBoundsException(sbO.toString());
        }
        if (i11 < 0 || i11 > gVar.n()) {
            StringBuilder sbO2 = h0.o(i11, "end (", ") offset is outside of text region ");
            sbO2.append(gVar.n());
            throw new IndexOutOfBoundsException(sbO2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(a0.c.I("Do not set reversed range: ", i10, i11, " > "));
        }
        i(i10);
        g(i11);
    }

    public void g(int i10) {
        if (!(i10 >= 0)) {
            z2.a.a("Cannot set selectionEnd to a negative value: " + i10);
        }
        this.f11737c = i10;
    }

    @Override // l6.b
    public int h() {
        return -1;
    }

    public void i(int i10) {
        if (!(i10 >= 0)) {
            z2.a.a("Cannot set selectionStart to a negative value: " + i10);
        }
        this.f11736b = i10;
    }

    @Override // l6.b
    public int m() {
        return this.f11736b;
    }

    @Override // l6.b
    public int o() {
        p4.s sVar = (p4.s) this.f11740f;
        int i10 = this.f11737c;
        if (i10 == 8) {
            return sVar.u();
        }
        if (i10 == 16) {
            return sVar.A();
        }
        int i11 = this.f11738d;
        this.f11738d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f11739e & 15;
        }
        int iU = sVar.u();
        this.f11739e = iU;
        return (iU & 240) >> 4;
    }

    public String toString() {
        switch (this.f11735a) {
            case 1:
                return ((ce.g) this.f11740f).toString();
            default:
                return super.toString();
        }
    }

    public d(int i10, int i11, int i12, int i13, int i14, byte[] bArr, UUID uuid) {
        this.f11736b = i11;
        this.f11737c = i12;
        this.f11738d = i13;
        this.f11739e = i14;
        this.f11740f = bArr;
    }

    public d(q4.c cVar) {
        p4.s sVar = cVar.f17711c;
        this.f11740f = sVar;
        sVar.G(12);
        this.f11737c = sVar.y() & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        this.f11736b = sVar.y();
    }
}
