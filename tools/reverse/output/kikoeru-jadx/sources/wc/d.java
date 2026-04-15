package wc;

import r5.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: Fake field, exist only in values array */
    d EF5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f23504b = {new d("Function", 0), new d("SuspendFunction", 1), new d("KFunction", 2), new d("KSuspendFunction", 3), new d("UNKNOWN", 4)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f23503a = new p(11);

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f23504b.clone();
    }
}
