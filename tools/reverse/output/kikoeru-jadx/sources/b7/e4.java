package b7;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ya.a1 f1756d = ya.i0.u(40010);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ya.a1 f1757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f1760h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f1763c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        ya.q.c(7, objArr);
        f1757e = ya.i0.o(7, objArr);
        int i10 = p4.c0.f16548a;
        f1758f = Integer.toString(0, 36);
        f1759g = Integer.toString(1, 36);
        f1760h = Integer.toString(2, 36);
    }

    public e4(int i10) {
        p4.c.b("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f1761a = i10;
        this.f1762b = "";
        this.f1763c = Bundle.EMPTY;
    }

    public static e4 a(Bundle bundle) {
        int i10 = bundle.getInt(f1758f, 0);
        if (i10 != 0) {
            return new e4(i10);
        }
        String string = bundle.getString(f1759g);
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f1760h);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new e4(string, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1758f, this.f1761a);
        bundle.putString(f1759g, this.f1762b);
        bundle.putBundle(f1760h, this.f1763c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return this.f1761a == e4Var.f1761a && TextUtils.equals(this.f1762b, e4Var.f1762b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1762b, Integer.valueOf(this.f1761a)});
    }

    public e4(String str, Bundle bundle) {
        this.f1761a = 0;
        str.getClass();
        this.f1762b = str;
        bundle.getClass();
        this.f1763c = new Bundle(bundle);
    }
}
