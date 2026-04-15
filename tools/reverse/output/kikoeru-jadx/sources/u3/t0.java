package u3;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w0 f21332b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f21333a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f21332b = (i10 >= 34 ? new k0() : i10 >= 31 ? new j0() : i10 >= 30 ? new i0() : i10 >= 29 ? new h0() : new g0()).b().f21343a.a().f21343a.b().f21343a.c();
    }

    public t0(w0 w0Var) {
        this.f21333a = w0Var;
    }

    public w0 a() {
        return this.f21333a;
    }

    public w0 b() {
        return this.f21333a;
    }

    public w0 c() {
        return this.f21333a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return p() == t0Var.p() && o() == t0Var.o() && Objects.equals(l(), t0Var.l()) && Objects.equals(j(), t0Var.j()) && Objects.equals(f(), t0Var.f());
    }

    public c f() {
        return null;
    }

    public p3.b g(int i10) {
        return p3.b.f16524e;
    }

    public p3.b h(int i10) {
        if ((i10 & 8) == 0) {
            return p3.b.f16524e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public p3.b i() {
        return l();
    }

    public p3.b j() {
        return p3.b.f16524e;
    }

    public p3.b k() {
        return l();
    }

    public p3.b l() {
        return p3.b.f16524e;
    }

    public p3.b m() {
        return l();
    }

    public w0 n(int i10, int i11, int i12, int i13) {
        return f21332b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i10) {
        return true;
    }

    public void d(View view) {
    }

    public void e(w0 w0Var) {
    }

    public void r(p3.b[] bVarArr) {
    }

    public void s(p3.b bVar) {
    }

    public void t(w0 w0Var) {
    }

    public void u(p3.b bVar) {
    }

    public void v(int i10) {
    }
}
