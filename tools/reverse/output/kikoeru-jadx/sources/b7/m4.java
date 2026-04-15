package b7;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m4 implements j4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f1974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f1975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f1976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1977k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f1980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f1982e;

    static {
        int i10 = p4.c0.f16548a;
        f1972f = Integer.toString(0, 36);
        f1973g = Integer.toString(1, 36);
        f1974h = Integer.toString(2, 36);
        f1975i = Integer.toString(3, 36);
        f1976j = Integer.toString(4, 36);
        f1977k = Integer.toString(5, 36);
    }

    public m4(ComponentName componentName, int i10) {
        String packageName = componentName.getPackageName();
        Bundle bundle = Bundle.EMPTY;
        this.f1978a = i10;
        this.f1979b = TinkerReport.KEY_APPLIED_UPGRADE_FAIL;
        this.f1980c = componentName;
        this.f1981d = packageName;
        this.f1982e = bundle;
    }

    @Override // b7.j4
    public final int a() {
        return this.f1978a;
    }

    @Override // b7.j4
    public final int b() {
        return this.f1979b != 101 ? 0 : 2;
    }

    @Override // b7.j4
    public final String e() {
        return this.f1981d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        int i10 = m4Var.f1979b;
        int i11 = this.f1979b;
        if (i11 != i10) {
            return false;
        }
        if (i11 == 100) {
            int i12 = p4.c0.f16548a;
            return true;
        }
        if (i11 != 101) {
            return false;
        }
        ComponentName componentName = m4Var.f1980c;
        int i13 = p4.c0.f16548a;
        return Objects.equals(this.f1980c, componentName);
    }

    @Override // b7.j4
    public final ComponentName f() {
        return this.f1980c;
    }

    @Override // b7.j4
    public final Object g() {
        return null;
    }

    @Override // b7.j4
    public final Bundle getExtras() {
        return new Bundle(this.f1982e);
    }

    @Override // b7.j4
    public final String h() {
        ComponentName componentName = this.f1980c;
        return componentName == null ? "" : componentName.getClassName();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1979b), this.f1980c, null});
    }

    @Override // b7.j4
    public final boolean i() {
        return true;
    }

    @Override // b7.j4
    public final int j() {
        return 0;
    }

    @Override // b7.j4
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f1972f, null);
        bundle.putInt(f1973g, this.f1978a);
        bundle.putInt(f1974h, this.f1979b);
        bundle.putParcelable(f1975i, this.f1980c);
        bundle.putString(f1976j, this.f1981d);
        bundle.putBundle(f1977k, this.f1982e);
        return bundle;
    }

    @Override // b7.j4
    public final MediaSession.Token l() {
        return null;
    }

    public final String toString() {
        return "SessionToken {legacy, uid=" + this.f1978a + "}";
    }
}
