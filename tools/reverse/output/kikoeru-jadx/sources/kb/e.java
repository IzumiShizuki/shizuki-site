package kb;

import kb.a;
import kb.b;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f11322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.C0000a f11323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b.a f11324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f11325d;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f11322a = z10;
        if (z10) {
            f11323b = a.f11316b;
            f11324c = b.f11318b;
            f11325d = d.f11320b;
        } else {
            f11323b = null;
            f11324c = null;
            f11325d = null;
        }
    }
}
