package m4;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f14300a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f14301b = "media3.common";

    public static synchronized void a(String str) {
        if (f14300a.add(str)) {
            f14301b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f14301b;
    }
}
